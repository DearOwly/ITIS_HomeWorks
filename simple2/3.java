import java.util.Scanner;
class p{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maybe = 0;
        if (a + b > c && a + c > b && b + c > a ){
            maybe = 1;
        }
        switch (maybe){
            case 0:
                System.out.println("NO");
                break;
            case 1:
                System.out.println("YES");
                break;
        }
    }
}