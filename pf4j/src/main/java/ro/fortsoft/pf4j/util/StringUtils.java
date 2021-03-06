/*
 * Copyright 2012 Decebal Suiu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.fortsoft.pf4j.util;

/**
 * @author Decebal Suiu
 */
public class StringUtils {

	public static boolean isEmpty(String str) {
		return (str == null) || str.isEmpty();
	}

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * Format the string. Replace "{}" with %s and format the string using {@link String#format(String, Object...)}.
     */
    public static String format(String str, Object... args) {
        str = str.replaceAll("\\{}", "%s");

        return String.format(str, args);
    }

}
