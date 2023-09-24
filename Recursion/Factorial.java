import java.util.Scanner;

public class Factorial {
    public static int fact(int n, int f) {
        if (n == 1) {
            return f;
        }
        f = f * n;
        return fact(--n, f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int res = fact(n, 1);
        System.out.println("The factorial of n is : " + res);
        sc.close();
    }
}
