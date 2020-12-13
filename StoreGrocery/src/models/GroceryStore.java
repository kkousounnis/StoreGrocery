package models;

import Interfaces.IProductDTO;
import java.util.ArrayList;
import java.util.List;

public class GroceryStore implements IProductDTO {

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
        List<ProcessedProductDTO> listprocessedproducts = new ArrayList<>();
        for (ProductDTO productprocess : shoppingList) {
            listprocessedproducts.add(
                    new ProcessedProductDTO(productprocess.getProduct(),
                            productprocess.getQuantity()));
        }

        return (listprocessedproducts);
    }

    @Override
    public double calculateTotal(List<ProcessedProductDTO> processedProductDTO) {
        int sum = 0;
        for (ProcessedProductDTO proccesprofuctlist : processedProductDTO) {
            sum += sum + proccesprofuctlist.getAmount();
        }
        return (sum);
    }

    @Override
    public ProcessesedProductListDTO payOrder(Human employee,
            Human CUstomer,
            List<ProcessedProductDTO> processedProductDTO,
            double totalAmount) {
        ProcessesedProductListDTO processedproductlistdto
                = new ProcessesedProductListDTO(processedProductDTO, totalAmount);
        return processedproductlistdto;
    }

}
