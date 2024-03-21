import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number: ");
        int num1 = input.nextInt();

        System.out.println("Write another number:");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("The sum is: " + sum);
        System.out.println("The subtraction is: " + subtract);
        System.out.println("The multiple is:" + multiply);
        System.out.println("The division is: " + divide);
        System.out.println("The remainder is: " + remainder);

        input.close();
    }
}
