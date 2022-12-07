import java.util.Scanner;

public class naturalNoSumForLoop {
    public static void main(String[] args) {

        int sum=0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sn.nextInt();

        for (int i=1;i<=num;++i)
        {
            sum=sum+i;

        }
        System.out.println("Sum of natural number is:" +sum);
    }
}
