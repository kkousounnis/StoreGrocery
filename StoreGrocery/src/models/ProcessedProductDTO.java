/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author konstantinos
 */
public class ProcessedProductDTO extends ProductDTO {

    private double amount;

    public ProcessedProductDTO() {
    }

    public ProcessedProductDTO(double amount) {
        this.amount = amount;
    }

    public ProcessedProductDTO(Product product, int quantity) {
        super(product, quantity);
        this.setAmount();
    }

    public double getAmount() {
        this.setAmount();
        return this.amount;
    }

    public void setAmount() {
        this.amount = this.getProduct().getPrice() * this.getQuantity();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProcessedProductDTO{amount=").append(amount);
        sb.append(", product=").append(this.getProduct());
        sb.append(", quantity=").append(this.getQuantity());
        sb.append('}');
        return sb.toString();
    }

    

}
