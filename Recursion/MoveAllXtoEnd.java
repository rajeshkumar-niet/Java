import java.util.Scanner;

public class MoveAllXtoEnd {
    public static void moveAllX(String str,int idx, int count, String newString){
        if(idx == str.length()){
            for (int i = 0; i < count; i++) {
                newString = newString+'x';
            }
            System.out.println("New string is : "+newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count = count+1;
        }else{
            newString = newString+currChar;
        }
        moveAllX(str, idx+1, count, newString);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        moveAllX(str, 0, 0, null);
    }
}
