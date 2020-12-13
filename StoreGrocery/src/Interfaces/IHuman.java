package Interfaces;

import java.util.List;
import models.ProcessedProductDTO;
import models.Product;
import models.ProductDTO;

public interface IHuman {
    //Step if order 
    List<ProductDTO> order(List<ProductDTO> shoppingList);
    
    void pays (List<ProcessedProductDTO> processedProductDTO, double totalAmount);
    
    
}
