import java.util.Scanner;
class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String letters = "qwertyuiopasdfghjklzxcvbnmq";
        for (int i = 0; i < letters.length() - 1; i++) {
            if (a.equals("" + letters.charAt(i))) {
                System.out.println(letters.charAt(i + 1));
                break;
            }
        }
    }
}