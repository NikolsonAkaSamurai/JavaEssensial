package сom.company.additional1;

import static сom.company.additional1.Calculator.*;
import static сom.company.additional1.ExceptionZero.*;
public class Main {
    public static void main(String[] args){
        double[] nums = new double[4];
        nums[0] = sum(2,2);
        nums[1] = sub(4,2);
        nums[2] = mult(3.14,18);
        nums[3] = div(250,3.14);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("попытка деления на ноль: ");
        double testExceprion = div(5,0);

    }
}
