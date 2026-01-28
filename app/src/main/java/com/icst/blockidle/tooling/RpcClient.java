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
import java.util.function.Consumer;

import org.eclipse.lsp4j.jsonrpc.Launcher;

public class RpcClient {

	private final IToolingServer server;
	private final Consumer<String> notifier;

	public RpcClient(InputStream in, OutputStream out, Consumer<String> notifier) {
		this.notifier = notifier;
		Launcher<IToolingServer> launcher = Launcher.createLauncher(
				new ClientCallbacks(notifier),
				IToolingServer.class,
				in,
				out);

		launcher.startListening();
		server = launcher.getRemoteProxy();
	}

	public void testCalls() {
		server.greet("BlockIdle")
				.thenAccept(notifier);

		server.add(2, 3)
				.thenAccept(sum -> notifier.accept("2 + 3 = " + sum));
	}

	public class ClientCallbacks implements IToolingClient {

		private final Consumer<String> notifier;

		public ClientCallbacks(Consumer<String> notifier) {
			this.notifier = notifier;
		}

		@Override
		public void log(String msg) {
			notifier.accept("[Server]: " + msg);
		}
	}
}
