/*print:-
         1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4
 5 4 3 2 1 2 3 4 5
 */
import java.util.Scanner;
class pattern19{
    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of pattern : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int k =1;k<=n-i+1;k++)
            {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(int l=1;l<=i;l++){
                if(l>1)
                    System.out.print(l+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}