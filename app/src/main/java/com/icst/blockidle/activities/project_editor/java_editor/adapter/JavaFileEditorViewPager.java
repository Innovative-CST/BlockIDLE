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

package com.icst.blockidle.activities.project_editor.java_editor.adapter;

import java.util.ArrayList;

import com.icst.blockidle.activities.project_editor.java_editor.event_manager.EventManagerFragment;
import com.icst.blockidle.util.IDLEJavaFile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class JavaFileEditorViewPager extends FragmentStateAdapter {

	private ArrayList<Fragment> fragments;

	public JavaFileEditorViewPager(AppCompatActivity activity, IDLEJavaFile javaFile) {
		super(activity);

		fragments = new ArrayList<Fragment>();
		fragments.add(new EventManagerFragment()); // For Events
	}

	@Override
	public int getItemCount() {
		return fragments.size();
	}

	@Override
	public Fragment createFragment(int position) {
		return fragments.get(position);
	}

}
