import java.util.ArrayList;
import java.util.Scanner;

public class No_1002 {
	
	public static ArrayList<Integer> toIntArray(int number) {
		ArrayList<Integer> List = new ArrayList<Integer>();
		while(number>0) {
			List.add(number%10);
			number = number / 10;
		}
		return List;
	}
	
	public static void printNumber(ArrayList<Integer> list) {
		String[] chinese = new String[] {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		
		for (int i = list.size()-1; i >=0 ; i--) {
		if(i!=0) {
		System.out.print(chinese[list.get(i)]+" ");	
		}
		else {
		System.out.print(chinese[list.get(i)]);	
		}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		char[] array = input.toCharArray();
		int count = 0;
		for (int i = 0; i < array.length; i++) {	
			count = count+Integer.parseInt(String.valueOf(array[i]));
		}
		ArrayList<Integer> list =  No_1002.toIntArray(count);
		No_1002.printNumber(list);
		in.close();
	}
}
