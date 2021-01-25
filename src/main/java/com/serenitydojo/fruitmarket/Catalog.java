package com.serenitydojo.fruitmarket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Catalog {

    private Map<Fruit, Double> pricePerKilo = new HashMap<>();
    
    
    public void addFruit(Fruit fruit,double cost) {
    	pricePerKilo.put(fruit, cost);
    	
    }
    
    public double costOf(Fruit fruit) {
    	if(!pricePerKilo.containsKey(fruit)) {
    		throw new FruitUnavailableException(fruit.name()+"currently unavailable");
    	}
    	return pricePerKilo.get(fruit);
    }


    public List<String> getAvailableFruit() {
        return pricePerKilo.keySet()
                .stream()
                .map(Enum::name)
                .sorted()
                .collect(Collectors.toList());
    }



    public static class PriceSetter {
        private final Catalog catalog;
        private final Fruit fruit;

        public PriceSetter(Catalog catalog, Fruit fruit) {
            this.catalog = catalog;
            this.fruit = fruit;
        }

        public Catalog to(Double price) {
            catalog.pricePerKilo.put(fruit, price);
            return catalog;
        }
    }
}
