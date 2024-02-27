/*print:-
    *
   * * 
  *   *
 *     *  
* * * * * 
 */
import java.util.Scanner;
class pattern16{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int n;
        System.out.print("Enter the size of patter : ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k =1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==j||i==1||j==1||i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        scan.close();
    }
}