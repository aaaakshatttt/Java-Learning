import java.util.Scanner;
public class delete {
    public static void square(int n){
        System.out.println(n*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        square(a);
    }
}