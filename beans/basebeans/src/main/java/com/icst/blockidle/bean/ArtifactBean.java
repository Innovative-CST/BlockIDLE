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

package com.icst.blockidle.bean;

import java.io.Serializable;

import com.icst.blockidle.bean.utils.BeansUIDConstants;

/**
 * Represents a Maven-style artifact with metadata such as group ID, artifact ID,
 * version, repository location, and file extension.
 * <p>
 * This bean is serializable and extends {@link BeanMetadata}.
 */
public class ArtifactBean extends BeanMetadata implements Serializable {

	/**
	 * {@code serialVersionUID} for serialization compatibility with {@link ArtifactBean}.
	 */
	public static final long serialVersionUID = BeansUIDConstants.ARTIFACT_BEAN;

	// Group ID of the artifact (e.g., "com.example")
	private String groupId;

	// Artifact ID of the artifact (e.g., "my-library")
	private String artifactId;

	// Version of the artifact (e.g., "1.0.0")
	private String version;

	// Name of the repository where the artifact is hosted
	private String repositoryName;

	// URL of the repository
	private String repositoryUrl;

	// File extension of the artifact (e.g., "jar", "aar")
	private String extension;

	/**
	* Returns the group ID of the artifact (e.g., {@code "com.example"}).
	*
	* @return the group ID
	*/
	public String getGroupId() {
		return this.groupId;
	}

	/**
	 * Sets the group ID of the artifact.
	 *
	 * @param groupId the group ID to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * Returns the artifact ID of the artifact (e.g., {@code "my-library"}).
	 *
	 * @return the artifact ID
	 */
	public String getArtifactId() {
		return this.artifactId;
	}

	/**
	 * Sets the artifact ID of the artifact.
	 *
	 * @param artifactId the artifact ID to set
	 */
	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	/**
	 * Returns the version of the artifact (e.g., {@code "1.0.0"}).
	 *
	 * @return the version string
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * Sets the version of the artifact.
	 *
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Returns the name of the repository hosting the artifact.
	 *
	 * @return the repository name
	 */
	public String getRepositoryName() {
		return this.repositoryName;
	}

	/**
	 * Sets the name of the repository hosting the artifact.
	 *
	 * @param repositoryName the repository name to set
	 */
	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}

	/**
	 * Returns the URL of the repository where the artifact is located.
	 *
	 * @return the repository URL
	 */
	public String getRepositoryUrl() {
		return this.repositoryUrl;
	}

	/**
	 * Sets the URL of the repository where the artifact is located.
	 *
	 * @param repositoryUrl the repository URL to set
	 */
	public void setRepositoryUrl(String repositoryUrl) {
		this.repositoryUrl = repositoryUrl;
	}

	/**
	 * Returns the file extension of the artifact (e.g., {@code "jar"}, {@code "aar"}).
	 *
	 * @return the artifact's file extension
	 */
	public String getExtension() {
		return this.extension;
	}

	/**
	 * Sets the file extension of the artifact.
	 *
	 * @param extension the file extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}
}
