/*print :-
 1
 3 5
 7 9 11
 13 15 17 19
 21 23 25 27 29
 */
import java.util.Scanner;
class pattern59{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(count<10)
                    System.out.print(" ");
                System.out.print(count+" ");
                count+=2;
            }
            System.out.println();
        }
        scan.close();
    }
}