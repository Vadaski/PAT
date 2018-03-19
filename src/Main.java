import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static int findMax(int[] xy) {
		int max = 0;
		int where = -1;
		for (int i = 0; i < xy.length; i++) {
			if (xy[i]>max) {
				max = xy[i];
				where = i;
			}
		}
		return where;
	}

	public static int findMin(int[] xy) {
		int min = 10000;
		int where = -1;
		for (int i = 0; i < xy.length; i++) {
			if (xy[i]<min) {
				min = xy[i];
				where = i;
			}
		}
		return where;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String[] id = new String[size];
		int[] xy = new int[size];
		for (int i = 0; i < size; i++) {					
				id[i] = in.next();
				int x = in.nextInt();
				int y = in.nextInt();
				xy[i] = Math.abs(x*y);
			
		}
		in.close();
		System.out.println(id[findMin(xy)]+" "+id[findMax(xy)]);
	}
}