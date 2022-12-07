import java.util.Scanner;

public class reverceNoForLoop {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int number = sn.nextInt();
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);     }
    }

