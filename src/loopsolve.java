public class loopsolve {
    public static void main(String[] args) {
      for (int i = 1;i<=4;i++){
         if (i==1 || i == 4){
            for (int j = 1;j<=5;j++){
              System.out.print("*");
         }System.out.println();
      }
         if (i == 2 || i == 3){
       for (int k = 1;k<=5;k++){
        if (k==1 || k ==5){
         System.out.print("*");
        }
        else {
         System.out.print(" ");
        }
       }System.out.println();
      }
     }

    }
}