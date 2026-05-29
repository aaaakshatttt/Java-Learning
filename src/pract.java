import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,4,9,2,3,1};
        int n = arr.length;

        for (int i = 0;i<n-1;i++){
            for (int j = 0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];//temp 7
                    arr[j] = arr[j+1];//4
                    arr[j+1] = temp;//7 now = 4,7,9,2,3,1a nd lop trnimated now j++ so j = 1
                }
            }
        }
        for (int k = 0;k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
        }
    }