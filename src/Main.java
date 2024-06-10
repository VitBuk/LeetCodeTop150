import Leetcode88.Problem88;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,3,4};

        num1 = Problem88.merge(num1, 3, num2, 3);
        for (int i=0; i<num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}