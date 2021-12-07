package perfectnumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int value = 0;
		sc.close();
		PerfectNumber perfectNumber = new PerfectNumber();
		for (int i = 1; i <= number/2; i++) {
			value += perfectNumber.findPrime(number, i);
		}
		perfectNumber.checkPrime(number, value);	
	}
	
	public int findPrime(int num, int i) {	
		if (num % i == 0) {
			return i;
		}
		return 0;
	}
	
	public void checkPrime(int no, int val) {
		if (no == val) {
			System.out.println(no + " is perfect number");
		}
		else {
			System.out.println(no + " is not a perfect number");
		}
	}

}
