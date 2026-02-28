import java.util.Scanner;
public class q3 {
   //fxn to check even odd
    public static String evenodd(int n){
        if (n%2==0){
            String a = "even";
            return a;
        }
        else{
            String b = "odd";
            return b;
        }
    }
//fxn to primt table
    public static void tabe(int n){
        for (int i = 1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + i*n);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int number = sc.nextInt();
        String z = evenodd(number);
        System.out.println(z);*/

        int num = sc.nextInt();
        tabe(num);



    }
}