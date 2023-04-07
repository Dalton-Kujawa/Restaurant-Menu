package restaurant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Menu {
    private LocalDate dateUpdated;
    private ArrayList<MenuItem> items;
    private MenuItem mostRecent;

//    Constructors

    public Menu(){
        this.dateUpdated = LocalDate.now();
        this.items = new ArrayList<>();
    }
    public Menu(LocalDate dateUpdated, ArrayList<MenuItem> items, MenuItem mostRecent){
        this.dateUpdated = dateUpdated;
        this.items = items;
        this.mostRecent = mostRecent;
    }

    public Menu(ArrayList<MenuItem> items, MenuItem mostRecent){
        this.dateUpdated = LocalDate.now();
        this.items = items;
        this.mostRecent = mostRecent;
    }


    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                '}';
    }

    public void printAllItems(Menu menu){
        System.out.println(menu.toString());
    }

    public void addItem(MenuItem item){
        if(this.items.contains(item)){
            System.out.println("this item is already on the menu");
        } else {
            this.items.add(item);
        }
    }

    public void removeItem(MenuItem item){
        this.items.remove(item);
    }

    public LocalDate lastUpdated(){
        return this.items.get(this.items.size()-1).getDateAdded();
    }

    public LocalDateTime

    public void printItem(MenuItem item){

    }

//    Getters
    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public MenuItem getMostRecent() {
        return mostRecent;
    }

// Setters
    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void setMostRecent(MenuItem mostRecent) {
        this.mostRecent = mostRecent;
    }


}
