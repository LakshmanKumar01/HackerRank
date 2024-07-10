import java.util.Scanner;

class Loops_III {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
		for(int i=0;i<t;i++){
            int res = a;
            for (int j = 0; j < n; j++)
            {
                res += (int)(Math.pow(2, j) * b);
                System.out.print(Integer.toString(res)  + ' ');
            }
            System.out.print('\n');
        }
        in.close();

	}
}
