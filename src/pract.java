import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = {3,6,19,7,13,45};
        float n = arr.length;
        float sum = 0;

        for (int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }

        System.out.println(sum/n);
        }
    }