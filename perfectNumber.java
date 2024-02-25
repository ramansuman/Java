/*perfect number is those number which is equal to its sum of all the factors.
 e.g. factors of 6= 1,2 and 3. 1+2+3=6. so perfect number
 e.g. factors of 8= 1,2 and 4. 1+2+4!=8. so not a perfect number.
 e.g. factors of 28= 1,2,4,7 and 14. 1+2+4+7+14=28. so perfect number
 */

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check if it is perfect number or not : ");
        int num = scan.nextInt();
        int sum=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num)
            System.out.println(num+" is a perfect number.");
        else
            System.out.println(num+" is not a perfect number.");
        scan.close();
    }
}
