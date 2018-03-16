import java.util.Scanner;
import java.util.regex.Pattern;

public class No_1003 {
	
	public static boolean isTrue(String input) {
		String pattern = "[(a|A)|\\s]*[p|P][(a|A)|\\s]+[t|T][(A|a)|\\s]*";
		 boolean isMatch = Pattern.matches(pattern, input);
		return isMatch;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int loop = in.nextInt();
		in = new Scanner(System.in);
		for (int i = 0; i < loop; i++) {
			
			if(No_1003.isTrue(in.nextLine())) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		

	}

}
