/*print:
         5
       4 5
     3 4 5
   2 3 4 5
 1 2 3 4 5
 */
import java.util.Scanner;
class pattern99
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for (int i = 1; i <=n; i++) {
            int x=n-i+1;
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}