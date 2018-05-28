package exercises.Class1;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        double height;
        double width;
        Scanner in = new Scanner(System.in);

        System.out.println("What is the height of the rectangle?");
        height = in.nextDouble();

        System.out.println("What is the width of the rectangle?");
        width = in.nextDouble();

        System.out.println("The area of your rectangle is: " + height * width + ".");
    }
}
