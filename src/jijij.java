import java.util.Scanner;
public class jijij {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = 8;
       int[] arr = {2,4,8,3,0,5};
       for (int i = 0;i<6;i++){
           if (arr[i] == x){
               System.out.println("mkc found at "+i);
           }
       }
    }
}