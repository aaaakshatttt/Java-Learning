import java.util.Scanner;
public class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("inter number = ");
        int input_number = sc.nextInt();
        if (input_number > 0){
            System.out.println("positive");
        } else if (input_number < 0) {
            System.out.println("negative");

        }
        else {
            System.out.println("zero");
        }

    }
}