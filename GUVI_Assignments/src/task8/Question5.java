package task8;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        if(isPrime(number)) {
            System.out.println("prime number");
        } else {
            System.out.println(" not a prime number.");
        }
    }
    
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
