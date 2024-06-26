package Problem58;

public class Problem58 {
    /*
    * Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.

 */

    public static int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) != ' ')
                lastWordLength++;
            else if (lastWordLength != 0) break;
        }

        return lastWordLength;
    }
}
