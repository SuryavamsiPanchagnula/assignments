package task8;
import java.util.Scanner;
public class Question9 {

public static void main(String args[]) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		a=sc.nextInt();
		if(a<1 || a>=100) {
			System.out.println("cannot be determined");
		}
		else if(a>=60) {
			System.out.println("Senior citizen");
		}
		else {
			System.out.println("Not a senior citizen");
		}
	}
}
