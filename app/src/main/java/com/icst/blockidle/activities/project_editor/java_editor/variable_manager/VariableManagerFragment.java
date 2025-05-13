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

package com.icst.blockidle.activities.project_editor.java_editor.variable_manager;

import com.icst.blockidle.R;
import com.icst.blockidle.databinding.FragmentVariableManagerBinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class VariableManagerFragment extends Fragment {

	private FragmentVariableManagerBinding binding;
	private StaticVariableFragment staticVariableFragment;
	private InstanceVariableFragment instanceVariableFragment;

	@Override
	@MainThread
	@Nullable public View onCreateView(LayoutInflater inflator, ViewGroup parent, Bundle bundle) {
		binding = FragmentVariableManagerBinding.inflate(inflator);

		staticVariableFragment = new StaticVariableFragment();
		instanceVariableFragment = new InstanceVariableFragment();

		binding.navigationRailView.setOnItemSelectedListener(menuItem -> {
			if (menuItem.getItemId() == R.id.action_instance_variable) {
				staticVariableFragment.saveData();
				FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
				transaction.replace(R.id.frameLayout, instanceVariableFragment);
				transaction.addToBackStack(null);
				transaction.commit();
			} else if (menuItem.getItemId() == R.id.action_static_variable) {
				instanceVariableFragment.saveData();
				FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
				transaction.replace(R.id.frameLayout, staticVariableFragment);
				transaction.addToBackStack(null);
				transaction.commit();
			}

			return true;
		});
		FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
		transaction.replace(R.id.frameLayout, staticVariableFragment);
		transaction.addToBackStack(null);
		transaction.commit();

		return binding.getRoot();
	}

}
