import java.util.Scanner;
public class delete {
    public static void square(int n){
        System.out.println(n*n);
    }
    public static void eod(int n){
        if (n % 2 == 0){
            System.out.println("even");
        } else if (n % 2 != 0) {
            System.out.println("odd");

        }
        else System.out.println("zero");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        eod(a);
    }
}