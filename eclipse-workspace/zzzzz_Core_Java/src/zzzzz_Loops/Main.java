package zzzzz_Loops;


/**
 * 
 * When we don't know how many times a loop iterates, we us WHILE LOOP
 * 
 * */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//multiple10(sc);
		//GCD(10, 9);
		// double d = listAverage();
		//minNumList();
		// boolean a = isPrime(38);
		isPalindrome("never odd or even");
		//isPalindrome("no even");
	}
	
	public static void multiple10(Scanner sc) {	
		int num = 10; 
		
		char userChar = 'y';
		while(userChar == 'y') {
			System.out.println("A multiple of 10 is " + num);

			System.out.print("Enter y to continue or anything to quit: ");
			userChar = sc.next().charAt(0);
			num += 10;
			System.out.println("");
		}
		System.out.println("Goodbye");
	}
	
	public static int GCD(int numA, int numB) {
		int a = numA, b = numB;
		while(a != b) {
			if(b > a) {
				b = b - a;
			}else {
				a = a - b;
			}
		}
		System.out.println("GCD of " + numA + " an " + numB + ": " + a);
		return a;
	}
	
	public static double listAverage() {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		double sum = 0;
		
		int nextNumber; 

		System.out.println("Enter a number: ");
		nextNumber = sc.nextInt();
		
		while(nextNumber > 0) {
			sum = sum + nextNumber;
			count++;
			System.out.println("Enter a number: ");
			nextNumber = sc.nextInt();
		}
		System.out.println("Average: " + sum/count);
		return sum/count;
	}
	
	public static int minNumList() {
		Scanner sc = new Scanner(System.in);
		int currVal;
		int minVal;
		currVal = sc.nextInt();
		minVal = currVal;
		
		char userOp = 'y';
		while(userOp == 'y') {
			if(currVal < minVal)
				minVal = currVal;
			System.out.println("Enter next number");
			currVal = sc.nextInt();
			System.out.println("Enter y or quit");
			userOp = sc.next().charAt(0);
		}
		System.out.println("Minimum : " +  minVal);
		return minVal;
	}
	
	/**
	 * 
	 * When we know how many times a loop iterates, we us FOR LOOP
	 * 
	 * */
	public static boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if((num % i) == 0) {
				System.out.println(num + " is not prime");
				return false;
		  }
		}
		System.out.println(num + " is prime");
		return true;
	}
	
	public static boolean isPalindrome(String str) {
		// remove spaces
		String noSpaces = "";
		for(int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) != ' ')
				noSpaces += str.charAt(i);
		}
				
		// reverse noSpaces
		String str2 = "";
		for(int i = noSpaces.length() - 1; i >= 0; i-- ) {
			str2 += noSpaces.charAt(i);
		}
		
		// compare the rirst and last strings: if equal, palindrome, otherwise not palondrome
		for(int i = 0; i < noSpaces.length(); i++) {
			if(noSpaces.charAt(i) != str2.charAt(i))
				System.out.println("False.");
				return false;
		}
		System.out.println("True.");
		return true;
		//return str.equals(str2);
	}
	
}
