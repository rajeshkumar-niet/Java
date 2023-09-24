import java.util.*;

public class RemoveDuplicate {
    public static boolean[] map= new boolean[26];
    public static void removeDup(String str , int idx , String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar -'a']==true){
            removeDup(str, idx+1, newString);
        }else{
            newString = newString+currchar;
            map[currchar -'a']=true;
            removeDup(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Removing all duplicates from string ...............");
        removeDup(str, 0, "");
        sc.close();
    }
}