/*print:
 A B C D E
 B C D E F
 C D E F G
 D E F G H
 E F G H I
 */
import java.util.Scanner;
class pattern45
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=65;i<=65+n-1;i++)
        {
            char ch=(char)i;
            for(int j=1;j<=n;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        scan.close();
    }
}
