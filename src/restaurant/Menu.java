package restaurant;
import java.util.Date;
import java.util.ArrayList;
public class Menu {
    private Date dateUpdated;
    private ArrayList<MenuItem> items;
    private MenuItem mostRecent;

//    Constructors
    public Menu(Date dateUpdated, ArrayList<MenuItem> items, MenuItem mostRecent){
        this.dateUpdated = dateUpdated;
        this.items = items;
        this.mostRecent = mostRecent;
    }

//    Getters
    public Date getDateUpdated() {
        return dateUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public MenuItem getMostRecent() {
        return mostRecent;
    }

// Setters
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void setMostRecent(MenuItem mostRecent) {
        this.mostRecent = mostRecent;
    }


}
