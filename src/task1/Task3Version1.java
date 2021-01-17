package task1;

import java.util.Scanner;

public class Task3Version1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();
        if (number1 != number2 && number1 != number3 && number2 != number3) {
            if (number1 > number2 && number1 > number3) {
                System.out.println("Max.number 1 = " + number1);
            } else if (number2 > number1 && number2 > number3) {
                System.out.println("Max.number 2 = " + number2);
            } else if (number3 > number1 && number3 > number1) {
                System.out.println("Max.number 3 = " + number3);
            }
            if (number1 < number2 && number1 < number3) {
                System.out.println("Min.number 1 = " + number1);
            } else if (number2 < number1 && number2 < number3) {
                System.out.println("Min.number 2 = " + number2);
            } else if (number3 < number1 && number3 < number1) {
                System.out.println("Min.number 3 = " + number3);
            }
            System.out.println("Average = " + ((number1 + number2 + number3) / 3));
        } else {
            System.out.println("Error!You entered two identical numbers");
        }
    }
}
