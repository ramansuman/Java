/*print : 
 A
 B A
 C B A
 D C B A
 E D C B A
 */
import java.util.Scanner;
class pattern77
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int ch ='A'+i-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}