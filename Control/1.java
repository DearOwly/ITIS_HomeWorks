import java.util.Scanner;
class p{
    static int divide(int x, int y){
        int count = 0;
        while (x > 0){
            x -= y;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(divide(a, b));
    }
}