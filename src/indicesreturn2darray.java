import java.util.*;
public class indicesreturn2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows = ");
        int rows = sc.nextInt();
        System.out.println("enter columns " );
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0;i<rows;i++){
            for (int j = 0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the number thats needed to be found = ");
        int x = sc.nextInt();


        for (int i = 0;i<rows;i++){
            for (int j = 0;j<columns;j++){
                if (arr[i][j] == x){
                    System.out.println("bitch found at row " + i + " and column " + j);
                }
            }
        }
    }
}