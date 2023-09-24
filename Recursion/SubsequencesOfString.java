import java.util.Scanner;
public class SubsequencesOfString {
    public static void subsequences(String str, int idx, String newString){
        if (idx == str.length()){
            System.out.print(newString+"\t");
            return;
        }
        char currChar = str.charAt(idx);
        subsequences(str, idx+1, newString+currChar);
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Finding all subsequences of string .............");
        subsequences(str, 0, "");
    }
}
