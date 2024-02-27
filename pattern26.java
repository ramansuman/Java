/*print:-
 01 06 11 16 21
 02 07 12 17 22
 03 08 13 18 23
 04 09 14 19 24
 05 10 15 20 25
 */
import java.util.Scanner;
class patter26{
    static public void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            int count=i;
            for(int j=1;j<=n;j++)
            {
                if(count<10){
                    System.out.print("0");
                }
                System.out.print(count+" ");
                count+=5;
            }
            System.out.println();
        }
        scan.close();
    }
}