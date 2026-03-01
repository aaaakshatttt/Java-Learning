import java.util.Scanner;
public class fxn_sum_oddnumbers {
    public static float avg(float a, float b , float c ){
        float average = (a+b+c)/3;
        return average;
    }
    public static void sumodd(int n){
        int empty = 0;
        for (int i = 1; i <=n;i++){
            if (i %2 != 0){
                empty = empty + i;
            }
        }
        System.out.println(empty);
    }
    public static void sumeven(int n){
        int empty = 0;
        for (int j = 1;j<=n;j++){
            if (j%2==0){
                empty = empty+j;
            }
        }
        System.out.println(empty);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.print("enter a = ");
        float a = sc.nextFloat();
        System.out.print("enter b = ");
        float b = sc.nextFloat();
        System.out.print("enter c = ");
        float c = sc.nextFloat();
        float avgv = avg(a,b,c);
        System.out.println(avgv);*/


        sumodd(3);
        sumeven(6);


    }
}