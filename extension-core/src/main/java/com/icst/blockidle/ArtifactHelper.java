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
import com.icst.blockidle.bean.ArtifactBean;
import com.icst.blockidle.bean.BeanMetadata;
import com.icst.blockidle.bean.JavaImportDeclarationBean;
import java.util.HashSet;
import java.util.ArrayList;
public class ArtifactHelper {

    private static HashSet<ArtifactBean> artifacts;
	
	public static void init() {
		artifacts = new HashSet<ArtifactBean>();
	}
	
	public void addArtifacts(ArrayList<ArtifactBean> artifacts) {
		ArtifactHelper.artifacts.addAll(artifacts);
	}
	
	public static void insertArtifactBean(ArtifactBean artifact) {
	    artifacts.add(artifact);
	}
	
	public static ArrayList<BeanMetadata> getArtifacts() {
	    return new ArrayList<BeanMetadata>(artifacts);
	}

}
