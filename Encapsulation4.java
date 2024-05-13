/*Design a Customer class in Java with private attributes for customer information,
including`id`, `name`, `email`, `phone`, `password`, and `address`.Create a
appropriate constructor and implement encapsulation by providing appropriate
getters and setters for each attribute.
Create an object of Customer class and take the inputs from the user, verify the
email whether it contains domain name either `gmail.com` or `yahoo.com` then
set the values and display the values using the setter and getters. */

import java.util.Scanner;

class Customer4{
    private int id;
    private String name;
    private String email;
    private long phone;
    private String password;
    private String address;
    // Customer4(int id, String name, String email, long phone, String password, String address) {
    //     this.id=id;
    //     this.name=name;
    //     this.email=email;
    //     this.phone=phone;
    //     this.password=password;
    //     this.address=address;
    // }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
public class Encapsulation4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Customer4 customer = new Customer4();
        System.out.print("Enter the Id of Customer : ");
        customer.setId(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter the name of Customer : ");
        customer.setName(scan.nextLine());
        System.out.print("Enter the email of Customer : ");
        customer.setEmail(scan.next());
        while(!(customer.getEmail().indexOf("gmail.com")!=-1||customer.getEmail().indexOf("yahoo.com")!=-1))
        {
            System.out.println("Email must contain \"gmail.com\" or \"yahoo.com\". Please Enter mail again : ");
            System.out.print("Enter the email of Customer : ");
            customer.setEmail(scan.next());
        }
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
