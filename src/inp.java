import java.util.Scanner;
public class inp {
    public static void main(String[] args) {
        System.out.println("takin input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number = ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number = ");
        int b = sc.nextInt();
        int  sum = a+ b;
        System.out.println("The sum is " + sum);

    }
}