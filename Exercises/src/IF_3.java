import java.util.Scanner;

public class IF_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.println("Write a number: ");
        int num1 = input.nextInt();

        System.out.println("Write another number: ");
        int num2 = input.nextInt();

        for(int i = 0; i < num2; i++) {
            result += num1;
        }

        System.out.println(result);
        
        input.close();
    }

}
