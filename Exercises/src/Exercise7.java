import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Write a number: ");
        int num = input.nextInt();
        
        for(int i = 1; i < 11; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " +  result);
        }
        input.close();
    }
}
