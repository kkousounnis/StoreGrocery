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
    private double Amount;

    public ProcessedProductDTO() {
    }

    public ProcessedProductDTO(Product product, int quantity) {
        super(product, quantity);
    }
    
    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }
    
    
}
