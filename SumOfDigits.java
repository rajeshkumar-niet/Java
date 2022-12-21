public class SumOfDigits {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println(a);
        int t = 0;
        while (a > 0) {
            t = t + a % 10;
            System.out.println(t);
            a = a / 10;
        }
        System.out.println("Sum of digits is " + t);
    }
}
