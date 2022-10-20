import java.util.Scanner;
class p{
    public static int prime_check(int x){
        int count = 0;
        for (int i = 2; i < x; i ++){
            if (x % i == 0){
                count ++;
            }
        }
        if (count == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(prime_check(n)){
            case 0:
                System.out.println("Prime");
                break;
            case 1:
                int divider = 2;
                System.out.print("1");
                while (n > 1){
                    if (n % divider == 0){
                        System.out.print(" " + "*" + " " + divider);
                        n /=divider;
                    } else {
                        divider ++;
                    }
                }
        }
    }
}