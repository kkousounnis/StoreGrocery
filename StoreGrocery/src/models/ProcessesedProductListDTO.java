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
        double sum = 0;
        for(ProcessedProductDTO processedshoppinglist:processedShoppingList){
            sum+=processedshoppinglist.getAmount();
        }
    }
    
    public double getAmount(){
        return this.amount;
    }
}
