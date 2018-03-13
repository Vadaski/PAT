import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class No_1004 {
	
	public static int findMax(ArrayList<Student> list) {
		int max = 0;
		int find = -1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).grade>max) {
				max = list.get(i).grade;
				find = i;
			}
		}
		return find;
	}
	
	public static int findMin(ArrayList<Student> list) {
		int min = 100;
		int find = -1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).grade<min) {
				min = list.get(i).grade;
				find = i;
			}
		}
		return find;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Scanner in = new Scanner(System.in);
		String input;
		String namePattern = "^[A-Za-z]+";
		String numberPattern = "[A-Za-z]+[0-9]+";
		String gradePattern = "[\\d]+$";
			int count = in.nextInt();
			for (int i = 0; i < count; i++) {
				in = new Scanner(System.in);
				input = in.nextLine();
				Matcher Mname = Pattern.compile(namePattern).matcher(input);
				Matcher Mnumber = Pattern.compile(numberPattern).matcher(input);
				Matcher Mgrade = Pattern.compile(gradePattern).matcher(input);
				String name;
				String number;
				int grade;
				if(Mname.find()) {
					name = Mname.group(0);
				}
				else {
					System.out.println("输入有误");
					break;
				}
				if(Mnumber.find()) {
					number = Mnumber.group(0);
				}
				else {
					System.out.println("输入有误");
					break;
					}
				if(Mgrade.find()) {
					grade = Integer.parseInt(Mgrade.group(0));
				}
				else {
					System.out.println("输入有误");
					break;
				}
				list.add(new Student(name, number, grade));
			}
			Student max = list.get(No_1004.findMax(list));
			Student min = list.get(No_1004.findMin(list));
			System.out.println(max.name+" "+max.number);
			System.out.println(min.name+" "+min.number);

	}	
	}
class Student{
	String name;
	String number;
	int grade;
	public Student(String name,String number,int grade) {
		this.name = name;
		this.number = number;
		this.grade = grade;
	}

}


