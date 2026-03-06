import java.util.Scanner;
public class bhamnig {
    public static void sum(int a,int b){
        int z = a+b;
        System.out.println(z);
    }
    public static void table(int n){
        for (int i = 1;i<=12;i++){
            System.out.println( n + " X " + i + " = " + n*i);
        }
    }
    public static void fac(int m){
        int z = 1;
        for (int i = m;i>=1;i--){
            z = z * i;
        }
        System.out.println(z);
    }
    public static void eo(int n){
        if (n % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void mean(float a,float b,float c){
        float d = (a+b+c)/3;
        System.out.println(d);
    }
    public static void puw(int z,int y){
        int k = 1;
        for (int i =1;i<=y;i++){
            k = k*z;

        }
        System.out.println(k);
    }
    public static void evvsum(int n){
        int k = 0;
        for (int i = 1;i<=n;i++){
            if (i % 2 == 0){
                k = k+ i;
            }
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input array size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0;i<size;i++){
            System.out.println("vales of arr pos" + i );
            arr[i] = sc.nextInt();
        }

        for (int j = 0;j<size;j++){
            System.out.println(arr[j]);
        }
    }
}