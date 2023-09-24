import java.util.Scanner;

public class Fibnacci {
    public static void fibonacciPrint(int a , int b , int n){
        if (n==0) {
            return;
        }
        System.out.print((a+b)+"\t");
        fibonacciPrint(b, b+a, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print(0+"\t");
        System.out.print(1+"\t");
        fibonacciPrint(0,1,n-2);
        sc.close();
    }
}