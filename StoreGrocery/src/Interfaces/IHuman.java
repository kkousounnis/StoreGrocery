package Interfaces;

import java.util.List;
import models.Product;

public interface IHuman {

    void pays(double amount);
    
    void pays (List<Product> products, double totalAmount);
}
