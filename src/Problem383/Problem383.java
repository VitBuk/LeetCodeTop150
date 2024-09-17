package Problem383;

public class Problem383 {
    /*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.*/

    public static boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            int indexOfChar = indexOf(magazine, ransomNote.charAt(i));
            if (indexOfChar != -1) {
                StringBuilder magazineSB = new StringBuilder(magazine);
                magazineSB.delete(indexOfChar, indexOfChar+1);
                magazine = magazineSB.toString();

            } else {
                return false;
            }
        }

        return true;
    }

    private static int indexOf(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }
}
