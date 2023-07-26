package com.qa;

public class TestCats {
    public static void main(String[] args) {
        Cats c1=new Cats("Siamese",3,"white");
        Cats c2=new Cats("Persan",10,"black");
        Cats c3=new Cats("European",5,"brown");

        System.out.println("Cat 2: "+c2);
        c2.setAge(12);
        System.out.println("Cat 1: "+c1);
        System.out.println("Cat 2 modified: "+c2);

        System.out.println("Cat 1 breed: "+c1.getBreed());

        System.out.println("Cat 3: "+c3);
    }
}
