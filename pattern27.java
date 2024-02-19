/*print:-
 01 10 11 20 21
 02 09 12 19 22
 03 08 13 18 23
 04 07 14 17 24
 05 06 15 16 25
*/
public class pattern27 {
    public static void main(String[] args) {
        int n=5;
        int x,y;
        for (int i = 1; i <=n; i++) {
            x=i;
            y=n-i+1;
            for (int j = 1; j <=n; j++) {
                if(j%2==1){
                    System.out.print(x+" ");
                }
                else{
                    System.out.print(y+" ");
                }
                x=x+n;
                y=y+n;
            }
            System.out.println();
        }
    }
}