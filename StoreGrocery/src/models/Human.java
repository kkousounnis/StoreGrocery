package models;

import Interfaces.IHuman;
import java.util.ArrayList;
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
        System.out.println("Your Shopping List:");
        System.out.println(processesedShoppingLIst);
        System.out.println("Successfull payment!!!!");
        
    }

    @Override
    public List<ProductDTO> order(GroceryStore store, List<ProductDTO> shoppingList) {

        List<ProductDTO> listproductsrequested = new ArrayList<>();
        for (ProductDTO shoppinglist : shoppingList) {
            for (int i = 0; i < store.getProducts().size(); i++) {
                if (shoppinglist.getProduct().equals(store.getProducts().get(i))) {
                    
                    listproductsrequested.add(shoppinglist);

                }

            }

        }

        return (listproductsrequested);
    }

}
