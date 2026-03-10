import java.util.Scanner;
public class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = sc.nextInt();
        System.out.print("enter b = ");
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a + " is bigger");
        } else if (b>a) {
            System.out.println(b + " is bigger");
        }
        else{
            System.out.println("both are equal");
        }
    }
}