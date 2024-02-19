/*print:-
 A A A A A
 B B B B B
 C C C C C
 D D D D D
 E E E E E
 */
public class pattern40 {
    public static void main(String[] args) {
        char a='A';
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(a+" ");
            }
            a++;
            System.out.println();
        }
    }
}
