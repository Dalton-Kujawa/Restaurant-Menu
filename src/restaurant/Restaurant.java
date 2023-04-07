package restaurant;
import java.util.Date;
import java.util.Date;
import java.util.ArrayList;
import restaurant.MenuItem;
import restaurant.Menu;

public class Restaurant {

    public static void main(String[] args) {

//        Date currentDate = new Date();

        MenuItem spaghetti = new MenuItem(
                "Spaghetti with Meatballs",
                "Spaghetti with tuscan spiced ground beef balls",
                "Dinner",
                14.99
        );

        MenuItem nachos = new MenuItem(
                "Nachos",
                "Nachos with queso, black beans, jalepenos, shredded chicken",
                "Appetizers",
                11.99
                );

        Menu Coolies = new Menu();

        Coolies.addItem(nachos);
        Coolies.addItem(nachos);
        Coolies.addItem(spaghetti);


       nachos.printItem(nachos);
       Coolies.printAllItems(Coolies);
        System.out.println(Coolies.lastUpdated());

        System.out.println(nachos.equals(nachos));
        System.out.println(nachos.equals(spaghetti));


    }
}
