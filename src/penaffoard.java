import java.util.Scanner;
public class penaffoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount having : ");
        int amount = sc.nextInt();
        if (amount > 10  && amount > 40)
            System.out.println("U can buy both pen and notebook");
        else if (amount > 10 && amount < 40) {
            System.out.println("u can only buy pen");

        }
        else if (amount < 10 && amount < 40)
            System.out.println("u have less balance");
        else
            System.out.println("error");



/*
* pen 10
* notebook 40*/
    }
}