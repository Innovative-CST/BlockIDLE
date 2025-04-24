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

package com.icst.blockidle.activities.logic_editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.zip.ZipInputStream;

import com.icst.blockidle.ExtensionZipInputStream;
import com.icst.blockidle.R;
import com.icst.blockidle.bean.BlockPaletteBean;
import com.icst.blockidle.bean.EventBean;
import com.icst.blockidle.databinding.ActivityLogicEditorBinding;
import com.icst.blockidle.util.EnvironmentUtils;
import com.icst.blockidle.util.SerializationUtils;
import com.icst.logic.config.LogicEditorConfiguration;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogicEditorActivity extends AppCompatActivity {

	public static final String EVENT_FILE_ARGUMEMT = "EventFile";

	private ActivityLogicEditorBinding binding;
	private File eventFile;
	private EventBean event;

	@Override
	@SuppressWarnings("deprecation")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		EdgeToEdge.enable(this);

		binding = ActivityLogicEditorBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());

		eventFile = new File(getIntent().getStringExtra(EVENT_FILE_ARGUMEMT));
		event = SerializationUtils.deserialize(eventFile, EventBean.class);

		ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
			Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
			return insets;
		});

		// Toolbar
		setSupportActionBar(binding.toolbar);
		Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		binding.toolbar.setTitle(R.string.app_name);

		if (event != null) {
			binding.logicEditor.openEventInCanva(event, new LogicEditorConfiguration());
		}

		ArrayList<BlockPaletteBean> mBlockPaletteBean = getBlockPaletteBeans();

		mBlockPaletteBean.removeIf(palette -> {

			palette.getBlocks().removeIf(block -> {
				return false;
			});

			if (palette.getBlocks().size() == 0) {
				return true;
			}

			return false;
		});

		binding.logicEditor.preparePallete(mBlockPaletteBean);
	}

	public ArrayList<BlockPaletteBean> getBlockPaletteBeans() {
		ArrayList<BlockPaletteBean> blockPalettes = new ArrayList<BlockPaletteBean>();

		for (File file : EnvironmentUtils.extensionsDirectory.listFiles()) {
			if (file.isDirectory())
				continue;

			try {
				FileInputStream fis = new FileInputStream(file);
				ZipInputStream zis = new ZipInputStream(fis);
				if (fis != null) {
					fis.close();
				}
				if (zis != null) {
					zis.close();
				}
			} catch (IOException e) {
				continue;
			}

			ExtensionZipInputStream extensionZipInputStream = new ExtensionZipInputStream(file);
			blockPalettes.addAll(extensionZipInputStream.getListOf(BlockPaletteBean.class));
			extensionZipInputStream.close();
		}

		return blockPalettes;
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		binding = null;
	}
}
