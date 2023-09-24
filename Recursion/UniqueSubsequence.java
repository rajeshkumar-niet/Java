import java.util.HashSet;
import java.util.Scanner;
public class UniqueSubsequence {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set){
        if (idx == str.length()){
            if (set.contains(newString)) {
                return;
            } else {
                System.out.print(newString+"\t");
                set.add(newString);
            }
            return;
        }
        char currChar = str.charAt(idx);
        subsequences(str, idx+1, newString+currChar, set);
        subsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Finding all subsequences of string .............");
        subsequences(str, 0, "",set);
        sc.close();
    }
}
