package Problem55;

import java.util.Arrays;

public class Problem55 {
    /*You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 */
    public static boolean canJump(int[] nums) {
        if (nums.length == 1 && nums[0] == 0) return true;

        int fj = 0;
        for (int i=0; i<nums.length; i+=fj) {
            fj = farestJump(Arrays.copyOfRange(nums, i, i+nums[i]));
            if (fj == 0) return false;
            if (i+fj >= nums.length) return true;
        }
        return  false;
    }

    private static int farestJump(int[] nums) {
        int farestJump = 0;
        for (int i=0; i<nums.length; i++)
            if (farestJump < nums[i] + i) farestJump = nums[i] + i;

        return farestJump;
    }
}
