package Problem189;

public class Problem189 {
    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

    public static int[] rotate(int[] nums, int k) {
        int[] temp = new int[k];

        System.arraycopy(nums, nums.length - k + 0, temp, 0, k);

        for (int i=0; i<nums.length - k; i++)
            nums[nums.length - 1 - i] = nums[nums.length - 1 - k - i];

        System.arraycopy(temp, 0, nums, 0, temp.length);

        return nums;
    }
}
