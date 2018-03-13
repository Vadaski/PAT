import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No_1005 {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void callatz(int number) {
		if(number == 1) {
			return; 
		}
		if(number%2!=1) {
			number = number/2;
			list.add(number);
			callatz(number);
		}
		else {
			number = (number*3+1)/2;
			list.add(number);
			callatz(number);
		}
	}
	public static boolean compare(int[] ilist) {
		Collections.sort(list);
//		for (int i = 0; i < list.size()-1; i++) {
//			System.out.println(list.get(i));
//		}
		for (int i = 0; i < ilist.length; i++) {
			if(i>list.size()-1) {
				return false;
			}
			if(list.get(i)!=ilist[i]) {
				list.clear();
				return false;
				}
		}
		list.clear();
		return true;
	}
	public static void sort(int[] a) {
		for (int k = 0; k < a.length - 1; k++) {
            for (int j = k + 1; j < a.length; j++) { 
                if (a[k] > a[j]) {
                    int temp = a[k];
                    a[k] = a[j];
                    a[j] = temp;
                }
            }
        }
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] Nlist = new int[count];
		in = new Scanner(System.in);
		String numbers = in.nextLine();
		char[] numbersOfChar = numbers.toCharArray();
		for (int i = 0,c = 0; i < Nlist.length; i++,c=c+2) {
			Nlist[i] = Integer.parseInt(String.valueOf(numbersOfChar[c]));
		}
		sort(Nlist);
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < Nlist.length; i++) {
			callatz(Nlist[i]);
			if(compare(Nlist)) {
				buffer.append(Nlist[i]+" ");
				System.out.println(Nlist[i]);
			}
		}
		System.out.println(buffer.toString());
	}

}
