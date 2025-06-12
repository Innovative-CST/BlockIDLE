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

import com.icst.blockidle.activities.project_editor.java_editor.variable_manager.adapter.VariableAdapter;
import com.icst.blockidle.databinding.FragmentInstanceVariableBinding;
import com.icst.blockidle.repository.VariableRepository;
import com.icst.blockidle.util.IDLEJavaFile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

public class InstanceVariableFragment extends Fragment {

	private FragmentInstanceVariableBinding binding;
	private IDLEJavaFile javaFile;
	private VariableAdapter adapter;
	private VariableRepository variableRepository;

	public static final String IDLEJavaFileArgument = "IDLEJavaFile";

	@Override
	@SuppressWarnings("deprecation")
	@MainThread
	@Nullable public View onCreateView(LayoutInflater inflator, ViewGroup parent, Bundle bundle) {
		binding = FragmentInstanceVariableBinding.inflate(inflator);
		javaFile = getArguments().getParcelable(IDLEJavaFileArgument);
		variableRepository = new VariableRepository(javaFile);
		adapter = new VariableAdapter(variableRepository, VariableAdapter.VariableType.INSTANCE);
		binding.instanceVariableList.setLayoutManager(new LinearLayoutManager(parent.getContext()));
		binding.instanceVariableList.setAdapter(adapter);
		return binding.getRoot();
	}

	public void saveData() {
		// Todo: Save all the data of variable
	}
}
