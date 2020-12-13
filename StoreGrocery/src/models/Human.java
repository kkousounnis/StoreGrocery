package models;

import Interfaces.IHuman;
import java.util.List;

public class Human implements IHuman {

    private String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Human{name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    


    @Override
    public void pays(ProcessesedProductListDTO processesedShoppingLIst) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductDTO> order(GroceryStore store, List<ProductDTO> shoppingList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
