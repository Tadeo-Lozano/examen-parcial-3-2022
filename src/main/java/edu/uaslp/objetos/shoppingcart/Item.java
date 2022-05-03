package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;

public class Item {
    private String itemCode;
    private String providerCode;
    private int cant;
    private BigDecimal unitCost;

    public Item(String code1, String providerCode1, BigDecimal precio, int cant) {
        this.itemCode = code1;
        this.providerCode = providerCode1;
        this.cant = cant;
        this.unitCost = precio;
    }

    public Item(){

    }

    public void setCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public void setQuantity(int cant) {
        this.cant = cant;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public String getCode() {
        return null;
    }

    public String getProviderCode() {
        return null;
    }

    public int getQuantity() {
        return 0;
    }

    public BigDecimal getUnitCost() {
        return this.unitCost;
    }
}
