import java.util.Scanner;

public class ReverseString {
    public static void printRev(String str , int n){
        if (n==0) {
            System.out.print(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        printRev(str, n-1);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("The string is : "+str);
        System.out.println("Now Its reverse ");
        printRev(str, str.length()-1);
        sc.close();
        
    }

}