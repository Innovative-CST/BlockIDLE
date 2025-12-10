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

package com.icst.blockidle.api;

import androidx.appcompat.app.AppCompatActivity;

public class PluginActivity {
	private final AppCompatActivity appCompatActivity;
	private final String TAG;

	public PluginActivity(AppCompatActivity appCompatActivity, String TAG) {
		this.appCompatActivity = appCompatActivity;
		this.TAG = TAG;
	}

	public void log(String msg) {
		System.out.println("[Plugin] " + msg);
	}

	public AppCompatActivity getAppCompatActivity() {
		return this.appCompatActivity;
	}

	public String getTAG() {
		return this.TAG;
	}
}
