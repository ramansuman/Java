/*print:-
1
0 1
1 0 1
0 1 0 1
 */
public class pattern9 {
    public static void main(String[] args) {
        Boolean check = true;
        int i, j;
        int n = 10;
        for (i = 1; i < n; i++) {
            for (j = 1; j < i; j++) {
                if (check) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");

                    check = !check;
                }
            }
            if (i % 2 == 0) {
                check = !check;
            }
            System.out.println();
        }
    }
}