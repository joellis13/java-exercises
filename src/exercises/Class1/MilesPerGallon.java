package exercises.Class1;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        double miles;
        double gallons;
        Scanner in = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        miles = in.nextDouble();

        System.out.println("How many gallons of gas did you consume?");
        gallons = in.nextDouble();

        System.out.println("Using " + gallons + " of gas to drive " + miles + "miles, you got " + miles / gallons + " miles per gallon on your trip.");
    }
}
