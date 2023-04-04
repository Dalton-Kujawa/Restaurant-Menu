package restaurant;
import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private Date dateAdded;
    private double price;

//    Constructors
    public MenuItem(String name, String description, String category, Date dateAdded, double price){
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.price = price;
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

    public Date getDateAdded() {
        return dateAdded;
    }

    public double getPrice() {
        return price;
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

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
