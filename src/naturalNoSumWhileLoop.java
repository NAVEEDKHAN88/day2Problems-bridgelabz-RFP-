// sum of natural numbers using while loop

public class naturalNoSumWhileLoop {
    public static void main(String[] args) {
        int sum=0;
        int num=5;
        int i=1;
        while (i<=num)
        {
            sum=sum+i;
            i++;
        }

        System.out.println("Sum of "+num+" Natural Numbers is = " + sum);
    }
}
