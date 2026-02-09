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

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.icst.blockidle.activities.project_editor.java_editor.variable_manager.adapter.VariableAdapter;
import com.icst.blockidle.activities.project_editor.java_editor.variable_manager.dialog.VariableConfigurationDialog;
import com.icst.blockidle.repository.VariableRepository;
import com.icst.blockidle.util.IDLEJavaFile;

import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseVariableManagerFragment extends Fragment {
	public static final String IDLEJavaFileArgument = "IDLEJavaFile";
	protected VariableAdapter adapter;
	private IDLEJavaFile javaFile;
	private VariableRepository variableRepository;

	public abstract FloatingActionButton getNewVariableActionButton();

	public abstract RecyclerView getVariableRecyclerView();

	public abstract VariableRepository.REPO getVariableRepo();

	public abstract VariableAdapter.VariableType getVariableType();

	public void init(ViewGroup parent) {
		this.javaFile = (IDLEJavaFile) getArguments().getParcelable("IDLEJavaFile");
		this.variableRepository = new VariableRepository(javaFile);
		this.adapter = new VariableAdapter(variableRepository, getVariableType());
		getVariableRecyclerView().setLayoutManager(new LinearLayoutManager(parent.getContext()));
		getVariableRecyclerView().setAdapter(adapter);
		getNewVariableActionButton().setOnClickListener(v -> {
			new VariableConfigurationDialog(this);
		});
	}

	public VariableRepository getVariableRepository() {
		return this.variableRepository;
	}
}
