package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int sizeList = 10;

        for (int i = 0; i < sizeList-1; i++) {
            nums.add(getRandom());
        }

        System.out.println(nums.toString());

        ListIterator<Integer> listIterator = nums.listIterator();

        while (nums.listIterator().hasNext()){
            nums.set(listIterator.nextIndex(),listIterator.next()+1);
        }


        System.out.println(nums.toString());
    }

    public static int getRandom(){
        Random rnd = new Random();
        int num = rnd.nextInt(100);
        return num;
    }
}
