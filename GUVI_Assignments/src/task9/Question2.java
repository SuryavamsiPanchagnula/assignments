package task9;
import java.util.Scanner;
import java.io.*;
public class Question2 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String a=sc.next();
		String rev_word="";
		
		for( int i=a.length()-1;i>=0; i--) {
			
			 char ch= a.charAt(i);
			 rev_word=rev_word+ch;
			 
		}
		System.out.println("Reverse word:"+rev_word);
		
		/*Enter word
		 * take
		 * Reverse word:ekat*/
	}
}
