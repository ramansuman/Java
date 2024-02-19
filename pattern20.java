/* print:-
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
 
 */
public class pattern20 {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i >=1; i--) {
            for (int j = n; j >=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
