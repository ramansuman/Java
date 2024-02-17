/*print:-
*
* *
*   *
*     *
* * * * *
 */
public class pattern14 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for ( i = 1; i <=n; i++) {
            for ( j = 1; j <=i; j++) {
                if(i==1||j==1||i==n||j==i)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
