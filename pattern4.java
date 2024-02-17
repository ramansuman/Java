/*print:-
1 2 3 4
1 2 3 4
1 2 3 4
 */
public class pattern4 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1; i<=n; i++){
            for(j=1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
