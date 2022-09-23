//4. Вводится список чисел. Проверить, что существует не более 3х чисел, в которых ровно две четные цифры.
import java.util.Scanner;
 class p{
    public static int count(int x){
        int count = 0;
        while (x > 0){
            if ((x % 10) % 2 == 0){
                count += 1;
            }
            x /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to print?");
        int n = sc.nextInt();
        int c = 0;
        System.out.println("Print them here:");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i ++){
            numbers [i] = sc.nextInt();
            if (count(numbers[i]) == 2){
                c += 1;
            }
        }
        if (c <= 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");}
    }
}