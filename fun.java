import java.util.Scanner;
class Main{
	public static void main(String[] args){
		System.out.println("Сколько пар в субботу?");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		if (ans >= 1){
			System.out.println("Не кайф");
		} else {
			System.out.println("С кайфом");
		}
	}
}