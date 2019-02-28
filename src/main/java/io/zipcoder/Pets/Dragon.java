package io.zipcoder.Pets;

public class Dragon extends Pet {


    public Dragon(){

    }


    public String speak (){
        return "Fire";
    }



    public Dragon(String name,int age){
        super(name,age);
    }

    public Dragon(String name){
        super(name);
    }

    public Dragon(int age){
        super(age);
    }




}


