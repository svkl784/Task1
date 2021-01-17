package task1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number number 1");
        double number1 = sc.nextDouble();
        System.out.println("Enter the number number 2");
        double number2 = sc.nextDouble();
        if (number1 != 0 && number2 != 0) {
            if (number2 <= (number1 + (number1 * 0.1)) && number2 >= (number1 - (number1 * 0.1))) {
                System.out.println("Number 2 is in the range");
            } else {
                System.out.println("Number 2 is not in range");
            }
        } else {
            System.out.println("You entered an invalid value 0");
        }
    }
}
