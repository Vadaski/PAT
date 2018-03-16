
import java.util.ArrayList;
import java.util.Scanner;



public class No_1007 {
	static int want=0;	
	
	public static boolean isSS(int number) {
		for (int i = 2; i < number-1; i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> getAll(int i) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int j = 2; j <=i; j++) {
			if(isSS(j)) {
				list.add(j);
			}
		}
		return list;
	}
	
	public static void count(ArrayList<Integer> list) {
		for (int i = 0; i < list.size()-1; i++) {
			if((list.get(i+1)-list.get(i))==2) {
				want++;		
			}
		}
	}
	
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int number = in.nextInt();
		 ArrayList<Integer> list = getAll(number);
		 count(list);
		 System.out.println(want);
	}
}
