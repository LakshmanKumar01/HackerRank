package HackerRank;

import java.util.Scanner;

class Loops_II {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int res = a;
			for (int j = 0; j < n; j++) {
				res += (int) (Math.pow(2, j) * b);
				System.out.print(Integer.toString(res) + ' ');
			}
			System.out.print('\n');
		}
		sc.close();

	}
}
