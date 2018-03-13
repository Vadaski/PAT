import java.util.Scanner;

public class no1001 {
	static int count=0;
	public static void callatz(int number) {
		if(number == 1) {
			return; 
		}
		if(number%2!=1) {
			callatz(number/2);
		}
		else {
			callatz((number*3+1)/2);
		}
		count++;	
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		callatz(number);
		System.out.println(count);
		}
}
