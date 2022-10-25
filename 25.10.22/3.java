import java.util.Scanner;
class p{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exit with -1");
        int a = sc.nextInt();
        int b[] = new int[10];
        while (a > -1){
            for (int i = 0; i < 10; i ++){
                if (a == i){
                    b[i] ++;
                }
            }
            a = sc.nextInt();
        }
        for (int i = 0; i < 10; i ++){
            System.out.println(i + ": " + b[i] + " times");
        }
    }

}