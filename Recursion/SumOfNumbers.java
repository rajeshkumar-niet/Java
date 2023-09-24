import java.util.Scanner;

public class SumOfNumbers {
    public static int NumSum(int n , int m , int sum){
        if(n>m){
            System.out.println("Not possible ");
            int zero = 0;
            return zero;
        }
        if(n==m){
            return sum+n;
        }
        sum = sum + n;
        return NumSum(n+1, m, sum);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int n = sc.nextInt();
        System.out.print("Enter ending number : ");
        int m = sc.nextInt();
        int res = NumSum(n,m,0);
        System.out.println("The sum is "+res);
        sc.close();
    }
}
