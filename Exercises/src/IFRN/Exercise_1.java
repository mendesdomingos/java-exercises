package IFRN;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write your age: ");
        int age = input.nextInt();

        int months = age * 12;
        int days = months * 30;

        System.out.printf("It's been %d years, %d months and %d days. \n", age, months, days);

        input.close();
    }
}
