import Problem26.Problem26;
import Problem27.Problem27;
import Problem88.Problem88;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,1,2,2,2,2,2,2,3,3,3,4};
        int k = Problem26.removeDuplicates(nums);
        System.out.println();
        System.out.print("k = " + k);
    }
}