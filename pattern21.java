/*print:-
 5 5 5 5 5
 4 4 4 4 4
 3 3 3 3 3
 2 2 2 2 2
 1 1 1 1 1
 */
public class pattern21 {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1 ; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
