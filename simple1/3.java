import java.util.Scanner;
class p {
    public static int max(int x, int y){
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (true){
            int x = sc.nextInt();
            if (x == 0){
                break;
            }
            max = max(x, max);
        }
        System.out.println(max);
    }
}
