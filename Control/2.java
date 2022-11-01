import java.util.Scanner;
class p{
    static boolean if_palindrom(String s){
        int a = 0;
        if (s.length() % 2 == 0){
            int count = 0;
            for (int i = 0; i < (s.length() / 2); i ++){
                if (s.charAt(i) == s.charAt(s.length() - 1 - i)){
                    count += 2;
                }
            }
            a = count;
        } else {
            int count = 1;
            for (int i = 0; i < (s.length() - 1); i ++){
                if (s.charAt(i) == s.charAt(s.length() - 2 - i)){
                    count += 2;
                }
        }
        a = count;
    }
        if (a == s.length()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        String check[] = new String[n];
        String check2[] = new String[n];
        for (int i = 0; i < n; i ++){
            check[i] = sc.nextLine();
            if (if_palindrom(check[i])){
                check2[i] = check[i];
            }
        }
        for (int j = 0; j < n; j ++){
            System.out.println(check2[j]);
        }
    }
}