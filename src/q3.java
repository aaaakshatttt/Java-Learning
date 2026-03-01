import java.util.Scanner;
public class q3 {
   //fxn to check even odd
    public static void evenodd(int n){
        if (n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
//fxn to primt table
    public static void tabe(int n){
        for (int i = 1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + i*n);
        }

    }

    //check prime
    public static void prime(int d){
        if (d%1==0 && d%d==0 && (d%2!=0 || d%3!=0 || d%5!=0 || d%7!=0 )){
            System.out.print("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        evenodd(number);


        //int num = sc.nextInt();
       //tabe(num);



    }
}