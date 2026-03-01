import java.util.Scanner;
public class vote {
    public static void eligible(int a){
        if (a>=18){
            System.out.print("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age = ");
        int age = sc.nextInt();
        eligible(age);


    }
}