/*print:-
 05 06 15 16 25
 04 07 14 17 24
 03 08 13 18 23
 02 09 12 19 22
 01 10 11 20 21
 */
public class pattern29 {
    public static void main(String[] args) {
        int n=5;
        int x,y;
        for (int i = 1; i <= n; i++) {
            x=i;
            y=n-i+1;
            for (int j = 1; j <=n; j++) {
                if(x<10){
                    System.out.print("0");
                }
                if((j+1)%2==0){
                    System.out.print(y+" ");
                }
                else{
                    System.out.print(x+" ");
                }
                x=x+n;
                y=y+n;
            }
            System.out.println();
        }
    }
}