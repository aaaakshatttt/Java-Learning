import java.util.Scanner;

public class fxn {
    public static int sum(int a, int b){
        int summing = a + b;
        return summing;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int a = sc.nextInt();
        System.out.print("enter b : ");
        int b = sc.nextInt();
        int c = sum(a,b);
        System.out.println(c);

    }
}