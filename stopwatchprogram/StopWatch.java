package stopwatchprogram;
import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 1;
		while (cont == 1 ) {
			System.out.println("press [1] on stopwatch     [2] off stopwatch");
			int temp = sc.nextInt();
			long stopTime = 0;
			long startTime = 0;
			if (temp == 1) {
				startTime = System.nanoTime();
				System.out.println("press 2 to stop stopwatch");
				int temp2 = sc.nextInt();
				
				if (temp2 == 2) {
					stopTime = System.nanoTime();
	
					long duration = (stopTime - startTime)/1000000000;
					System.out.println("total duration is " + (duration) + " sec");
					cont = 3;
					while (cont == 3 ) {
						System.out.println("do you want to continue  [1] YES     [2] NO" );
						cont = sc.nextInt();
						if (cont == 2) {
							cont = 0;
							
						}
						else if (cont == 1 ) {
							cont = 1;
						}
						else {
							cont = 3;
							System.out.println("please enter valid data");
						}
					}
					
				}
				else if(temp2 == 1) {
					System.out.println("stopwatch is already working");
				}
				else {
					System.out.println("please enter valid data");
				}
			}
			else if(temp == 2) {
				System.out.println("first on stopwatch to stop");
			}
			else  {
				System.out.println("please enter valid data");
			}
		}
		
		sc.close();
	}

}
