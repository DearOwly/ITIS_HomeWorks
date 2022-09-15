import java.util.Scanner;
class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flaq = false;
        while (true){
            int x = sc.nextInt();
            if (x == 0){
                break;
            }
            if (x == 5) {
                flaq = true;
            }
        }
        if (flaq == true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
