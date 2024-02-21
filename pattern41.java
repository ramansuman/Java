/*print:
 A B C D E
 A B C D E
 A B C D E
 A B C D E
 A B C D E
 */
public class pattern41 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            char a = 'A';
            for (int j = 1; j <=n; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
