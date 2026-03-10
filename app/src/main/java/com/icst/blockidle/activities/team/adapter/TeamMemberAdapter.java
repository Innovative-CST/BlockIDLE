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

package com.icst.blockidle.activities.team.adapter;

import java.util.ArrayList;
import java.util.List;

import com.bumptech.glide.Glide;
import com.google.android.material.chip.Chip;
import com.icst.blockidle.R;
import com.icst.blockidle.activities.team.model.TeamMember;
import com.icst.blockidle.databinding.AdapterTeamMemberBinding;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * RecyclerView adapter that renders each {@link TeamMember} as a Material card
 * with name, role, bio, a GitHub button, and tag chips.
 */
public class TeamMemberAdapter extends RecyclerView.Adapter<TeamMemberAdapter.TeamMemberViewHolder> {

	private static final String TAG = TeamMemberAdapter.class.getSimpleName();

	private List<TeamMember> teamMembers = new ArrayList<>();

	/**
	 * Updates the adapter dataset and refreshes the list.
	 *
	 * @param members New list of team members to display.
	 */
	public void submitList(List<TeamMember> members) {
		this.teamMembers = members != null ? members : new ArrayList<>();
		notifyDataSetChanged();
	}

	@NonNull @Override
	public TeamMemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		AdapterTeamMemberBinding binding = AdapterTeamMemberBinding.inflate(
				LayoutInflater.from(parent.getContext()), parent, false);
		return new TeamMemberViewHolder(binding);
	}

	@Override
	public void onBindViewHolder(@NonNull TeamMemberViewHolder holder, int position) {
		holder.bind(teamMembers.get(position));
	}

	@Override
	public int getItemCount() {
		return teamMembers.size();
	}

	static class TeamMemberViewHolder extends RecyclerView.ViewHolder {

		private final AdapterTeamMemberBinding binding;

		TeamMemberViewHolder(AdapterTeamMemberBinding binding) {
			super(binding.getRoot());
			this.binding = binding;
		}

		/**
		 * Binds a {@link TeamMember} to the card view.
		 *
		 * @param member The team member to display.
		 */
		void bind(TeamMember member) {
			binding.tvName.setText(member.getName());
			binding.tvRole.setText(member.getRole());
			binding.tvBio.setText(member.getBio());
			Glide
					.with(binding.getRoot().getContext())
					.load(getProfileUrl(member))
					.centerCrop()
					.placeholder(R.drawable.person)
					.into(binding.profile);

			bindTags(member, binding.getRoot().getContext());
			bindGithubButton(member, binding.getRoot().getContext());
		}

		private String getProfileUrl(TeamMember member) {
			return member.getGithub().concat(".png");
		}

		private void bindTags(TeamMember member, Context context) {
			binding.chipGroupTags.removeAllViews();
			if (member.getTags() == null)
				return;

			for (String tag : member.getTags()) {
				Chip chip = new Chip(context);
				chip.setText(tag);
				chip.setClickable(false);
				chip.setCheckable(false);
				binding.chipGroupTags.addView(chip);
			}
		}

		private void bindGithubButton(TeamMember member, Context context) {
			if (member.getGithub() == null || member.getGithub().isEmpty()) {
				binding.btnGithub.setVisibility(android.view.View.GONE);
				return;
			}

			binding.btnGithub.setVisibility(android.view.View.VISIBLE);
			binding.btnGithub.setOnClickListener(v -> {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(member.getGithub()));
				context.startActivity(intent);
			});
		}
	}
}
