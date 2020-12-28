package com.serenitydojo.assertions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.data.Percentage;
import org.junit.Test;

public class WhenWritingReadableAssertions {

    @Test
    public void whenTwoNumbersAreEqual() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        assertThat(sum).isEqualTo(35);
    }

    @Test
    public void whenANumberIsGreaterThanAnother() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;

        assertThat(sum).isGreaterThan(30);
    }

    @Test
    public void whenANumberIsInACertainInterval() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        assertThat(sum).isBetween(10, 20);
    }

    @Test
    public void whenANumberIsCloseToAnotherValue() {
        double roughlyOneHundred = 99;
        assertThat(roughlyOneHundred).isCloseTo(100, Percentage.withPercentage(10));

        // Check that the sum is within 10% of 100
    }

    @Test
    public void whenAStringIsEqualToAnother() {
        String color = "red";
        assertThat(color).isEqualTo("red");

        // Check that the string has a value of 'red'
    }

    @Test
    public void whenAStringIsEqualIgnoringCase() {
        String color = "RED";
        assertThat(color).isEqualToIgnoringCase("red");

        // Check that the string has a value of 'red' (ignoring case)
    }

    @Test
    public void whenAStringContainsOnlyDigits() {
        String licenseNumber = "12345";
        assertThat(licenseNumber).containsOnlyDigits();

        // Check that the value contains only digits
    }

    @Test
    public void whenAStringStartsWithAValue() {
        String colors = "red,green,blue";
        assertThat(colors).startsWith("red");

        // Check that the value starts with 'red'
    }

    @Test
    public void whenAStringEndsWithAValue() {
        String colors = "red,green,blue";
        assertThat(colors).endsWith("blue");

        // Check that the value ends with 'blue'
    }


    @Test
    public void whenAListContainsAValue() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).contains("red");

        // Check that the list contains "red"
    }

    @Test
    public void whenAListContainsASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).contains("red","blue");

        // Check that the list contains "red" and "blue
    }

    @Test
    public void whenAListHasASpecificSize() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).hasSize(3);

        // Check that the list contains 3 elements
    }

    @Test
    public void whenAListContainsExactlyASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).containsExactly("red","green","blue");

        // Check that the list contains "red","green" and "blue" in any order
    }

    @Test
    public void whenAListContainsExactlyASetOfValuesInAnyOrder() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).containsExactlyInAnyOrder("red","blue","green");

        // Check that the list contains "red","blue" and "green" in any order
    }




}
