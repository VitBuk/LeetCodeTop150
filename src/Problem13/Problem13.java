package Problem13;

import java.util.HashMap;
import java.util.Map;

public class Problem13 {
    /*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

            Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer. */

    public static int romanConverter(String roman) {
        int number = 0;
        int cipher = 0;
        int nextCipher = 0;
        for (int i=0; i<roman.length()-1; i++) {
            cipher = romanCipher(roman.substring(i,i+1));
            nextCipher = romanCipher(roman.substring(i+1, i+2));
            if (cipher < nextCipher) number -= cipher;
            else number+=cipher;
        }
        number+=romanCipher(roman.substring(roman.length()-1));

        return number;
    }
    public static int romanCipher(String romanCipher) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
        return hashMap.get(romanCipher);
    }
}
