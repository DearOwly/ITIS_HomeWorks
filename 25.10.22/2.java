import java.util.Scanner;
class p{
    public static boolean ch_count(int x){
        int count = 0;
        int count_help = 0;
        while (Math.abs(x) > 0){
            if ((x % 10) % 2 == 0){
                count ++;
            }
            x /= 10;
            count_help ++;
    }return (count == count_help);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want break print, write zero");
        int a = sc.nextInt();
        boolean flaq = false;
        while(a != 0){
            if (ch_count(a)){
                flaq = true;
            }
            a = sc.nextInt();
        }
        if (flaq){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}