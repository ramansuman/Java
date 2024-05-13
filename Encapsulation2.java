/*Design a Customer class in Java with private attributes for customer information,
including `id`, `name`, `email`, `phone`, `password`, and `address`.
Implement encapsulation by providing appropriate getters and setters for each
attribute.Create multiple objects of Customer according to the user & take the
inputs from the user, set the values & display the values using setter and getters */

import java.util.Scanner;

class Customer2 {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String password;
    private String address;
    public void setId(int id) {
        this.id=id;
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
public class Encapsulation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of objects to be created : ");
        int n=scan.nextInt();
        Customer2 arr[] = new Customer2[n];
        for(int i=0;i<arr.length;i++) {
            int count=i+1;
            Customer2 customer =new Customer2();
            System.out.print("Enter the Id of Customer "+count+" : ");
            customer.setId(scan.nextInt());
            scan.nextLine();
            System.out.print("Enter the name of Customer "+count+" : ");
            customer.setName(scan.nextLine());
            System.out.print("Enter the email of Customer "+count+" : ");
            customer.setEmail(scan.next());
            System.out.print("Enter the phone number of Customer "+count+" : ");
            customer.setPhone(scan.nextLong());
            System.out.print("Enter the password of Customer "+count+" : ");
            customer.setPassword(scan.next());
            scan.nextLine();
            System.out.print("Enter the address of Customer "+count+" : ");
            customer.setAddress(scan.nextLine());
            arr[i]=customer;
            System.out.println();
        }
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            int count= i+1;
            Customer2 customer = arr[i];
            System.out.println("The id of Customer "+count+" is : "+customer.getId());
            System.out.println("The name of Customer "+count+" is : "+customer.getName());
            System.out.println("The email of Customer "+count+" is : "+customer.getEmail());
            System.out.println("The phone of Customer "+count+" is : "+customer.getPhone());
            System.out.println("The password of Customer "+count+" is : "+customer.getPassword());
            System.out.println("The address of Customer "+count+" is : "+customer.getAddress());
            System.out.println();
        }
        scan.close();
    }
}
