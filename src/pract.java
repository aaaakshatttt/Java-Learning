import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = {//using array inside of an array like
                {1,2,3},//this is basically array i = 0
                {4,5,6}//array i = 1
        };
        int[][] arr2 = {
                {7,8,9},
                {12,11,12}
        };

        int[][] sum = new int[2][3];

        for (int i = 0;i<2;i++){
            for (int j = 0;j<3;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int k = 0;k<2;k++){
            for (int m = 0;m<3;m++){
                System.out.print(sum[k][m] + " ");
            }
            System.out.println();
        }

    }
}
