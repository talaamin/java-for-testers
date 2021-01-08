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

    @Before
    public void createANewCatalog() {
       Catalog catalog = new Catalog();
        catalog.setPriceOf(Apple).to(4.00)
                .setPriceOf(Orange).to(5.50)
                .setPriceOf(Banana).to(4.50)
                .setPriceOf(Pear).to(4.50);
    }

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
        Catalog catalog = new Catalog();

        catalog.setPriceOf(Apple).to(4.00);
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(4.00);
        
        catalog.setPriceOf(Banana).to(6.00);
        assertThat(catalog.getPriceOf(Banana)).isEqualTo(6.00);
        
        catalog.setPriceOf(Orange).to(5.50);
        assertThat(catalog.getPriceOf(Orange)).isEqualTo(5.50);
        
        catalog.setPriceOf(Pear).to(4.50);
        assertThat(catalog.getPriceOf(Pear)).isEqualTo(4.50);       
    }
    
    @Test
    public void shouldBeAbleToListFruitInAlphabeticalOrder() {
    	Catalog catalog = new Catalog();
    	 assertThat(catalog.getAvailableFruit()).containsExactly("Apple", "Banana", "Orange","Pear");
    	   	
    }
    
    
    @Test(expected = FruitUnavailableException.class)
    public void shouldThrowFruitUnavailableException() {
    	Catalog catalog = new Catalog();
    	catalog.getPriceOf(Strawberries);
    	
    	
    }
}
