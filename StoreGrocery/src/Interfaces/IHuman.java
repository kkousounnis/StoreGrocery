package Interfaces;

import java.util.List;
import models.ProcessesedProductListDTO;
import models.ProductDTO;

public interface IHuman {
    //Step if order 
    List<ProductDTO> order(GroceryStore store, List<ProductDTO> shoppingList);
    
    void pays (ProcessesedProductListDTO processesedShoppingLIst);
    
    
}
