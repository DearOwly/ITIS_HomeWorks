import java.util.Scanner;
class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to print?");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Print them here:");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i ++){
            numbers [i] = sc.nextInt();
        }
        System.out.println("Which one you want to find?");
        int x = sc.nextInt();
        for (int i = 0; i < n; i ++){
            if (numbers[i] == x){
                count ++;
            }
        }
        if (count > 0){
            System.out.println("We find your number " + count + " times."); } else {
            System.out.println("We dont find your number sorry");
        }
    }
}