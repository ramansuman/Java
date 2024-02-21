/*print:
 A B C D E
 B C D E F
 C D E F G
 D E F G H
 E F G H I
 */
public class pattern45 {
    public static void main(String[] args) {
        int n=5;
        char a ='A';
        for (int i =1; i <=n; i++) {
            char ch= (char)(a+i-1);
            for (int j = 1; j <=n; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
