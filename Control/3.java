import java.util.Scanner;
class p{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("you can write only 0-9 numbers");
        int n = sc.nextInt();
        int sum = 0;
        int check[]  = new int[10];
        while(n != 0){
            for (int i = 0; i < 10; i++){
                if (n == i){
                    check[i] += 1;
                }
            }
            n = sc.nextInt();
        }
        for (int i = 0; i < 10; i ++){
            if (check[i] == 1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}