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

package com.icst.blockidle.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.icst.blockidle.bean.IDLEFileBean;
import com.icst.blockidle.bean.IDLEFolderBean;
import com.icst.blockidle.bean.IDLEGradleFileBean;
import com.icst.blockidle.bean.IDLEGradleModuleBean;
import com.icst.blockidle.bean.IDLEJavaFileBean;
import com.icst.blockidle.exception.IDLEFileAlreadyExistsException;
import com.icst.blockidle.listener.SerializationListener;

/**
 * Represents a folder in the Block IDLE file system.
 * 
 * <p>This class is responsible for managing folder-related operations,
 * such as creating subfolders, listing contained files, and handling
 * serialization/deserialization of folder metadata.
 *
 * <p>Each {@code IDLEFolder} can contain {@code IDLEFile} and {@code IDLEFolder}
 * instances, which are stored within a "data" directory under the folder.
 *
 * <p>The folder metadata is serialized to a special file named "IDLEFolder",
 * and it also supports detection of Java files using the {@code IDLEJavaFileBean}
 * marker in a file named "IDLEFile".
 *
 * <p>This class extends {@code IDLEFile}, inheriting basic file utilities and
 * providing more specific logic for folder manipulation in the context of
 * the Block IDLE environment.
 */
public class IDLEFolder extends IDLEFile {

	// Contanst for contents of folder
	public static final String CONTENTS = "data";
	public static final String IDLEFOLDER = "IDLEFolder";
	public static final String IDLEFILE = "IDLEFile";

	private IDLEFileBean fileBean;

	/**
	 * Constructs an {@code IDLEFolder} from a physical directory.
	 * Attempts to deserialize metadata from the folder. If deserialization fails,
	 * a new {@code IDLEFolderBean} is created with the folder's name.
	 * Note that it will not create any physical directory until makeDir() is called.
	 *
	 * @param file The folder on disk to represent as an IDLEFolder
	 */
	public IDLEFolder(File file) {
		super(file);
		fileBean = SerializationUtils.deserialize(new File(file, IDLEFOLDER), IDLEFolderBean.class);
		if (fileBean == null) {
			fileBean = new IDLEFolderBean(file.getName());
		}
	}

	protected void setFileBean(IDLEFolderBean fileBean) {
		this.fileBean = fileBean;
	}

	/**
	 * Constructs an {@code IDLEFolder} with a specific file and associated metadata.
	 *
	 * @param file The folder location on disk
	 * @param fileBean The metadata bean describing this folder
	 */
	public IDLEFolder(File file, IDLEFolderBean fileBean) {
		super(file);
		this.fileBean = fileBean;
	}

	/**
	 * Constructs an {@code IDLEFolder} representing a subfolder of another IDLEFolder.
	 * Attempts to load metadata; falls back to a new bean if deserialization fails.
	 *
	 * @param folder The parent IDLEFolder
	 * @param subFolder The name of the subfolder
	 */
	public IDLEFolder(IDLEFolder folder, String subFolder) {
		super(new File(new File(folder.file, CONTENTS), subFolder));
		fileBean = SerializationUtils.deserialize(new File(file, IDLEFILE), IDLEFolderBean.class);
		if (fileBean == null) {
			fileBean = new IDLEFolderBean(file.getName());
		}
	}

	/**
	 * Returns the root IDLEFolder of a given project.
	 *
	 * @param projectFile The project file reference
	 * @return An {@code IDLEFolder} corresponding to the project root
	 */
	public static IDLEFolder getProjectIDLEFolder(ProjectFile projectFile) {
		return new IDLEFolder(projectFile.getFile());
	}

	/**
	 * Retrieves a list of IDLEFile instances (files or folders) contained in this folder.
	 * Only directories with valid metadata files are included.
	 *
	 * @return A list of {@code IDLEFile} objects representing child elements for IDLEFolder
	 */
	public List<IDLEFile> getFiles() {
		File contents = new File(file, CONTENTS);
		if (!contents.exists()) {
			return new ArrayList<IDLEFile>();
		}
		ArrayList<IDLEFile> filesList = new ArrayList<IDLEFile>();

		for (File file : contents.listFiles()) {

			// Direct files are not considered as IDLE files.
			if (file.isFile()) {
				continue;
			}

			File beanFile = null;
			if (new File(file, IDLEFOLDER).exists()) {
				beanFile = new File(file, IDLEFOLDER);
			} else if (new File(file, IDLEFILE).exists()) {
				beanFile = new File(file, IDLEFILE);
			}
			if (beanFile == null)
				continue;
			IDLEFileBean idleFileBean = SerializationUtils.deserialize(beanFile, IDLEFileBean.class);

			// Deserialisation failed
			if (idleFileBean == null) {
				continue;
			}

			// Warning: DO NOT USE `instanceof` because is type-casted using generics so `instanceof` will not work on it.
			if (idleFileBean.getFileType().equals(IDLEJavaFileBean.FILE_TYPE)) {
				filesList.add(new IDLEJavaFile(file));
				continue;
			}
			if (idleFileBean.getFileType().equals(IDLEGradleFileBean.FILE_TYPE)) {
				filesList.add(new IDLEGradleFile(file));
				continue;
			} else if (idleFileBean.getFileType().equals(IDLEGradleModuleBean.FILE_TYPE)) {
				filesList.add(new IDLEGradleModule(file));
				continue;
			} else if (idleFileBean.getFileType().equals(IDLEFolderBean.FILE_TYPE)) {
				filesList.add(new IDLEFolder(file));
				continue;
			} else
				filesList.add(new IDLEFile(file));

		}

		return filesList;
	}

