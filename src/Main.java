import Problem169.Problem169;
import Problem189.Problem189;
import Problem26.Problem26;
import Problem27.Problem27;
import Problem80.Problem80;
import Problem88.Problem88;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int[] nums2 = Problem189.rotate(nums, 3);

        for (int num : nums2) {
            System.out.print(num);
        }
    }
}