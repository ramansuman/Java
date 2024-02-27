/*print:
        * *
    * * * *
* * * * * *
 */
public class pattern58 {
    public static void main(String[] args) {
        int n=3,count=0;
        for (int i = 2; i <=2*n; i+=2) {
            for (int j = 1; j <=2*n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 2; k <2*i-count; k++) {
                System.out.print("* ");
            }
            count+=2;
            System.out.println();
        }
    }
}
