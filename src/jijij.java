import java.util.Scanner;
public class jijij {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter dimentiponas");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        for (int i = 0;i<rows;i++){
            if (i == 0){
                for (int j = 0;j<columns;j++){
                    arr[i][j] = sc.nextInt();
                }
            } else if (i == 1) {
                for (int j = 0;j<columns;j++){
                    arr[i][j] = sc.nextInt();
                }
            } else if ( i == 2) {
                for (int j = 0;j<columns;j++){
                    arr[i][j] = sc.nextInt();

                }

            }
        }
    }
}