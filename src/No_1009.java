import java.util.Scanner;

public class No_1009 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] words = in.nextLine().split("\\s+");
		for (int i = words.length-1; i >=0; i--) {
			System.out.print(words[i]);
			if(i!=0) {
				System.out.print(" ");
			}
		}
	}
}
