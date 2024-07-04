// GCD of Two Numbers
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		while(b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		System.out.println("GCD is " + a);
	}

}
