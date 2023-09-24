import java.util.Scanner;

public class First_and_Last_occurance {

    public static int first = -1;
    public static int last = -1;
    public static void find(String str, int idx, char ele){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if(curr==ele){
            if(first==-1){
                first = idx;
            }else{
                last = idx;
            }
        }
        find(str, idx+1, ele);

    }
    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("String is : "+str+"\nEnter charactor you want to find occurance : ");
        String element = sc.next();
        char ele = element.charAt(0);
        find(str, 0, ele);
        sc.close();
        
    }
}