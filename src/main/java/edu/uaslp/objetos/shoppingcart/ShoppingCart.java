package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;

public class ShoppingCart {
    List<Item> cart = new ArrayList<>();
    int itemsCount;

    public boolean isEmpty() {
        if (cart.size() > 0){
            return false;
        }
        return true;
    }


    public BigDecimal getTotalCost() {
        if (isEmpty()) {
            throw new EmptyShoppingCartException();
        }
        BigDecimal totalCost = BigDecimal.ZERO;

        for(Item item: cart){
            totalCost = totalCost.add(item.getUnitCost().multiply(BigDecimal.valueOf(item.getQuantity())));
        }

        return totalCost;

    }

    public void addItem(Item item) {
        for (Item item1: cart){
            if (item1.getCode() == item.getCode() && item1.getUnitCost().compareTo(item.getUnitCost()) == 0){
                item1.setQuantity(item1.getQuantity() + item.getQuantity());
                return;
            }
        }
        cart.add(item);
    }

    public int getItemsCount() {
        for (int i=0; i<cart.size(); i++){
            itemsCount = itemsCount + cart.get(i).getQuantity();
        }
        return itemsCount;
    }

    public List<Item> getItems() {
        return cart;
    }

    public void removeItem(String code) {
        for (Item item : cart){
            if (item.getCode() == code){
                item.setQuantity(item.getQuantity() - 1);
                if (item.getQuantity() == 0){
                    cart.remove(item);
                }
                return;
            }
        }
    }
}