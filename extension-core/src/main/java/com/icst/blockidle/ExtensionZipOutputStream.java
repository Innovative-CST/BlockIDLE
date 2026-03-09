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

package com.icst.blockidle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ExtensionZipOutputStream {

	private File file;
	private FileOutputStream fos;
	private ZipOutputStream zos;

	public ExtensionZipOutputStream(File file) {
		this.file = file;
		try {
			fos = new FileOutputStream(file);
			zos = new ZipOutputStream(fos);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void writeObjectToZipEntry(String entryName, Object obj) {
		try {
			zos.putNextEntry(new ZipEntry(entryName));
			ObjectOutputStream oos = new ObjectOutputStream(zos);
			oos.writeObject(obj);
			oos.flush();
			zos.closeEntry();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void close() {
		try {
			if (zos != null)
				zos.close();
			if (fos != null)
				fos.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
