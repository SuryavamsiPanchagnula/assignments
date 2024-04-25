package task9;
import java.io.*;
import java.util.Scanner;
public class Question1 {
	
	public static boolean pallindrome_check(String str) {
		
		String rev_word="";
		
		boolean check = false;
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev_word= rev_word + str.charAt(i);
		}
		
		if(str.equals(rev_word)) {
			
			check = true;
		}
		return check;
		
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String a=sc.nextLine();
		
		a=a.toLowerCase();
		boolean b =pallindrome_check(a);
		System.out.println(b);
		
		
	}
	
}
