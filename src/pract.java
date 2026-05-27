import java.util.*;
public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,6,3,9,21};

        System.out.print("enter integer = ");
        int fuck = sc.nextInt();

        for (int i = 0;i<5;i++){
            if (arr[i]==fuck){
                System.out.println("exists at posiiton " + i);
            }
            
        }
    }
}