package restaurant;
import java.time.LocalDate;
import java.util.Objects;


public class MenuItem {
    private String name;
    private String description;
    private String category;
    private LocalDate dateAdded;
    private double price;

    private  int menuItemNumber = 0;

    private static int menuTotal = 0;


//    Constructors
    public MenuItem(String name, String description, String category, LocalDate dateAdded, double price){
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.price = price;
        this.menuItemNumber = menuTotal;
        menuTotal++;
    }
    public MenuItem(String name, String description, String category, double price){
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
        this.price = price;
        this.menuItemNumber = menuTotal;
        menuTotal++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return menuItemNumber == menuItem.menuItemNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuItemNumber);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", date added='" + dateAdded +'\'' +
                ", price=" + price +
                '}';
    }

    public void printItem(MenuItem item){
        System.out.println(item.toString());
    }

    //    Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public double getPrice() {
        return price;
    }

    public int getMenuItemNumber() {
        return menuItemNumber;
    }

//    Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMenuItemNumber(int menuItemNumber){this.menuItemNumber = menuItemNumber;}
}
