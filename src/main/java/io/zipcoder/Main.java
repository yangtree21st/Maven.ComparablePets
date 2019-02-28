package io.zipcoder;

import io.zipcoder.PetComparators.PetComparator;
import io.zipcoder.Pets.Bark;
import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    static class AgeComparator implements Comparator<Pet> {

        @Override
        public int compare(Pet o1, Pet o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("dfg", 1);
        Dog dog2 = new Dog("ewq", 2);
        Dog dog3 = new Dog("abc",3);
        List<Pet> pets = Arrays.asList(dog1, dog2, dog3);
        Collections.sort(pets, new AgeComparator());
        Collections.sort(pets);
System.out.println(pets);


        Cat one = new Cat("aeff");
        Cat two = new Cat("beff");

        //When
        int comparisonValue = one.compareTo(two);

        System.out.println(comparisonValue);

        Cat first = new Cat("aank");
        Cat second = new Cat("beff");

        //When
        int comparisonValue2 = first.compareTo(second);
        System.out.println(comparisonValue2);

        //new Application().start();
    }

    public int compare(Pet a, Pet b) {
        if (a.petTypeString().equals(b.petTypeString())){
            return a.getName().compareTo(b.getName());
        }
        else {
            return a.petTypeString().compareTo(b.petTypeString());
        }
    }





    //Then
//        Assert.assertTrue(comparisonValue < 0);

//    public static void sort(List<Pet> pets) {
//        do a lot
//        more
//        for(Pet p : pets) {
//            p.compareTo(p2);
//        }

//    }



//    public static void sort(List<Pet> pets,  Comparator<Pet> petComparator) {
//        do a lot
//        more
//        for(Pet p : pets) {
//            p.compareTo(p2);
//        }

//    }


}
