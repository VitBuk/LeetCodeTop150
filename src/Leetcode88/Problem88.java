package Leetcode88;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem88  {
    /*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function,
but instead be stored inside the array nums1. To accommodate this,
nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.*/

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] resultNums = new int[n+m];
        int i;
        for (i=0; i<m; i++) {
            resultNums[i] = nums1[i];
        }

        for (int j=0; j<n; j++){
            resultNums[i+j]= nums2[j];
        }

        Arrays.sort(resultNums);
        return resultNums;
    }
}
