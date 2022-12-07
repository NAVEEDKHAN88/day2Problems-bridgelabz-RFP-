import java.util.Scanner;

public class digit_Position {

    public static void main(String[] args) {
        int   a, i = 1, counter = 0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = s.nextInt();
       int m = n;
        while(n > 0)
        {
            n = n / 10;
            counter++;
        }
        while(m > 0)
        {
            a = m % 10;
            System.out.println("Digits at position "+counter+":"+a);
            m = m / 10;
            counter--;
        }
    }
}
