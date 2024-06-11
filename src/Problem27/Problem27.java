package Problem27;

public class Problem27 {

    public static int removeElement(int[] nums, int val){
        int temp;
        int k = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == val) {
                for (int j=nums.length-1; j>0; j--) {
                    if (i > j ) break;
                    if (nums[j] != val) {
                        temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        k++;
                        break;
                    }
                }
            } else k++;
        }

        return k;
    }
}
