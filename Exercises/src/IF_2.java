import java.util.Scanner;

public class IF_2  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.println("Write a number here: ");
        int num = input.nextInt();

        for(int i = 0; i <= num; i++) {
            count += i;   
        }
        
        System.out.println(count);
        input.close();
    }
}