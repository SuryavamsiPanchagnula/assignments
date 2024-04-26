package task9;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int i, j,n;
        Scanner my_scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = my_scanner.nextInt();
       if(n%2==0) {
        	n=n-1;
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == i || j==n-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}