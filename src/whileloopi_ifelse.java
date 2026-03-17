import java.util.Scanner;
public class whileloopi_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            if (a == 0) {
                System.out.println("zerp");
            } else if (a%2 == 0 && a>0) {
                System.out.println("even & positive");
            } else if (a%2!=0 && a>0){
                System.out.println("odd & positive");
            }
            else if (a%2==0 && a<0){
                System.out.println("even & negative");
            }
            else {
                System.out.println("negative & odd");
            }
        }
    }
}