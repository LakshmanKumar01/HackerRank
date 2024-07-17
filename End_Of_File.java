import java.util.*;

public class End_Of_File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(sc.hasNext()) {
            String me = sc.nextLine();
            i++;
            System.out.println(i+" "+me);
        }
        sc.close();
    }
}
