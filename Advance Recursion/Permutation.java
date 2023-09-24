import java.util.Scanner;

public class Permutation {
    public static void printPermutation(String str, String permString){
        if (str.length()==0) {
            System.out.println(permString);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            printPermutation(newstr, permString+currChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        printPermutation(str, "");
        sc.close();
        
    }
}
