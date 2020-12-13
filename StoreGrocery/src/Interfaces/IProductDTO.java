package Interfaces;

import java.util.List;
import models.Human;
import models.ProcessedProductDTO;
import models.ProcessesedProductListDTO;
import models.ProductDTO;

public interface IProductDTO {
    //Product apples costs [1.80]*quantity [3] = 5.40

    //Step2 - Grocery Employee processes order
    List<ProcessedProductDTO> processOrder(Human employee, Human customer, List<ProductDTO> shoppingList);

    double calculateTotal(List<ProcessedProductDTO> processedProductDTO);
    
    ProcessesedProductListDTO payOrder(Human employee, Human CUstomer,
            List<ProcessedProductDTO> processedProductDTO, double totalAmount);
}
