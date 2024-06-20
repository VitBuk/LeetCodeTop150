package Problem58;

public class Problem58 {
    /*
    * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.

 */

    public static int lengthOfLastWord(String s) {
        String lastWord = "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') lastWord = "";
            else if (lastWord.equals("")) lastWord = s.substring(i);
        }

        return lastWord.length();
    }
}
