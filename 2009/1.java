import java.util.Scanner;
class p{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your bin number");
        int x = sc.nextInt();
        int k = 0;
        double result = 0;
        while (x > 0){
            result = result + x % 10 * Math.pow(2, k);
            x = x / 10;
            k ++;
        }
        System.out.println("Your bin number is ... " + result);

    }
}