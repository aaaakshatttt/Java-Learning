import java.util.Scanner;
public class blah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("error occurred");
        }finally {
            System.out.println("flow didnt break");
        }
        System.out.println("enter a =");
        int a = sc.nextInt();
        System.out.println("enter b = ");
        int b = sc.nextInt();

        System.out.println("enter operation = ");
        char op = sc.next().charAt(0);

        if (op == '+'){
            System.out.println(a+b);
        }
        else if (op == '-'){
            System.out.println(a-b);
        } else if (op == '*') {
            System.out.println(a*b);
        } else if (op == '/') {
            System.out.println(a/b);
        }
        else if (op == '&'){
            System.out.println(a%b);
        }

        else{
            System.out.println("wrong input");
        }


    }
}