package io.zipcoder.Pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() {
        String experct = "Bark";
         Dog dog = new Dog();
        String actual = dog.speak();

        Assert.assertEquals(experct,actual);

    }


    @Test
    public void testCatCompareToEqual() {
        //Given
        Dog one = new Dog("Jeff");
        Dog second = new Dog("Jeff");

        //When
        int comparisonValue = one.compareTo(second);

        //Then
        Assert.assertTrue(comparisonValue == 0);
    }

    @Test
    public void testCatDogCompareToNegative2() {
        //Given
        Dog one = new Dog("jpple");
        Dog two = new Dog("Apple");

        int compareNumber = one.compareTo(two);


        System.out.println(compareNumber);
    }

//    @Test
//    public void testCatDogCompareToNegative() {
//        Given
//        Cat gato = new Cat("Jeff");
//        Dog doge = new Dog("Jeff");
//
//        When
//        int comparisonValue = gato.compareTo(doge);
//
//        Then
//        Assert.assertTrue(comparisonValue < 0);
//
//    }

    @Test
    public void testCatCatComparePositive() {
        //Given
        Cat gato = new Cat("Zane");
        Cat secondGato = new Cat("Ann");

        //When
        int comparisonValue = gato.compareTo(secondGato);

        //Then
        Assert.assertTrue(comparisonValue > 0);

    }
}