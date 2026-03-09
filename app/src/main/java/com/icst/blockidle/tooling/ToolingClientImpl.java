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

import java.util.ArrayList;
import java.util.function.Consumer;

import com.icst.blockidle.listener.ProcessNotifier;

public class ToolingClientImpl implements IToolingClient {
	private Consumer<String> notifier;
	private static ToolingClientImpl toolingClientImpl;
	private ArrayList<ProcessNotifier> processNotifiers;

	public ToolingClientImpl() {
		processNotifiers = new ArrayList<ProcessNotifier>();
	}

	public static ToolingClientImpl getInstance() {
		if (toolingClientImpl == null) {
			toolingClientImpl = new ToolingClientImpl();
		}
		return toolingClientImpl;
	}

	public void addProcessNotifier(ProcessNotifier processNotifier) {
		processNotifiers.add(processNotifier);
	}

	public void deattachProcessNotifier(ProcessNotifier processNotifier) {
		processNotifiers.remove(processNotifier);
	}

	public void setNotifier(Consumer<String> notifier) {
		this.notifier = notifier;
	}

	@Override
	public void onBuildProgress(String msg) {
		processNotifiers.forEach(processNotifier -> {
			processNotifier.onBuildProgress(msg);
		});
	}

	@Override
	public void log(String msg) {
		if (notifier == null)
			return;
		notifier.accept(msg);
	}

	@Override
	public void gradleLog(String msg) {
		if (notifier == null)
			return;
		notifier.accept(msg);
	}
}
