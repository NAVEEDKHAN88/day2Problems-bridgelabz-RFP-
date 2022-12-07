import java.util.Scanner;

// resverse of number using while loop

public class reverceOfNumber {
    public static void main(String[] args) {

        int reverse = 0;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int number = sn.nextInt();
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
