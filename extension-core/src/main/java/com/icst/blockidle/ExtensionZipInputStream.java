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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ExtensionZipInputStream {

	private File file;
	private FileInputStream fis;
	private ZipInputStream zis;

	public ExtensionZipInputStream(File file) {
		this.file = file;
		try {
			fis = new FileInputStream(file);
			zis = new ZipInputStream(fis);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public Object readObjectFromZipEntry(String entryName) {
		try {
			ZipEntry entry;
			while ((entry = zis.getNextEntry()) != null) {
				if (entry.getName().equals(entryName)) {
					ObjectInputStream ois = new ObjectInputStream(zis);
					Object obj = ois.readObject();
					zis.closeEntry();
					return obj;
				} else {
					zis.closeEntry();
				}
			}
		} catch (IOException | ClassNotFoundException e) {
		}
		return null;
	}

	public void close() {
		try {
			if (zis != null)
				zis.close();
			if (fis != null)
				fis.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}