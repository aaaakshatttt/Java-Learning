import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();
        System.out.println("enter columns ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0;i<rows;i++){
            for (int j = 0;j<columns;j++){
                System.out.println("enter value of row " + i + "and column " + j + " = " );
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0;i<rows;i++){
            for (int j = 0;j<columns; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        }
    }