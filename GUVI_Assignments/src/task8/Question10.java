package task8;
import java.util.Scanner;
public class Question10 {
	public static void main(String args[]) {
		int a,c;
		String b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		a=sc.nextInt();
		b= String.valueOf(a);
		c=b.length();
		System.out.println("Number of digits "+c);
	}

}
