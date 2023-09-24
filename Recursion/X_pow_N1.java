import java.util.Scanner;
public class X_pow_N1 {
    public static int xpown(int x , int n ){
        if(n==1){
            return x;
        }
        if(x==0){
            return 0;
        }
        return x*xpown(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter X : ");
        int x = sc.nextInt();
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int result = xpown(x, n);
        System.out.println("The value of x^n is : "+result);
        sc.close();
    }
}
