package Problem28;

public class Problem28 {
    /*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/
    public static int strStr(String haystack, String needle) {
        for (int i=0; i<haystack.length()-needle.length()+1; i++)
            if (needle.equals(haystack.substring(i, i+needle.length()))) return i;

        return -1;
    }
}
