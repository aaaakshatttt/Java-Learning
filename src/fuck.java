
public class fuck {
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void tab(int n){
        for (int i = 1;i<=10;i++){
            System.out.println(i*n);
        }
    }
    public static void fac(int n){
        int fact = 1;
        for (int i = n;i>=1;i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    public static void eo(int a){
        if (a%2==0){
            System.out.println("even");
        }
        else if (a%2!=0){
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0;i<=4;i++){
            System.out.println(arr[i]);
        }

    }
}