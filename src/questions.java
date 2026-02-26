import java.util.Scanner;
public class questions {
    public static float mean(float a,float b,float c){
        float meean = (a+b+c)/3;
        return meean;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        float a = sc.nextFloat();
        System.out.println("enter b = ");
        float b = sc.nextFloat();
        System.out.println("enter c = ");
        float c = sc.nextFloat();
        float z = mean(a,b,c);
        System.out.println(z);
    }
}