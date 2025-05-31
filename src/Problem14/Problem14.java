package Problem14;

public class Problem14 {
    /* Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "". */

    public static String longestCommonPrefix(String[] strs) {
        int shortestString = longestString(strs);
        int longestPrefix = 0;

        for (int i=0; i<shortestString; i++) {
            if (isCommonSymbol(strs, i)) {
                longestPrefix++;
            } else break;
        }

        return strs[0].substring(0, longestPrefix);
    }

    private static boolean isCommonSymbol(String[] strs, int position) {
        char symbol = strs[0].charAt(position);
        boolean isSame = true;
        for (String s : strs) {
            if (position > s.length()) {
                return false;
            }

            if (s.charAt(position) != symbol) {
                return false;
            }
        }

        for (String s: strs) {
            System.out.println(s.charAt(position));
        }
        return true;
    }
    private static int longestString(String[] strs) {
        int shortest = Integer.MAX_VALUE;
        for (String s : strs) {
            if (shortest > s.length()) {
                shortest = s.length();
            }
        }

        return shortest;
    }
}
