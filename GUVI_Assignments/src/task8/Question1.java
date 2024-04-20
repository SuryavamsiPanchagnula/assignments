package task8;
import java.util.Scanner;
public class Question1 {

	public static void main(String args[]) {
		int a,b,c,d;
	System.out.println("Enter a,b,c and d");
	Scanner sc= new Scanner(System.in);
	
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	
	if((a+b)>(c+d)) {
		
		System.out.println("Sum of a and b is greater than sum of c and d");
	}
	else {
		System.out.println("Sum of c and d is greater than sum of a and b");
	}
	}

}
