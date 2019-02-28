package io.zipcoder.Pets;



public class Dog extends Pet {

    public Dog(){

    }


    public String speak (){
        return "Bark";
    }



    public Dog(String name,int age){
        super(name,age);
    }

    public Dog(String name){
        super(name);
    }

    public Dog(int age){
        super(age);
    }




}
