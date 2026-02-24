public class prac {
    public static void main(String[] args) {
        /*for (int i = 1;i<=3;i++){
            for (int j = 1;j<=4;j++){
                System.out.print("*");
            }System.out.println();
        }

        for (int k = 1;k<=10;k++){
            System.out.print(k + " ");

        }System.out.println();

        for (int ja = 1;ja<=4;ja++){
            System.out.print("java");
        }
        System.out.println();

        for (int e = 1; e<=10;e++){
            if (e%2==0){
                System.out.print(e + " ");
            }
        }
        System.out.println();

        for (int o = 1;o<=10;o++){
            if (o%3==0){
                System.out.print(o + " ");
            }
        }*/

        for (int i = 1;i<=5;i++){
            if (i == 1 || i == 5){
                for (int j = 1;j<=5;j++){
                    System.out.print("*");
                }
                System.out.println();
            } else if (i == 2 || i == 3 || i == 4) {
                for (int k = 1;k<=5;k++){
                    if (k == 1 || k == 5){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

                }System.out.println();

            }
        }


    }
}