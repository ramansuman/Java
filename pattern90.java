/*print :
 A B C D E
 A B C D
 A B C 
 A B
 A 
 */
import java.util.Scanner;
class pattern90
{
    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n=scan.nextInt();
        scan.close();
        for(int i=1;i<=n;i++)
        {
            int ch='A';
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}