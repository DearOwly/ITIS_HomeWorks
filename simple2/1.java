import java.util.Scanner;

class p{
    public static int prostoe(int x){
        int count = 0;
        for (int i = 3; i < x; i ++){
            if (x % i == 0){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (prostoe(n) == 0 && n >= 1 && n <= 1000){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }

}