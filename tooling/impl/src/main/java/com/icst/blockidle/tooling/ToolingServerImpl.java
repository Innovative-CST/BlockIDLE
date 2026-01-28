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

import java.util.concurrent.CompletableFuture;

public class ToolingServerImpl implements IToolingServer {

	@Override
	public CompletableFuture<String> greet(String name) {
		return CompletableFuture.supplyAsync(() -> {
			log("Greeting " + name);
			return "Hello, " + name + " 👋";
		});
	}

	@Override
	public CompletableFuture<Integer> add(int a, int b) {
		return CompletableFuture.supplyAsync(() -> {
			log("Adding " + a + " + " + b);
			return a + b;
		});
	}

	private IToolingClient client;

	public void connect(IToolingClient client) {
		this.client = client;
		log("Server connected");
	}

	private void log(String msg) {
		if (client != null)
			client.log(msg);
	}
}