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

package com.icst.blockidle.activities.crash_handler;

import com.icst.blockidle.R;
import com.icst.blockidle.activities.BaseActivity;
import com.icst.blockidle.databinding.ActivityCrashHandlerBinding;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;

public class CrashHandlerActivity extends BaseActivity {
	private ActivityCrashHandlerBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		EdgeToEdge.enable(this);
		super.onCreate(savedInstanceState);
		String error = getIntent().getStringExtra("error");

		binding = ActivityCrashHandlerBinding.inflate(getLayoutInflater());
		// set content view to binding's root.
		setContentView(binding.getRoot());

		binding.toolbar.setTitle(R.string.app_name);
		setSupportActionBar(binding.toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		binding.toolbar.setNavigationOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());
		binding.errorText.setText(error);
		binding.errorText.setOnLongClickListener(
				v -> {
					ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
					ClipData clip = ClipData.newPlainText("label", error);
					clipboard.setPrimaryClip(clip);
					return true;
				});
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		binding = null;
	}
}
