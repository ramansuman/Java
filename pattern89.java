/*print:
 A A A A A
 B B B B
 C C C 
 D D
 E
 */
import java.util.Scanner;
class pattern89
{
    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int n= scan.nextInt();
        scan.close();
        int ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print((char)ch+" ");
            }
            System.out.println();
            ch++;
        }
    }
}