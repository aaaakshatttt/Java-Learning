import java.util.Scanner;
public class ifelseif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        if(a > 5){
            System.out.print("greater than 5");

        }else if (a < 5){
            System.out.println("less than 5");
        } else if (a == 5) {
            System.out.println("5");
        } else{
            System.out.println("0");
        }

    }
}