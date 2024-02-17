/*print:-
         *
       * *
     *   *
   *     *
 * * * * * 
 */
public class pattern15 {
    public static void main(String[] args) {
        int i,j,k;
        int n=5;
        for ( i = 1; i <=n; i++) {
            for ( k = 1; k <=n-i; k++) {
                System.out.print("  ");
            }
            for ( j = 1; j <= i; j++) {
                if(i==j||i==1||i==n||j==1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }    
}
