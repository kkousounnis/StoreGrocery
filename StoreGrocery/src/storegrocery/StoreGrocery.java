package storegrocery;

import models.GroceryStore;
import models.Human;

public class StoreGrocery {

    public static void main(String[] args) {
       Human John = new Human("John");
       Human Ann = new Human("Ann");
       
       GroceryStore grocery = new GroceryStore("John's grocery", John);
    }

}
