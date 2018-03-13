import java.util.ArrayList;
import java.util.Scanner;


public class no1002 {
	
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
		//倒序输出
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
		int input = (int)in.nextInt();
		ArrayList<Integer> list = no1002.toIntArray(input);
		int Count = 0;
		for (int i = 0; i < list.size(); i++) {
			Count = Count+list.get(i);
		}
		list.clear();
		list = no1002.toIntArray(Count);
		no1002.printNumber(list);
	}
}
