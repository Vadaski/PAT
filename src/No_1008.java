import java.util.Scanner;
public class No_1008 {
	
	public static void moveR(int step,int[] numbers) {
		int move = step%numbers.length;
		for (int j = 0; j < move; j++) {				
			int last = numbers[numbers.length-1];
			for (int i = numbers.length-2; i>=0 ; i--) {
				numbers[i+1] = numbers[i];
			}
			numbers[0] = last;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int step = in.nextInt();
		int[] numbers = new int[size];
		in = new Scanner(System.in);
		String[] number = in.nextLine().split("\\s+");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(number[i]);
		}
		moveR(step, numbers);
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < numbers.length; i++) {
			buffer.append(String.valueOf(numbers[i])+" ");
		}
		buffer.deleteCharAt(buffer.length()-1);
		System.out.println(buffer.toString());
	}
}