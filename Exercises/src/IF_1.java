import java.util.Scanner;

public class IF_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a number: ");
        int num = input.nextInt();

        System.out.println("Write 1 for increasing or 2 for decreasing!");
        int numCase = input.nextInt();

        switch (numCase) {
            case 1:
            System.out.println("Increasing right now!");
            for(int i = 1; i < num + 1; i++) {
                System.out.println(i);
            }
                break;
            
            case 2:
            System.out.println("Decreasing right now!");
            for(int i = num; i >= 1; i--) {
                System.out.println(i);
            }
                break;
        
            default:
                break;
        }

        input.close();
    }
}
