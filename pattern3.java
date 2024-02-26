/*print number square
 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4
 5 5 5 5 5
 */
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n;
       System.out.print("Enter the size of pattern : ");
       n=scan.nextInt();
       for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
       }
       scan.close();
    }
}
