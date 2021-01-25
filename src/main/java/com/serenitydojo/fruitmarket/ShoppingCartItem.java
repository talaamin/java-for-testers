package com.serenitydojo.fruitmarket;

public class ShoppingCartItem {
    private Fruit fruit;
    private Double quantity;
    private Double totalCost;

    public ShoppingCartItem(Fruit fruit, Double quantity, Double totalCost) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public ShoppingCartItem(Fruit  fruit, Double quantity) {
    	this.fruit = fruit;
    	this.quantity = quantity;
		// TODO Auto-generated constructor stub
	}

	public Fruit getFruit() {
        return fruit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getTotalCost() {
        return totalCost;
     
    }
}
