/*print:
 E E E E E
 D D D D D
 C C C C C
 B B B B B
 A A A A A
 */
public class pattern42 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 65+n-1; i >=65; i--) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
}
