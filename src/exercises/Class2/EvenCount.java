package exercises.Class2;

import java.util.ArrayList;

public class EvenCount {
    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> numberList = new ArrayList<>();
        int sum = 0;
        for (int num : nums) {
            numberList.add(num);
        }

        for (int number : numberList) {
            if (number % 2 == 0) {
                System.out.println(number);
                sum += number;
            }
        }
        System.out.println("The sum of all even numbers in the arraylist is: " + sum + ".");
    }
}
