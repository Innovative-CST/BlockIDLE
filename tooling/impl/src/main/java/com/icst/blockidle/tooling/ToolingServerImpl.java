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

package com.icst.blockidle.tooling;

import com.icst.blockidle.bean.ProjectBean;

public class ToolingServerImpl implements IToolingServer {
	private boolean isProjectBound = false;

	private IToolingClient client;
	private ProjectBean project;

	public void connect(IToolingClient client) {
		this.client = client;
		log("Server connected with tooling client, waiting for project to be bound");
	}

	@Override
	public void bindProject(ProjectBean project) {
		if (project == null) {
			log("Tooling server cannot be bounded to null project.");
		}

		if (isProjectBound) {
			StringBuilder log = new StringBuilder();
			log.append("Cannot bound tooling server to ");
			log.append(project.getProjectName());
			log.append(", server is already bounded to ");
			log.append(project.getProjectName());
			log(log.toString());
			return;
		}
		this.project = project;
		isProjectBound = true;
		log("Tooling server is bounded to " + project.getProjectName());
	}

	@Override
	public void unbindProject() {
		log("Server is unbinding with project " + project.getProjectName() + "...");
		project = null;
		isProjectBound = false;
		log("Server waiting for project to be bound...");
	}

	@Override
	public void shutdown() {
		log("Shutting down server...");

		project = null;
		isProjectBound = false;
	}

	private void gradleLog(String msg) {
		if (client != null)
			client.gradleLog(msg);
	}

	private void log(String msg) {
		if (client != null)
			client.log(msg);
	}
}
