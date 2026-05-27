import java.util.*;
public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,6,3,9,21};
        int sum = 0;
        for (int elements : arr){
            sum = sum + elements;

        }
        System.out.println(sum);
    }
}