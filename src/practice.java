public class practice {
    public static void main(String[] args){
        /*for (int i = 1;i<=5;i++){
            for(int j = 1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        for (int i=1;i<=5;i++){
            if (i == 1 || i == 5){
                for (int j = 1;j<=5;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else if (i == 2|| i == 3|| i == 4) {
                for (int k = 1;k<=5;k++){
                    if (k == 1 || k == 5){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        for(int i = 1;i <=4;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =1;i<=1;i++){
            for (int j = 1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4;i>=1;i--){
            for (int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}