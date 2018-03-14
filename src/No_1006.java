
import java.util.Scanner;

public class No_1006 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer ipn = in.nextInt();
		String input = ipn.toString();
		char[] inputC = input.toCharArray();
		String[] num = new String[] {"error","S","B"};
		int k = inputC.length-1;
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < inputC.length; i++) {
			if(i==inputC.length-1) {
				int single = Integer.parseInt(String.valueOf(inputC[i]));
				for (int j = 0; j < single; j++) {
					buffer.append(((Integer)(j+1)).toString());
				}
			}
			if(k!=0) {
				//System.out.println(Integer.parseInt(String.valueOf(inputC[i])));
				for (int j = 0; j <Integer.parseInt(String.valueOf(inputC[i])); j++) {
					buffer.append(num[k]);		
				}
			k--;
			}
		}
		System.out.println(buffer.toString());
	}
}