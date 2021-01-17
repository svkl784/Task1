package task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Choice choice = new Choice();
        System.out.println("Enter #1");
        choice.number1 = sc.nextDouble();
        System.out.println("Enter #2");
        choice.number2 = sc.nextDouble();
        choice.range();
        System.out.println();
        System.out.println("Enter a number to determine the entry into the range");
        choice.number3 = sc.nextDouble();
        choice.entry();
    }

    static class Choice {
        double number1;
        double number2;
        double number3;
        final double NEGATIVE_INFINITY = -1.0 / 0.0;
        final double POSITIVE_INFINITY = 1.0 / 0.0;
        double max = 0;
        double min = 0;

        void range() {
            if (number1 > number2) {
                max = number1;
                min = number2;
                System.out.print("Range 1 from " + NEGATIVE_INFINITY + " to " + number2);
                System.out.println();
                System.out.print("Range 2 from " + number2 + " to " + number1);
                System.out.println();
                System.out.print("Range 3 from " + number1 + " to " + POSITIVE_INFINITY);
                System.out.println();
            } else if (number2 > number1) {
                max = number2;
                min = number1;
                System.out.print("Range 1 from " + NEGATIVE_INFINITY + " to " + number1);
                System.out.println();
                System.out.print("Range 2 from " + number1 + " to " + number2);
                System.out.println();
                System.out.print("Range 3 from " + number2 + " to " + POSITIVE_INFINITY);
                System.out.println();
            }
        }

        void entry() {
            if (number3 < min) {
                System.out.println("Your number is in range 1");
            } else if (number3 > min && number3 < max) {
                System.out.println("Your number is in range 2");
            } else {
                System.out.println("Your number is in range 3");
            }
        }


    }
}
