import java.util.Scanner;
public class Factorial1 {
    public static int fact(int n ){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int res = fact(n );
        System.out.println("The factorial of n is : "+res);
        sc.close();
    }
}
