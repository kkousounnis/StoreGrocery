/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;


public class ProcessesedProductListDTO {
    List<ProcessedProductDTO> processedShoppingList;
    double amount;
    
    public ProcessesedProductListDTO(){
        
    }

    public ProcessesedProductListDTO(List<ProcessedProductDTO> processedShoppingList, double amount) {
        this.processedShoppingList = processedShoppingList;
        this.amount = amount;
    }
       
    public double getAmount(){
        return this.amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProcessesedProductListDTO{processedShoppingList=").append(processedShoppingList);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
