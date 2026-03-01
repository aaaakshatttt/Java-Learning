import java.util.Scanner;
public class exercise2 {
    public static void greatest(int a,int b) {
        if (a > b) {
            System.out.println(a);
        }
        else if (b > a) {
            System.out.println(b);
        }
        else {
            System.out.println(a + " is equal to " + b);
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int z = sc.nextInt();
            int y = sc.nextInt();
            greatest(z,y);


        }
    }