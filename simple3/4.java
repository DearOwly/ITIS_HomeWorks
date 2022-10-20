import java.util.Scanner;
class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countEND = 2 * n;
        int countST =  2 * n;
        for (int i = 0; i < 1 * n; i ++){
            for (int j = 0; j < 6 * n; j ++){
                if (j >= countST && j <= countEND){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            countST --;
            countEND++;

        }
        int countST2 = countST;
        int countEND2 = countEND;
        for (int i = 0; i <= 1 * n; i ++){
            for (int j = 0; j < 6 * n; j ++){
                if ((j >= countST && j <= countEND) || j <= countST2 || j >= countEND2){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            countST ++;
            countEND--;
            countST2 --;
            countEND2 ++;
    }
} }
