package storegrocery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.GroceryStore;
import models.Human;
import models.ProcessedProductDTO;
import models.ProcessesedProductListDTO;
import models.Product;
import models.ProductDTO;

public class StoreGrocery {

    public static void main(String[] args) {
        Human john = new Human("John");
        Human ann = new Human("Ann");

       

        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Apple", 1.20d, "Kgr"),
                new Product("Orange", 1.80d, "Kgr"),
                new Product("Apple", 3.45d, "Kgr")
        ));
                
        GroceryStore grocery = new GroceryStore("John's grocery", john, products);
        
        List<ProductDTO> shoppingList = new ArrayList<>();
        shoppingList.add(new ProductDTO(grocery.getProducts().get(0),2));
        shoppingList.add(new ProductDTO(grocery.getProducts().get(1),1));
        shoppingList.add(new ProductDTO(grocery.getProducts().get(2),3));
        
        ann.order(grocery, shoppingList);
        
        List<ProcessedProductDTO> processedproductList = grocery.processOrder(john, ann, shoppingList);
        
        double totalAmount = grocery.calculateTotal(processedproductList);
        
        ProcessesedProductListDTO processedShoppingList = grocery.payOrder(john, ann, processedproductList, totalAmount);
        
        ann.pays(processedShoppingList);
    }

}
