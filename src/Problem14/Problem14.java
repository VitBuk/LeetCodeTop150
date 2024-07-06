package Problem14;

public class Problem14 {
    /* Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "". */

    public static String longestCommonPrefix(String[] strs) {
        String longestCP = strs[0];
        for (int i = 1; i < strs.length; i++) {
            for (int j = strs[i].length(); j > 0; j--) {
                if (longestCP.length() > j)
                    longestCP = longestCP.substring(0, j);

                if (strs[i].length() > j)
                    strs[i] = strs[i].substring(0, j);

                if (strs[i].charAt(j - 1) != longestCP.charAt(j - 1))
                    longestCP = longestCP.substring(0, j - 1);
            }
        }

        return longestCP;
    }
}
