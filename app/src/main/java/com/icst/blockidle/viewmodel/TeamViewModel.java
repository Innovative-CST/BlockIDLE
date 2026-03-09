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

package com.icst.blockidle.viewmodel;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.icst.blockidle.model.TeamMember;
import com.icst.blockidle.repository.TeamRepository;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/**
 * ViewModel for TeamActivity.
 * Loads team member data off the main thread and exposes it via LiveData.
 */
public class TeamViewModel extends AndroidViewModel {

	private static final String TAG = TeamViewModel.class.getSimpleName();

	private final MutableLiveData<List<TeamMember>> teamMembers = new MutableLiveData<>();
	private final MutableLiveData<Boolean> isLoading = new MutableLiveData<>(true);
	private final TeamRepository repository;
	private final ExecutorService executor = Executors.newSingleThreadExecutor();

	public TeamViewModel(@NonNull Application application) {
		super(application);
		repository = new TeamRepository(application);
		loadTeamMembers();
	}

	/**
	 * Loads team members from the repository on a background thread.
	 */
	private void loadTeamMembers() {
		isLoading.setValue(true);
		executor.execute(() -> {
			List<TeamMember> members = repository.loadTeamMembers();
			teamMembers.postValue(members);
			isLoading.postValue(false);
		});
	}

	/**
	 * @return LiveData list of team members parsed from team.json.
	 */
	public LiveData<List<TeamMember>> getTeamMembers() {
		return teamMembers;
	}

	/**
	 * @return LiveData boolean indicating whether data is still loading.
	 */
	public LiveData<Boolean> getIsLoading() {
		return isLoading;
	}

	@Override
	protected void onCleared() {
		super.onCleared();
		executor.shutdown();
	}
}
