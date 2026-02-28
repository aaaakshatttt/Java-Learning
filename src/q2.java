import java.util.Scanner;
public class q2 {
    public static int sum(int a,int b){
        int summing = a+b;
        return summing;
    }
    public static int multi(int a,int b){
        int cross = a*b;
        return cross;
    }
    public static void fact(int n){
        int factorial = 1;
        for (int i = n;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.print(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("enter a = ");
        int a = sc.nextInt();
        System.out.print("enter b = ");
        int b = sc.nextInt();
        int dd = sum(a,b);
        System.out.println(dd);*/
       /* int a = 66;
        int s = 43;
        int ccd = multi(a,s);
        System.out.println(ccd);
*/
        int a = 5;
        fact(a);
    }
}