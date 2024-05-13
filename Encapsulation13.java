/*Design a Menu class in Java with private attributes for menu information,
including`id`, `name`, `price`, and `description`.Create an appropriate
constructor and implement encapsulation by providing appropriate getters and
setters for each attribute.
Create an object of Menu & take the inputs from the user, set the values using
constructor display the values using getters. */

import java.util.Scanner;

class Menu3 {
    private int id=1;
    private String name;
    private int price;
    private String description;
    Menu3(String name, int price, String description) {
        this.name=name;
        this.price=price;
        this.description=description;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    
}
public class Encapsulation13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the one line input for Dish in Menu(comma seperated) : ");
        String s = scan.nextLine();
        String[] arr = s.split(",");
        scan.close();
        Menu3 menu = new Menu3(arr[0],Integer.parseInt(arr[1]), arr[2]);
        System.out.println("---------------------------------------");
        System.out.println("The Id of Menu Dish is : "+menu.getId());
        System.out.println("The Name of Dish in Menu is : "+menu.getName());
        System.out.println("The Price of Dish in Menu is : "+menu.getPrice());
        System.out.println("The Description of Dish in Menu is : "+menu.getDescription());
    }
}
