/* print a hollow square using *, size of square is given once in program.
* * * * * 
*       *
*       *
*       *
* * * * *
*/
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        n= scan.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1||j==1||i==n||j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            scan.close();
        }
    }    
}
