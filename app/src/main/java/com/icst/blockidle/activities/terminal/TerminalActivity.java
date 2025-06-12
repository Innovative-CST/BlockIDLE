/*
 *  This file is part of Block IDLE.
 *
 *  Block IDLE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Block IDLE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Block IDLE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.icst.blockidle.activities.terminal;

import java.io.File;
import java.util.Map;
import java.util.Objects;

import org.json.JSONException;

import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.icst.blockidle.R;
import com.icst.blockidle.databinding.ActivityTerminalBinding;
import com.icst.blockidle.terminal.KeyListener;
import com.icst.blockidle.terminal.SpecialButton;
import com.icst.blockidle.terminal.VirtualKeysConstants;
import com.icst.blockidle.terminal.VirtualKeysInfo;
import com.icst.blockidle.util.EnvironmentUtils;
import com.termux.terminal.TerminalEmulator;
import com.termux.terminal.TerminalSession;
import com.termux.terminal.TerminalSessionClient;
import com.termux.view.TerminalViewClient;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.system.ErrnoException;
import android.system.Os;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class TerminalActivity extends AppCompatActivity
		implements TerminalSessionClient, TerminalViewClient {

	private ActivityTerminalBinding binding;
	private KeyListener keyListener;
	private float terminalTextSize = 24f;

	public static final String VIRTUAL_KEYS = "["
			+ "\n  ["
			+ "\n    \"ESC\","
			+ "\n    {"
			+ "\n      \"key\": \"/\","
			+ "\n      \"popup\": \"\\\\\""
			+ "\n    },"
			+ "\n    {"
			+ "\n      \"key\": \"-\","
			+ "\n      \"popup\": \"|\""
			+ "\n    },"
			+ "\n    \"HOME\","
			+ "\n    \"UP\","
			+ "\n    \"END\","
			+ "\n    \"PGUP\""
			+ "\n  ],"
			+ "\n  ["
			+ "\n    \"TAB\","
			+ "\n    \"CTRL\","
			+ "\n    \"ALT\","
			+ "\n    \"LEFT\","
			+ "\n    \"DOWN\","
			+ "\n    \"RIGHT\","
			+ "\n    \"PGDN\""
			+ "\n  ]"
			+ "\n]";

	@Override
	protected void onCreate(Bundle bundle) {
		getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
		EdgeToEdge.enable(this);
		super.onCreate(bundle);

		binding = ActivityTerminalBinding.inflate(getLayoutInflater());
		keyListener = new KeyListener(binding.termux);

		setContentView(binding.getRoot());

		setSupportActionBar(binding.toolbar);
		Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		binding.toolbar.setNavigationOnClickListener(v -> {
			getOnBackPressedDispatcher().onBackPressed();
		});
		binding.toolbar.setTitle(R.string.app_name);

		try {
			binding.extraKeys.setVirtualKeysViewClient(keyListener);
			binding.extraKeys.reload(
					new VirtualKeysInfo(VIRTUAL_KEYS, "", VirtualKeysConstants.CONTROL_CHARS_ALIASES));
		} catch (JSONException e) {
		}

		getWindow()
				.setSoftInputMode(
						WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE
								| WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);

		if (ContextCompat.checkSelfPermission(this,
				Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
				|| ContextCompat.checkSelfPermission(this,
						Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(
					this,
					new String[] {
							Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE
					},
					1000);
		} else {
			initializeLogic();
		}
	}

	@Override
	public void onRequestPermissionsResult(
			int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}

	public void initializeLogic() {
		final File bash = new File(EnvironmentUtils.BIN_DIR, "bash");
		if ((EnvironmentUtils.PREFIX.exists()
				&& EnvironmentUtils.PREFIX.isDirectory()
				&& bash.exists()
				&& bash.isFile()
				&& bash.canExecute())) {
			setupTerminalView(false, "/data/data/com.icst.blockidle/files/usr");
		} else {
			setupTerminalView(false, "/data/data/com.icst.blockidle/files/usr");
		}
	}

	public void grantFileExecutionPermissiom(File path) {
		try {
			Os.chmod(path.getAbsolutePath(), 0700);
		} catch (ErrnoException e) {
		}
	}

	public void setupTerminalView(boolean systemShell, String cwd) {
		TerminalSession terminalSession;

		binding.termux.setTextSize((int) terminalTextSize);
		String executablePath;

		grantFileExecutionPermissiom(
				new File(EnvironmentUtils.PREFIX,
						"etc/termux/termux-bootstrap/second-stage/termux-bootstrap-second-stage.sh"));

		if (systemShell) {
			executablePath = "/system/bin/sh";
		} else {
			executablePath = EnvironmentUtils.LOGIN_SHELL.getAbsolutePath();
		}
		String[] env = null;
		String[] argsList = {};

		final Map<String, String> environment = EnvironmentUtils.getEnvironment();
		env = new String[environment.size()];
		int i = 0;
		for (Map.Entry<String, String> entry : environment.entrySet()) {
			env[i] = entry.getKey() + "=" + entry.getValue();
			i++;
		}

		terminalSession = new TerminalSession(
				executablePath,
				cwd,
				argsList,
				env,
				TerminalEmulator.DEFAULT_TERMINAL_TRANSCRIPT_ROWS,
				this);
		binding.termux.setTerminalViewClient(this);
		binding.termux.attachSession(terminalSession);
	}

	public File mkdirIfNotExits(File in) {
		if (in != null && !in.exists()) {
			in.mkdir();
		}
		if (!in.exists()) {
			if (in.setWritable(true)) {
				in.mkdirs();
			}
		}

		return in;
	}

	@Override
	public boolean onLongPress(MotionEvent arg0) {
		return false;
	}

	@Override
	public boolean readControlKey() {
		Boolean state = binding.extraKeys.readSpecialButton(SpecialButton.CTRL, true);
		return state != null && state;
	}

	@Override
	public boolean readAltKey() {
		Boolean state = binding.extraKeys.readSpecialButton(SpecialButton.ALT, true);
		return state != null && state;
	}

	@Override
	public boolean onCodePoint(int arg0, boolean arg1, TerminalSession arg2) {
		return false;
	}

	@Override
	public void onEmulatorSet() {
	}

	@Override
	public float onScale(float scale) {
		float currentTextSize = terminalTextSize;
		float newTextSize = currentTextSize * scale;
		float minTextSize = 10.0f;
		float maxTextSize = 30.0f;
		newTextSize = Math.max(minTextSize, Math.min(newTextSize, maxTextSize));
		binding.termux.setTextSize((int) newTextSize);
		terminalTextSize = newTextSize;

		if (scale < 0.9f || scale > 1.1f) {
			return 1.0f;
		}
		return scale;
	}

	@Override
	public void onSingleTapUp(MotionEvent arg0) {
		showSoftInput();
	}

	public void showSoftInput() {
		KeyboardUtils.showSoftInput(binding.termux);
	}

	@Override
	public boolean shouldBackButtonBeMappedToEscape() {
		return false;
	}

	@Override
	public boolean shouldEnforceCharBasedInput() {
		return true;
	}

	@Override
	public boolean shouldUseCtrlSpaceWorkaround() {
		return false;
	}

	@Override
	public void copyModeChanged(boolean arg0) {
	}

	@Override
	public boolean onKeyDown(int arg0, KeyEvent arg1, TerminalSession arg2) {
		if (arg0 == KeyEvent.KEYCODE_ENTER && !arg2.isRunning()) {
			finish();
			return true;
		}
		return false;
	}

	@Override
	public boolean onKeyUp(int arg0, KeyEvent arg1) {
		return false;
	}

	@Override
	public void onTextChanged(TerminalSession arg0) {
		binding.termux.onScreenUpdated();
	}

	@Override
	public void onTitleChanged(TerminalSession arg0) {
	}

	@Override
	public void onSessionFinished(TerminalSession arg0) {
	}

	@Override
	public void onBell(TerminalSession arg0) {
	}

	@Override
	public void onColorsChanged(TerminalSession arg0) {
	}

	@Override
	public void onTerminalCursorStateChange(boolean arg0) {
	}

	@Override
	public Integer getTerminalCursorStyle() {
		return TerminalEmulator.TERMINAL_CURSOR_STYLE_UNDERLINE;
	}

	@Override
	public void logError(String arg0, String arg1) {
	}

	@Override
	public void logWarn(String arg0, String arg1) {
	}

	@Override
	public void logInfo(String arg0, String arg1) {
	}

	@Override
	public void logDebug(String arg0, String arg1) {
	}

	@Override
	public void logVerbose(String arg0, String arg1) {
	}

	@Override
	public void logStackTraceWithMessage(String arg0, String arg1, Exception arg2) {
	}

	@Override
	public void logStackTrace(String arg0, Exception arg1) {
	}

	@Override
	public void onClipboardText(TerminalSession arg0, String arg1) {
		ClipboardUtils.copyText(arg1);
	}

	@Override
	public boolean readFnKey() {
		Boolean state = binding.extraKeys.readSpecialButton(SpecialButton.FN, true);
		return state != null && state;
	}

	@Override
	public boolean readShiftKey() {
		Boolean state = binding.extraKeys.readSpecialButton(SpecialButton.SHIFT, true);
		return state != null && state;
	}

	@Override
	public boolean isTerminalViewSelected() {
		return binding.termux.hasFocus();
	}

}
