import java.util.Scanner;
class p{
    public static int factorial(int x){
        int res = 1;
        for (int i = 1; i <= x; i++ ){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}