import java.util.Scanner;
public class aaaaaaaaaaraay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        //input
        for (int i = 0;i<size;i++){ //i<size cauase arr of length 3 will have pos 0 1 2 not 3 sooo
            arr[i] = sc.nextInt();
        }
        //output
        for (int j = 0;j<size;j++){
            System.out.print(arr[j] + " ");
        }


    }
}