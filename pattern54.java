/*print:
 1
 3 2
 6 5 4
 10 9 8 7
 */
public class pattern54 {
    public static void main(String[] args) {
        int n=3;
        int count=0;
        for (int i = 1; i <=n; i++) {
            count=count+i;
            for (int j = 1; j <=n; j++) {
                if(j<=i)
                System.out.print(count-j+1+" ");
            }
            System.out.println();
        }
    }
}
