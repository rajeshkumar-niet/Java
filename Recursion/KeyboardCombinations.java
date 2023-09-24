import java.util.Scanner;

public class KeyboardCombinations {
    public static String keypad[] = {" ", ".","abc", "def", "ghi","jkl","mno", "pqrs","tuv","wxyz"};
    public static void printCombination(String str, int idx, String combination){
        if (idx==str.length()) {
            System.out.print(combination+"\t");
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Keypad numbers : ");
        String str = sc.nextLine();
        printCombination(str, 0, "");
        sc.close();
        
    }
}
