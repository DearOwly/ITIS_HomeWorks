import java.util.Scanner;
class p {
    public static int count(String x, String y){
        int count = 0;
        for (int i = 0; i < x.length(); i ++){
            if (x.charAt(i) == y.charAt(0)){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something in English");
        String s = sc.nextLine();
        System.out.println("You write:");
        String[] lettersS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w","x","y","z"};
        String[] lettersB = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < lettersB.length; i ++){
            System.out.println("Litter "+ lettersB[i] + lettersS[i] + " " + (count(s, lettersB[i]) + count(s, lettersS[i])) + " times" );
        }
        //System.out.println("Litter a: " + (count(s, 'a') + count(s, 'A')) + " times");


    }
}

