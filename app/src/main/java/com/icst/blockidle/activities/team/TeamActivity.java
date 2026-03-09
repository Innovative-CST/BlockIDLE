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

package com.icst.blockidle.activities.team;

import com.icst.blockidle.R;
import com.icst.blockidle.activities.BaseActivity;
import com.icst.blockidle.activities.team.adapter.TeamMemberAdapter;
import com.icst.blockidle.databinding.ActivityTeamBinding;
import com.icst.blockidle.viewmodel.TeamViewModel;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

/**
 * Displays the Block IDLE team members loaded from team.json via MVVM.
 * This Activity only handles UI — all data logic lives in {@link TeamViewModel}.
 */
public class TeamActivity extends BaseActivity {

	private static final String TAG = TeamActivity.class.getSimpleName();

	private ActivityTeamBinding binding;
	private TeamMemberAdapter adapter;
	private TeamViewModel teamViewModel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		EdgeToEdge.enable(this);
		super.onCreate(savedInstanceState);
		binding = ActivityTeamBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());

		applyWindowInsets();
		setupToolbar();
		setupRecyclerView();
		observeViewModel();
	}

	private void applyWindowInsets() {
		ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), (v, insets) -> {
			Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
			binding.appBarLayout.setPadding(0, systemBars.top, 0, 0);
			binding.recyclerViewTeam.setPadding(0, 0, 0, systemBars.bottom);
			return insets;
		});
	}

	private void setupToolbar() {
		setSupportActionBar(binding.toolbar);
		if (getSupportActionBar() != null) {
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
			getSupportActionBar().setTitle(R.string.title_team);
		}
		binding.toolbar.setNavigationOnClickListener(v -> finish());
	}

	private void setupRecyclerView() {
		adapter = new TeamMemberAdapter();
		binding.recyclerViewTeam.setLayoutManager(new LinearLayoutManager(this));
		binding.recyclerViewTeam.setAdapter(adapter);
	}

	private void observeViewModel() {
		teamViewModel = new ViewModelProvider(this).get(TeamViewModel.class);

		teamViewModel.getIsLoading().observe(this, isLoading -> {
			binding.progressBar.setVisibility(isLoading ? View.VISIBLE : View.GONE);
			binding.recyclerViewTeam.setVisibility(isLoading ? View.GONE : View.VISIBLE);
		});

		teamViewModel.getTeamMembers().observe(this, members -> {
			if (members == null || members.isEmpty()) {
				showEmptyState();
			} else {
				showTeamMembers();
				adapter.submitList(members);
			}
		});
	}

	private void showEmptyState() {
		binding.layoutEmpty.setVisibility(View.VISIBLE);
		binding.recyclerViewTeam.setVisibility(View.GONE);
	}

	private void showTeamMembers() {
		binding.layoutEmpty.setVisibility(View.GONE);
		binding.recyclerViewTeam.setVisibility(View.VISIBLE);
	}
}
