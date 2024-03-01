/*print :
  1  2  3  4  5
  6  7  8  9
 10 11 12
 13 14
 15 
 */
import java.util.Scanner;
class pattern86
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                if(count<10)
                    System.out.print(" ");
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}