/*Design a Customer class in Java with private attributes for customer information,
including `id`, `name`, `email`, `phone`, `password`, and `address`.
Implement encapsulation by providing appropriate getters and setters for each
attribute.Create multiple objects of Customer according to the user & take the
inputs from the user, set the values & display the values using setter and getters */

import java.util.Scanner;

class Customer {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String password;
    private String address;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return this.phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
public class Encapsulation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of objects to be created : ");
        int n = scan.nextInt();
        Customer[] customer = new Customer[n];
        for (int i = 0; i < n; i++) {
            Customer c = new Customer();
            System.out.print("Enter the id of customer "+i+1+" : ");
            c.setId(scan.nextInt());
            System.out.print("Enter the name of customer "+i+1+" : ");
            c.setName(scan.next());
            System.out.print("Enter the email of customer "+i+1+": ");
            c.setEmail(scan.next());
            System.out.print("Enter the phone of customer "+i+1+": ");
            c.setPhone(scan.nextLong());
            System.out.print("Enter the password of customer "+i+1+": ");
            c.setPassword(scan.next());
            System.out.print("Enter the address of customer "+i+1+": ");
            scan.nextLine();
            c.setAddress(scan.nextLine());
            customer[i]=c;
        }
        System.out.println("---The Details of customer is ---");
        System.out.println();
        for (int i = 0; i < n; i++) {
            Customer c=customer[i];
            System.out.println("The name of customer "+i+1+" is : "+c.getName());
            System.out.println("The email of customer "+i+1+" is : "+c.getEmail());
            System.out.println("The phone number of customer "+i+1+" is : "+c.getPhone());
            System.out.println("The password of customer "+i+1+" is : "+c.getPassword());
            System.out.println("The Address of customer "+i+1+" is : "+c.getAddress());
        }
        scan.close();
    }
}
