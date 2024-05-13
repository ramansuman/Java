/*Design a Customer class in Java with private attributes for customer information,
including`id`, `name`, `email`, `phone`, `password`, and `address`.Create an
appropriate constructor and implement encapsulation by providing appropriate
getters and setters for each attribute.
Create an object of Customer & take the inputs from the user, set the values using
constructor display the values using getters. 
Sample Input:
Alex , alex@gmail.com , 9988776655 , Alex@123 , Btm layout Bengaluru
Sample Output:
1
Alex
alex@gmail.com
9988776655
Alex@123
Btm layout, Bengaluru
*/

import java.util.Scanner;

class Customer3 {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String password;
    private String address;
    Customer3(int id, String name,String email,long phone, String password,String address) {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.password=password;
        this.address=address;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public long getPhone() {
        return this.phone;
    }
    public String getPassword() {
        return this.password;
    }
    public String getAddress() {
        return this.address;
    }
}
public class Encapsulation3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the customer details in one line (comma seperated) : ");
        String input = scan.nextLine();
        String arr[] = input.split(",");
        Customer3 customer = new Customer3(1, arr[0],arr[1],Long.parseLong(arr[2]),arr[3], arr[4]);
        System.out.println("---------------------------------------------------------");
        System.out.println("The id of Customer is : "+customer.getId());
        System.out.println("The name of Customer is : "+customer.getName());
        System.out.println("The email of Customer is : "+customer.getEmail());
        System.out.println("The phone of Customer is : "+customer.getPhone());
        System.out.println("The password of Customer is : "+customer.getPassword());
        System.out.println("The address of Customer is : "+customer.getAddress());
        scan.close();
    }
}