	/**
	 * Creates the physical directory structure on disk for this IDLEFolder,
	 * including the {@code CONTENTS} subdirectory and the serialized metadata file.
	 */
	public void makeDir() {
		File idleFolderFile = new File(file, IDLEFOLDER);
		File contents = new File(file, CONTENTS);
		contents.mkdirs();
		SerializationUtils.serialize(
				fileBean,
				idleFolderFile,
				new SerializationListener() {

					@Override
					public void onSerializationSucess() {
					}

					@Override
					public void onSerializationFailed(Exception exception) {
					}
				});
	}

	/**
	 * Creates a new Java source file under this folder with the given class name.
	 * Folders and metadata are created accordingly.
	 *
	 * @param fileName The name of the Java file (also used as folder name)
	 * @param className The name of the Java class
	 * @param packageName The name of the Java class package
	 * @return An {@code IDLEJavaFile} representing the new Java file
	 * @throws IDLEFileAlreadyExistsException if a file or folder with the same name already exists
	 */
	public IDLEJavaFile createJavaFile(String fileName, String className, String packageName)
			throws IDLEFileAlreadyExistsException {
		File contents = new File(file, CONTENTS);
		File folderRoot = new File(contents, className);

		if (!folderRoot.exists()) {
			folderRoot.mkdirs();
		}

		File idleFileBeanFile = new File(folderRoot, IDLEFILE);

		if (idleFileBeanFile.exists() || new File(folderRoot, IDLEFOLDER).exists()) {
			throw new IDLEFileAlreadyExistsException();
		}

		IDLEFileBean fileBean = new IDLEJavaFileBean(fileName, className, packageName);

		SerializationUtils.serialize(
				fileBean,
				idleFileBeanFile,
				new SerializationListener() {

					@Override
					public void onSerializationSucess() {
					}

					@Override
					public void onSerializationFailed(Exception exception) {
					}
				});
		return new IDLEJavaFile(folderRoot);
	}

	public IDLEJavaFile createGradleFile(String fileName) throws IDLEFileAlreadyExistsException {
		File contents = new File(file, CONTENTS);
		File folderRoot = new File(contents, fileName);

		if (!folderRoot.exists()) {
			folderRoot.mkdirs();
		}

		File idleFileBeanFile = new File(folderRoot, IDLEFILE);

		if (idleFileBeanFile.exists() || new File(folderRoot, IDLEFOLDER).exists()) {
			throw new IDLEFileAlreadyExistsException();
		}

		IDLEFileBean fileBean = new IDLEGradleFileBean(fileName);

		SerializationUtils.serialize(
				fileBean,
				idleFileBeanFile,
				new SerializationListener() {

					@Override
					public void onSerializationSucess() {
					}

					@Override
					public void onSerializationFailed(Exception exception) {
					}
				});
		return new IDLEJavaFile(folderRoot);
	}

	/**
	 * Creates a new subfolder under this IDLEFolder and serializes its metadata.
	 *
	 * @param name The name of the subfolder to create
	 * @return A new {@code IDLEFolder} representing the created folder
	 * @throws IDLEFileAlreadyExistsException if a file or folder with the same name already exists
	 */
	public IDLEFolder createFolder(String name) throws IDLEFileAlreadyExistsException {
		File contents = new File(file, CONTENTS);
		File folderRoot = new File(contents, name);

		if (!folderRoot.exists()) {
			folderRoot.mkdirs();
		}

		File idleFolderFile = new File(folderRoot, IDLEFOLDER);

		if (idleFolderFile.exists() || new File(folderRoot, IDLEFILE).exists()) {
			throw new IDLEFileAlreadyExistsException();
		}

		IDLEFolderBean folderBean = new IDLEFolderBean(name);

		SerializationUtils.serialize(
				folderBean,
				idleFolderFile,
				new SerializationListener() {

					@Override
					public void onSerializationSucess() {
					}

					@Override
					public void onSerializationFailed(Exception exception) {
					}
				});
		return new IDLEFolder(folderRoot);
	}
}
