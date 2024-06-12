package Problem189;

public class Problem189 {
    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

    public static int[] rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);
            return nums;
        }

        public static void reverse(int[] nums, int start, int end){
            while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }