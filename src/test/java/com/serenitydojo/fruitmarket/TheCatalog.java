package com.serenitydojo.fruitmarket;

import static com.serenitydojo.fruitmarket.Fruit.Apple;
import static com.serenitydojo.fruitmarket.Fruit.Banana;
import static com.serenitydojo.fruitmarket.Fruit.Orange;
import static com.serenitydojo.fruitmarket.Fruit.Pear;
import static com.serenitydojo.fruitmarket.Fruit.Strawberries;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TheCatalog {



    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
        Catalog catalog = new Catalog();

        catalog.addFruit(Apple, 4.00);         
        catalog.addFruit(Banana, 6.00);
        catalog.addFruit(Pear, 4.50);
        catalog.addFruit(Orange, 5.50);
        assertThat(catalog.costOf(Apple)).isEqualTo(4.00);
        assertThat(catalog.costOf(Banana)).isEqualTo(6.00);
        assertThat(catalog.costOf(Pear)).isEqualTo(4.50);
        assertThat(catalog.costOf(Orange)).isEqualTo(5.50);
        
    }
    
    @Test
    public void shouldBeAbleToListFruitInAlphabeticalOrder() {
    	Catalog catalog = new Catalog();
    	 catalog.addFruit(Apple, 4.00);         
         catalog.addFruit(Banana, 6.00);
         catalog.addFruit(Pear, 4.50);
         catalog.addFruit(Orange, 5.50);
    	 assertThat(catalog.getAvailableFruit()).containsExactly("Apple", "Banana", "Orange","Pear");
    	   	
    }
    
    
    @Test(expected = FruitUnavailableException.class)
    public void shouldThrowFruitUnavailableException() {
    	Catalog catalog = new Catalog();
    	catalog.addFruit(Apple, 4.00); 
    	catalog.costOf(Strawberries);
    	  	
    }
    
}
