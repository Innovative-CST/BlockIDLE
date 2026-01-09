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

public class SdkVersionUtils {

	/**
	* Compares two dot-separated numeric version strings.
	* <p>
	* Versions are compared segment by segment from left to right.
	* Missing segments are treated as {@code 0}, so {@code "1.0"} and
	* {@code "1.0.0"} are considered equal.
	* </p>
	*
	* <h3>Comparison result</h3>
	* <ul>
	*   <li>Returns {@code -1} if {@code v1} is lower than {@code v2}</li>
	*   <li>Returns {@code 0} if {@code v1} is equal to {@code v2}</li>
	*   <li>Returns {@code 1} if {@code v1} is greater than {@code v2}</li>
	* </ul>
	*
	* <h3>Examples</h3>
	* <pre>
	* compareVersions("0.0.0", "0.1.1") == -1
	* compareVersions("1.2.0", "1.1.9") == 1
	* compareVersions("1.0", "1.0.0")   == 0
	* </pre>
	*
	* @param v1 the first version string (e.g. {@code "1.2.3"})
	* @param v2 the second version string (e.g. {@code "1.3.0"})
	* @return {@code -1}, {@code 0}, or {@code 1} depending on version order
	* @throws IllegalArgumentException if either version is {@code null}
	* @throws NumberFormatException if a version segment is not numeric
	*/
	public static int compareVersions(String v1, String v2) {
		if (v1 == null || v2 == null) {
			throw new IllegalArgumentException("Version cannot be null");
		}

		String[] p1 = v1.split("\\.");
		String[] p2 = v2.split("\\.");

		int max = Math.max(p1.length, p2.length);

		for (int i = 0; i < max; i++) {
			int n1 = i < p1.length ? Integer.parseInt(p1[i]) : 0;
			int n2 = i < p2.length ? Integer.parseInt(p2[i]) : 0;

			if (n1 < n2)
				return -1;
			if (n1 > n2)
				return 1;
		}
		return 0;
	}
}
