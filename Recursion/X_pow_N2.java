import java.util.Scanner;
public class X_pow_N2 {
    public static int xpown(int x , int n ){
        if(n==1){
            return x;
        }
        if(x==0){
            return 0;
        }
        if (n%2==0) {
            return xpown(x, n/2)*xpown(x, n/2);
        }else{
            return x*xpown(x, n/2)*xpown(x, n/2);
        }
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
