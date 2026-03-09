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

package com.icst.blockidle.activities.project_editor.java_editor;

import com.google.android.material.tabs.TabLayoutMediator;
import com.icst.blockidle.activities.project_editor.java_editor.adapter.JavaFileEditorViewPager;
import com.icst.blockidle.databinding.PaneJavaFileEditorBinding;
import com.icst.blockidle.util.IDLEJavaFile;
import com.icst.blockidle.view.PaneView;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class JavaFileEditorPane extends LinearLayout implements PaneView {

	private AppCompatActivity activity;
	private IDLEJavaFile javaFile;
	private PaneJavaFileEditorBinding binding;

	public JavaFileEditorPane(AppCompatActivity activity, IDLEJavaFile javaFile) {
		super(activity);
		this.activity = activity;
		this.javaFile = javaFile;

		LayoutInflater inflator = LayoutInflater.from(activity);
		binding = PaneJavaFileEditorBinding.inflate(inflator);

		binding.viewpager.setAdapter(new JavaFileEditorViewPager(activity, javaFile));

		// Bind ViewPager and TabLayout
		TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
				binding.tab,
				binding.viewpager,
				(tab, position) -> {
					if (position == 0) {
						tab.setText("Variables");
					} else if (position == 1) {
						tab.setText("Events");
					}
				});
		tabLayoutMediator.attach();

		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		binding.getRoot().setLayoutParams(lp);
		addView(binding.getRoot());
	}

	@Override
	public View getView() {
		return this;
	}

	@Override
	public void onRelease() {
	}

	@Override
	public void onReleaseRequest() {
	}
}
