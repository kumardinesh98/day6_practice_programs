package fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count");
		int count = sc.nextInt();
		long previous = 0;
		long present = 1;
		long temp = 0;
		sc.close();
		System.out.print(previous + "\t" + present + "\t");
		for (int i = 0; i <= count; i++) {
			temp = previous + present;
			previous = present;
			present = temp;
			System.out.print(temp + "\t");
		}
	}

}
