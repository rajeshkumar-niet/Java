import java.util.Scanner;

public class PrintNumber {
    public static void PrintNum(int n , int m ){
        if(n==m){
            System.out.println(n);
            return;
        }
        if(n>m){
            System.out.println("Cant do it ");
            return;
        }
        System.out.println(n);
        n = n +1;
        PrintNum(n,m);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int n = sc.nextInt();
        System.out.print("Enter ending number : ");
        int m = sc.nextInt();
        PrintNum(n,m);
        sc.close();
    }
}