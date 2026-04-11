import java.util.Scanner;
public class revuse {
public static void sum(int n){
    int sum = 0;
    for (int i = 1;i<=n;i++ ){
        if (i%2!=0){
            sum = sum+i;
        }

    } System.out.println(sum);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
sum(30);
    }
}