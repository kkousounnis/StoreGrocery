package models;

import Interfaces.IProductDTO;
import java.util.List;

public class GroceryStore implements IProductDTO{

    private String name;
    private Human owner;
    private List<Product> products;

    public GroceryStore() {
    }

    public GroceryStore(String name, Human owner, List<Product> products) {
        this.name = name;
        this.owner = owner;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroceryStore{name=").append(name);
        sb.append(", owner=").append(owner);
        sb.append(", products=").append(products);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public List<ProcessedProductDTO> processOrder(Human employee, Human customer, List<ProductDTO> shoppingList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateTotal(List<ProcessedProductDTO> processedProductDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProcessesedProductListDTO payOrder(Human employee, Human CUstomer, List<ProcessedProductDTO> processedProductDTO, double totalAmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
