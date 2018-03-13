import java.util.Scanner;

public class _3nPlusOneGuess {
	private static int count = 0;
	public void cut(int number) {
		if(number==1||number<0||number>1000) {
			return;
		}
		if(number%2!=0) {
			number = (3*number+1)/2;
			count++;
			if(number==1) {
				return;
			}else {
				cut(number);
			}
		}
		else {
			number = number/2;
			count++;
			if(number==1) {
				return;
			}else {
				cut(number);
			}
		}
		
	}
	public static void main(String[] args) {
		_3nPlusOneGuess x = new _3nPlusOneGuess();
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		x.cut(number);
		System.out.println(count);
	}
}
