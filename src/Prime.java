// Print First 10 Prime Numbers
public class Prime {

	public static void main(String[] args) {
		for(int k =1; k <= 10; k++) {
			boolean prime = true;
			for(int j = 2; j <= k/2; j++) {
				if(k % j ==0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.println(k + "");
				k++;
			}
		}
	}

}
