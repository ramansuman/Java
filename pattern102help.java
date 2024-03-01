/*print : 
         1
       1 1
     1 2 1
   1 3 3 1
 1 4 6 4 1
*/
import java.util.Scanner;
class pattern102help
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int x=1;
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                x=x*(i-j)/j;//not understood
            }
            System.out.println();
        }
    }
}
