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

package com.icst.blockidle.activities.project_editor.viewholder;

import java.util.concurrent.Executors;

import com.icst.blockidle.R;
import com.icst.blockidle.activities.project_editor.ProjectEditorActivity;
import com.icst.blockidle.databinding.ViewHolderFileTreeBinding;
import com.icst.blockidle.util.IDLEFile;
import com.icst.blockidle.util.IDLEFolder;
import com.icst.blockidle.util.IDLEJavaFile;
import com.unnamed.b.atv.model.TreeNode;

import android.view.View;
import android.widget.LinearLayout;

import androidx.transition.ChangeImageTransform;
import androidx.transition.TransitionManager;

public class FileTreeViewHolder extends TreeNode.BaseNodeViewHolder<IDLEFile> {

	private ViewHolderFileTreeBinding binding;
	private final ProjectEditorActivity activity;

	public FileTreeViewHolder(ProjectEditorActivity activity) {
		super(activity);
		this.activity = activity;
	}

	@Override
	public View createNodeView(final TreeNode node, IDLEFile value) {
		binding = ViewHolderFileTreeBinding.inflate(activity.getLayoutInflater());

		binding.expandCollapse.setVisibility(
				value instanceof IDLEFolder ? View.VISIBLE : View.GONE);

		binding.path.setText(value.getFileName());

		applyPadding(node, 16);

		if (value instanceof IDLEFolder) {
			binding.icon.setImageResource(R.drawable.folder_outline);
			updateExpandCollapseIcon(node.isExpanded());
		} else if (value instanceof IDLEJavaFile) {
			binding.icon.setImageResource(R.drawable.ic_java);
		}

		binding.getRoot().setOnClickListener(new TreeItemClickListener(value, node));

		return binding.getRoot();
	}

	public void listDirInNode(TreeNode node, IDLEFolder folder) {
		node.children.clear();
		for (IDLEFile file : folder.getFiles()) {
			TreeNode child = new TreeNode(file);
			child.setViewHolder(new FileTreeViewHolder(activity));
			node.addChild(child);
		}
	}

	public void updateExpandCollapseIcon(boolean isExpanded) {
		TransitionManager.beginDelayedTransition(binding.getRoot(), new ChangeImageTransform());
		binding.expandCollapse.setImageResource(
				isExpanded ? R.drawable.menu_down_outline : R.drawable.menu_right_outline);
	}

	private LinearLayout applyPadding(final TreeNode node, final int padding) {
		binding.getRoot()
				.setPaddingRelative(
						binding.getRoot().getPaddingLeft() + (padding * (node.getLevel() - 1)),
						binding.getRoot().getPaddingTop(),
						binding.getRoot().getPaddingRight(),
						binding.getRoot().getPaddingBottom());
		return binding.getRoot();
	}

	private class TreeItemClickListener implements View.OnClickListener {
		private IDLEFile value;
		private TreeNode node;

		public TreeItemClickListener(IDLEFile value, TreeNode node) {
			this.value = value;
			this.node = node;
		}

		@Override
		public void onClick(View view) {
			if (value instanceof IDLEFolder idleFolder) {
				if (node.isExpanded()) {
					getTreeView().collapseNode(node);
					updateExpandCollapseIcon(node.isExpanded());
				} else {
					Executors.newSingleThreadExecutor()
							.execute(
									() -> {
										activity.runOnUiThread(
												() -> {
													binding.viewFlipper.setDisplayedChild(1);
												});

										listDirInNode(node, idleFolder);

										activity.runOnUiThread(
												() -> {
													binding.viewFlipper.setDisplayedChild(0);
													getTreeView().expandNode(node);
													updateExpandCollapseIcon(node.isExpanded());
												});
									});
				}
			} else if (value instanceof IDLEJavaFile javaFile) {
				activity.openJavaFile(javaFile);
			}
		}
	}
}
