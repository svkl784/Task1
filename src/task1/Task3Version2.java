package task1;

import java.util.Scanner;

public class Task3Version2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();
        if (number1 != number2 && number1 != number3 && number2 != number3) {
            System.out.print(number1 > number2 && number1 > number3 ? "Max.number 1 = " + number1 :"");
            System.out.print(number2 > number1 && number2 > number3 ? "Max.number 2 = " + number2 :"");
            System.out.print(number3 > number1 && number3 > number2 ? "Max.number 3 = " + number3 :"");
            System.out.println();
            System.out.print(number1 < number2 && number1 < number3 ? "Min.number 1 = " + number1 :"");
            System.out.print(number2 < number1 && number2 < number3 ? "Min.number 2 = " + number2 :"");
            System.out.print(number3 < number1 && number3 < number2 ? "Min.number 3 = " + number3 :"");
            System.out.println();
            System.out.println("Average = " + ((number1 + number2 + number3) / 3));
        } else {
            System.out.println("Error!You entered two identical numbers");
        }
    }
}

