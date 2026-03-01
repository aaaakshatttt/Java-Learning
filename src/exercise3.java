import java.util.Scanner;
public class exercise3 {
    public static double circum(double n){
        double teo = 2;
        double pi = 3.14;
        double cir = teo*pi*n;
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double circumference = circum(radius);
        System.out.println(circumference);



    }
}