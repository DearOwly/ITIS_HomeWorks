import java.util.Scanner;
 
 
public class Ex {
    public static void main(String[] args) {
        long t = 0;
        Scanner scan = new Scanner(System.in);
        boolean increasing = true;
        boolean decreasing = true;
        boolean equal = true;
        while (true) {
            long n = scan.nextLong();
            if (n == 0) {
                if (t == 0) {
                    break;
                }
                else if (equal) {
                    System.out.print("=");
                    break;
                }
                else if (increasing) {
                    System.out.print(">");
                    break;
                }
                else if (decreasing) {
                    System.out.print("<");
                    break;
                }
                else {
                    System.out.print("!");
                    break;
                }
            }
            if (t == 0) {
                t = n;
                continue;
            }
            if (n <= t & increasing == true) {
                increasing = false;
            }
            if (n >= t & decreasing == true) {
                decreasing = false;
            }
            if (n != t & equal == true) {
                equal = false;
            }
            t = n;
 
            }
        }
    }