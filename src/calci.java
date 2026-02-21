import java.sql.SQLOutput;
import java.util.Scanner;
public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER 1SR NUMBER: ");
        int a = sc.nextInt();
        System.out.print("Enter opertion: ");
        char op = sc.next().charAt(0);
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        if (op == '+'){
            System.out.println(a+b);
        } else if (op == '-') {
            System.out.println(a-b);

        } else if (op == '/') {
            System.out.println(a/b);

        } else if (op == '*') {
            System.out.println(a*b);
        }
        else{
            System.out.println("invalid");
        }

    }
}