package io.zipcoder.Pets;

import java.util.Comparator;

public class Cat extends Pet{

    public Cat (){

    }

    public String speak (){
          return "Meow";
    }

    public Cat(String name,int age){
        super(name, age);
    }

    public Cat(String name){
        super(name);
    }
    public Cat(int age){
        super(age);
    }


    public int compareTo(Cat catToCompare){
        return super.compareTo(catToCompare);
    }


}
