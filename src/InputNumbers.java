// Input Numbers until they input 0 & sum of all numbers
import java.util.Scanner;
public class InputNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sum = 0;
		do {
			System.out.println("Enter a number (0 to stop):");
			num = sc.nextInt();
			sum += num;
		} while(num!= 0);
		System.out.println("Sum is" + sum);
	}

}
