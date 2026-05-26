import java.util.Scanner;
public class xninputs {
                        public static void idk(int x, int n){
                            int z = 1;
                            for (int i = 1;i<=n;i++){
                                z = z*x;
                            }
                            System.out.println(z);
                        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr x = ");
        int x = sc.nextInt();
        System.out.println("enter n = ");
        int n = sc.nextInt();
        idk(x,n);
    }
}