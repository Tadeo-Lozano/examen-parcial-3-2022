package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    LinkedList<Item> linkedList= new LinkedList<>();
    private BigDecimal tot;

    public ShoppingCart(){

    }

    public boolean isEmpty() {
        if(linkedList.size()==0){
            return true;
        }else
            return false;
    }

    public BigDecimal getTotalCost() throws EmptyShoppingCartException {
        if(linkedList.size()==0){
            throw new EmptyShoppingCartException();
        }
        for(int i=0;i<getItemsCount();i++){
            tot+=linkedList.get(i).getUnitCost();
        }
        return BigDecimal.valueOf(0);
    }

    public void addItem(Item item) {
        if(item.getProviderCode()==""){
            throw new InvalidDataException("Null or empty string not allowed for provider code");
        }else
        if(item.getCode()==null){
            throw new InvalidDataException("Null or empty string not allowed for item code");
        }else
        if(item.getUnitCost().compareTo()<0){
            throw new InvalidDataException("Cost must be greater than zero");
        }else
            if(item.getQuantity() < 1 && item.getQuantity() > 5){
                throw new InvalidDataException("Quantity must be greater than zero and lower than 5");
            }
            linkedList.add(item);
    }

    public int getItemsCount() {
        return linkedList.size();
    }

    public List<Item> getItems() {
        return new ArrayList<>();
    }

    public void removeItem(String itemCode2) {
    }
}
