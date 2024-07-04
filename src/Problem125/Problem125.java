package Problem125;

public class Problem125 {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i=0; i<(int) Math.ceil((double)s.length() / 2); i++)
            if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;

        return true;
    }
}
