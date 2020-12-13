package models;

import Interfaces.IProductDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductDTO implements IProductDTO{

    private Product product;
    private int quantity;
    
    public ProductDTO() {
    }

    public ProductDTO(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductDTO other = (ProductDTO) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductDTO{product=").append(product);
        sb.append(", quantity=").append(quantity);
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
        System.out.println(listprocessedproducts);

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
    public ProcessesedProductListDTO payOrder(Human employee, Human CUstomer, List<ProcessedProductDTO> processedProductDTO, double totalAmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
