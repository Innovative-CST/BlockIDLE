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

package com.icst.blockidle.view;

import java.util.ArrayList;

import com.icst.blockidle.databinding.AdapterPaneBinding;
import com.icst.blockidle.databinding.NoPaneLayoutBinding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class WorkspaceView extends LinearLayout {

	private PaneView currentPane;

	private LinearLayout paneHolderView;

	private LinearLayout noPaneLayout;

	private final int PANE_LAYOUT = 0;
	private final int NO_PANE_LAYOUT = 1;

	public WorkspaceView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		paneHolderView = new LinearLayout(context);
		paneHolderView.setOrientation(VERTICAL);

		noPaneLayout = NoPaneLayoutBinding.inflate(LayoutInflater.from(context)).getRoot();

		noPaneLayout.setLayoutParams(new WorkspaceView.LayoutParams(WorkspaceView.LayoutParams.MATCH_PARENT,
				WorkspaceView.LayoutParams.MATCH_PARENT));
		paneHolderView.setLayoutParams(new WorkspaceView.LayoutParams(WorkspaceView.LayoutParams.MATCH_PARENT,
				WorkspaceView.LayoutParams.MATCH_PARENT));

		addView(noPaneLayout);
		addView(paneHolderView);

		showLayout(NO_PANE_LAYOUT);
	}

	private void showLayout(int layout) {
		noPaneLayout.setVisibility(layout == NO_PANE_LAYOUT ? VISIBLE : GONE);
		paneHolderView.setVisibility(layout == PANE_LAYOUT ? VISIBLE : GONE);
	}

	public void openPane(PaneView pane) {
		if (pane == null) {
			return;
		}
		currentPane = pane;
		
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		
		pane.getView().setLayoutParams(lp);
		
		if (paneHolderView.getChildAt(1) != null) {
			paneHolderView.removeViewAt(1);
		}
		paneHolderView.addView(pane.getView());
		showLayout(PANE_LAYOUT);
	}

	public void requestRelease() {
		if (currentPane == null) {
			return;
		}
		currentPane.onReleaseRequest();
	}

}
