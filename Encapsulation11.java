/*Design a Menu class in Java with private attributes for menu information,
including `id`, `name`, `price`, and `description` . Implement encapsulation by
providing appropriate getters and setters for each attribute.
Create one object of Menu & take the inputs from the user, set the values & display
the values using setter and getters. */

import java.util.Scanner;

class Menu1 {
    private int id;
    private String name;
    private int price;
    private String description;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
public class Encapsulation11 {
    public static void main(String[] args) {
        Menu1 menu= new Menu1();
        Scanner scan = new Scanner(System.in);
        menu.setId(1);
        System.out.print("Enter the name of Dish in Menu : ");
        menu.setName(scan.nextLine());
        System.out.print("Enter the price of Dish in Menu : ");
        menu.setPrice(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter the Desciption of Dish in Menu : ");
        scan.close();
        menu.setDescription(scan.nextLine());
        System.out.println("---------------------------------------");
        System.out.println("The Id of Menu Dish is : "+menu.getId());
        System.out.println("The Name of Dish in Menu is : "+menu.getName());
        System.out.println("The Price of Dish in Menu is : "+menu.getPrice());
        System.out.println("The Description of Dish in Menu is : "+menu.getDescription());
    }
}
