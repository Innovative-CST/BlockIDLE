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

package com.icst.blockidle.repository;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.icst.blockidle.activities.team.model.TeamMember;

import android.content.Context;

/**
 * Repository responsible for loading team member data from the bundled team.json asset.
 */
public class TeamRepository {

	private static final String TAG = TeamRepository.class.getSimpleName();
	private static final String TEAM_JSON_FILE = "team.json";

	private final Context context;

	public TeamRepository(Context context) {
		this.context = context.getApplicationContext();
	}

	/**
	 * Reads team.json from assets and parses it into a list of {@link TeamMember}.
	 *
	 * @return Parsed list of team members, or an empty list on failure.
	 */
	public List<TeamMember> loadTeamMembers() {
		try {
			String json = readJsonFromAssets(TEAM_JSON_FILE);
			return parseTeamMembers(json);
		} catch (IOException e) {
			return new ArrayList<>();
		}
	}

	private String readJsonFromAssets(String fileName) throws IOException {
		InputStream inputStream = context.getAssets().open(fileName);
		int size = inputStream.available();
		byte[] buffer = new byte[size];
		inputStream.read(buffer);
		inputStream.close();
		return new String(buffer, StandardCharsets.UTF_8);
	}

	private List<TeamMember> parseTeamMembers(String json) {
		Gson gson = new Gson();
		Type listType = new TypeToken<List<TeamMember>>() {
		}.getType();
		return gson.fromJson(json, listType);
	}
}
