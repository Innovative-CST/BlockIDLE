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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.eclipse.lsp4j.jsonrpc.Launcher;

public class Main {

	public static void main(String[] args) {
		ToolingServerImpl server = new ToolingServerImpl();

		InputStream in = System.in;
		OutputStream out = System.out;

		Launcher<IToolingClient> launcher = Launcher.createLauncher(
				server,
				IToolingClient.class,
				in,
				out);

		IToolingClient client = launcher.getRemoteProxy();
		client.log("Tooling server started and will run until shutdown is received");
		server.connect(client);

		Future<Void> future = launcher.startListening();

		try {
			future.get();
		} catch (InterruptedException e) {
			client.log("Shutting down server, error has occurred and shutdown message is not received.");
		} catch (ExecutionException e) {
			client.log("Shutting down server, error has occurred and shutdown message is not received.");
		} finally {
			server.shutdown();
		}
	}
}
