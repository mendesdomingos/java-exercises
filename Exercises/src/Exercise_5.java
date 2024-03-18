import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number:");
        int num = input.nextInt();

        System.out.println("Write another number:");
        int num2 = input.nextInt();

        int result = num * num2;

        System.out.println(result);

        input.close();
    }
}
