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

package com.icst.blockidle.activities.project_editor;

import java.io.File;

import com.icst.blockidle.R;
import com.icst.blockidle.activities.BaseActivity;
import com.icst.blockidle.activities.project_editor.dialog.NewJavaClassDialog;
import com.icst.blockidle.activities.project_editor.java_editor.JavaFileEditorPane;
import com.icst.blockidle.activities.project_editor.viewholder.FileTreeViewHolder;
import com.icst.blockidle.bean.IDLEGradleModuleBean;
import com.icst.blockidle.databinding.ActivityProjectEditorBinding;
import com.icst.blockidle.exception.IDLEFileAlreadyExistsException;
import com.icst.blockidle.listener.ProcessNotifier;
import com.icst.blockidle.service.ToolingService;
import com.icst.blockidle.tooling.ToolingClientImpl;
import com.icst.blockidle.util.IDLEFolder;
import com.icst.blockidle.util.IDLEGradleModule;
import com.icst.blockidle.util.IDLEJavaFile;
import com.icst.blockidle.util.ProjectFile;
import com.icst.editor.widget.CodeEditorLayout;
import com.unnamed.b.atv.model.TreeNode;
import com.unnamed.b.atv.view.AndroidTreeView;
import com.unnamed.b.atv.view.TreeNodeWrapperView;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;

public class ProjectEditorActivity extends BaseActivity {

	private ActivityProjectEditorBinding binding;
	private ProjectFile projectFile;
	private IDLEFolder rootFolder;
	private IDLEGradleModule appModule;
	private IDLEFolder sourceDir;
	private IDLEFolder javaDir;
	private IDLEFolder resDir;

	private ProcessNotifier processNotifier;
	private ToolingService toolingService;
	private boolean bound = false;
	private ServiceConnection connection = new ServiceConnection() {
		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			ToolingService.ToolingBinder binder = (ToolingService.ToolingBinder) service;
			toolingService = binder.getService();
			bound = true;
			ToolingClientImpl.getInstance().addProcessNotifier(processNotifier);
			toolingService.getToolingApiServer().bindProject(projectFile.getProjectBean());
		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			bound = false;
		}
	};

	@Override
	@SuppressWarnings("deprecation")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		EdgeToEdge.enable(this);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
			projectFile = getIntent().getParcelableExtra("projectFile", ProjectFile.class);
		} else {
			projectFile = ProjectFile.class.cast(getIntent().getParcelableExtra("projectFile"));
		}

		// Create project structure folders and store their reference for creating files in them.
		rootFolder = IDLEFolder.getProjectIDLEFolder(projectFile);
		appModule = createOrExistsIDLEAppModule();
		sourceDir = createOrExistsIDLESourceDir();
		javaDir = createOrExistsIDLEJavaDir();
		resDir = createOrExistsIDLEResDir();

		try {
			appModule.createGradleFile("build.gradle");
		} catch (IDLEFileAlreadyExistsException e) {
			// Ignore if already exists
		}

		binding = ActivityProjectEditorBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());

		processNotifier = new ProcessNotifier() {
			@Override
			public void onBuildProgress(String msg) {
				runOnUiThread(() -> {
					CodeEditorLayout editor = binding.buildLogs;
					editor.insertText(msg, 0);
					editor.insertText("\n", 0);
					editor.jumpToLine(editor.getLineCount() - 1);
				});
			}
		};
		Intent intent = new Intent(this, ToolingService.class);
		bindService(intent, connection, Context.BIND_AUTO_CREATE);

		binding.toolbar.setTitle(projectFile.getProjectBean().getProjectName());
		binding.toolbar.setSubtitle(projectFile.getProjectBean().getProjectPackageName());

		setSupportActionBar(binding.toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);

		TreeNode root = TreeNode.root();
		TreeNode child = new TreeNode(rootFolder);
		child.setViewHolder(new FileTreeViewHolder(this));

		root.addChild(child);

		AndroidTreeView tView = new AndroidTreeView(this, root);
		tView.setDefaultAnimation(true);
		TreeNodeWrapperView treeWrapper = new TreeNodeWrapperView(this, com.unnamed.b.atv.R.style.TreeNodeStyle);
		treeWrapper.getNodeContainer().addView(tView.getView());

		binding.fileTreeContainer.addView(treeWrapper);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		binding = null;
		if (toolingService == null)
			return;
		if (toolingService.getToolingApiServer() == null)
			return;
		toolingService.getToolingApiServer().unbindProject();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.project_editor_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem menuItem) {
		if (R.id.add_java_class == menuItem.getItemId()) {
			new NewJavaClassDialog(this, javaDir, projectFile);
		}
		return true;
	}

	public void openJavaFile(IDLEJavaFile javaFile) {
		JavaFileEditorPane pane = new JavaFileEditorPane(this, javaFile);
		binding.workspace.openPane(pane);
	}

	private IDLEGradleModule createOrExistsIDLEAppModule() {
		File projectRootDir = new File(projectFile.getFile(), IDLEFolder.CONTENTS);
		File appModuleDir = new File(projectRootDir, "app");
		IDLEGradleModuleBean appModuleBean = new IDLEGradleModuleBean("app");
		IDLEGradleModule appModule = new IDLEGradleModule(appModuleDir, appModuleBean);
		appModule.makeDir();
		if (!appModule.exists()) {
			appModule.makeDir();
		}
		return appModule;
	}

	private IDLEFolder createOrExistsIDLESourceDir() {
		IDLEFolder mIDLEFolder = new IDLEFolder(appModule, "src");
		if (!mIDLEFolder.exists()) {
			mIDLEFolder.makeDir();
		}
		return mIDLEFolder;
	}

	private IDLEFolder createOrExistsIDLEJavaDir() {
		IDLEFolder mIDLEFolder = new IDLEFolder(sourceDir, "java");
		if (!mIDLEFolder.exists()) {
			mIDLEFolder.makeDir();
		}
		return mIDLEFolder;
	}

	private IDLEFolder createOrExistsIDLEResDir() {
		IDLEFolder mIDLEFolder = new IDLEFolder(sourceDir, "res");
		if (!mIDLEFolder.exists()) {
			mIDLEFolder.makeDir();
		}
		return mIDLEFolder;
	}
}
