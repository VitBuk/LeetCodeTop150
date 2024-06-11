import Problem27.Problem27;
import Problem88.Problem88;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,3,3,2,0,1,2,2,3,0,4,2};
        int val = 2;
        int k = Problem27.removeElement(nums, val);
        System.out.println();
        System.out.print("k = " + k);
    }
}