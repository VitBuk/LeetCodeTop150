package Problem169;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem169 {
    /*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mapOfElements = new HashMap<>();
        for (int num : nums) {
            if (!mapOfElements.containsKey(num)) mapOfElements.put(num, 1);
            else mapOfElements.put(num, mapOfElements.get(num) + 1);
        }

        return Collections.max(mapOfElements.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
