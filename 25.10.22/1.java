import java.util.Scanner;
class p{
    public static int pow(int x, int y){
        int result = 1;
        for (int i = 0; i < y; i ++){
            result *= x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
} }