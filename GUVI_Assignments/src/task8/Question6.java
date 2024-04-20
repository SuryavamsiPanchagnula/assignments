package task8;

public class Question6 {
public static void main(String args[]) {
		
		int a;
		a=5;
        if(a<0) {
        	System.out.println("cannot be defined");
        }
        else {
        	long f=1;
        	for(int i=1;i<=a;i++) {
        		f=f*i;
        	}
        System.out.println("factorial of "+a+" is "+f);
        }
}
}
