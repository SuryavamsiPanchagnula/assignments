package task8;
import java.util.Scanner;
public class Question4 {

public static void main(String args[]) {
		
		int a,b,c=0;;
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Value of a after swap="+a);
		System.out.println("Value of b after swap="+b);
		
	}

}
