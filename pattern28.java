/*print:-
 05 10 15 20 25
 04 09 14 19 24
 03 08 13 18 23
 02 07 12 17 22
 01 06 11 16 21
 */
public class pattern28 {
    public static void main(String[] args) {
        int n=5;
        int x;
        for (int i = 1; i <=n; i++) {
            x = n-i+1;
            for (int j = 1; j <=n; j++) {
                System.out.print(x+" ");
                x=x+n;
            }
            System.out.println();
        }
    }
}
