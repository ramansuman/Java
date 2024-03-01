/*print:
            15 
         14 13
      12 11 10
    9  8  7  6
 5  4  3  2  1
 */
import java.util.Scanner;
class patter104
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        scan.close();
        int count=n*(n+1)/2;
        for(int i=1;i<=n;i++)
        {
            for (int k = 1; k <=n-i; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=i; j++) {
                if(count<10)
                    System.out.print(" ");
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
        }
    }
}