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
public class ProcessedProductDTO extends ProductDTO{
    private double amount;

    public ProcessedProductDTO() {
    }

    public ProcessedProductDTO(Product product, int quantity) {
        super(product, quantity);
    }
    
    public double getAmount() {
        this.setAmount(amount);
        return this.amount;
    }

    public void setAmount(double Amount) {
        this.amount = this.getProduct().getPrice()*this.getQuantity();        
    }
    
    
}
