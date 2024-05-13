/*Design a Customer class in Java with private attributes for customer information,
including`id`, `name`, `email`, `phone`, `password`, and `address`. Implement
encapsulation by providing appropriate getters and setters for each attribute.
Create one object of Customer & take the inputs from the user, set the values &
display the values using setter and getters. */

import java.util.Scanner;

class Customer1 {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String password;
    private String address;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return this.name;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setPhone(long phone) {
        this.phone=phone;
    }
    public long getPhone() {
        return this.phone;
    }
    public void setPassword(String password) {
        this.password=password;
    }
    public String getPassword() {
        return this.password;
    }
    public void setAddress(String address) {
        this.address=address;
    }
    public String getAddress() {
        return this.address;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Customer1 customer = new Customer1();
        System.out.print("Enter the Id of Customer : ");
        customer.setId(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter the name of Customer : ");
        customer.setName(scan.nextLine());
        System.out.print("Enter the email of Customer : ");
        customer.setEmail(scan.next());
        System.out.print("Enter the phone number of Customer : ");
        customer.setPhone(scan.nextLong());
        System.out.print("Enter the password of Customer : ");
        customer.setPassword(scan.next());
        scan.nextLine();
        System.out.print("Enter the address of Customer : ");
        customer.setAddress(scan.nextLine());
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