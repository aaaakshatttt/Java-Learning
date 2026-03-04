import java.util.Scanner;
public class arrayquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        //input
        for (int i = 0;i<size;i++){
            System.out.println("enter array position "+ i + " = ");
            arr[i] = sc.nextInt();
        }

        //output
        for (int j = 0;j<size;j++){
            System.out.println(arr[j]);
        }







    }
}