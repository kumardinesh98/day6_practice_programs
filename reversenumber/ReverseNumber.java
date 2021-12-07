package reversenumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int reverse = 0;
		sc.close();
		if (number > 9) {
			ReverseNumber reverseNumber = new ReverseNumber();
			reverse = reverseNumber.reverseNumber(number);
			System.out.println("reverse is " + reverse);
		}
		else {
			System.out.println("invalid number");
		}

	}
	
	public int reverseNumber(int num) {
		int rev = 0;
		int digit = 0;
		while (num > 0) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num = num/10;
		}
		return rev;
	}

}
