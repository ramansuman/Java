/*print:-
1 2 3 4
1 2 3
1 2
1 
 */
public class pattern8 {
    public static void main(String[] args) {
        int i,j,n=8;
        int k=n;
        for(i=1;i<=n;i++){
            for(j=1;j<=k;j++){
                System.out.print(j+" ");
            }
            k--;
            System.out.println();
        }
    }   
}
