package io.zipcoder.Pets;

import java.util.Comparator;




public abstract class Pet implements Comparable<Pet> {

        private String name;
        private int age;



        public Pet(String name, int age) {
            this.name = name;

        }

        public Pet() {
        this(
                "", 0);
         }
        public Pet(String name) {

            this(name, 0);
        }

        public Pet(int age) {

            this("", 0);
        }



        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {

            return age;
        }

        public void setAge(int age) {

            this.age = age;
        }

        public String speak() {
            return "";
        }

        @Override
        public String toString() {

            return String.format("%s says %s", getName(), speak());
        }

        public int compareTo(Pet petToCompare) {
            if (this.getName().equals(petToCompare.getName())) {
                return this.petTypeString().compareTo(petToCompare.petTypeString());
            } else {
                return this.getName().compareTo(petToCompare.getName());
            }
        }

        public String petTypeString() {
            if (this instanceof Cat) {
                return "cat";
            } else if (this instanceof Dog) {
                return "dog";
            } else {
                return "parrot";
            }
        }


    //
//
//        public int compare(Pet a, Pet b) {
//            if (a.petTypeString().equals(b.petTypeString())){
//                return a.getName().compareTo(b.getName());
//            }
//            else {
//                return a.petTypeString().compareTo(b.petTypeString());
//            }
//        }

    }



