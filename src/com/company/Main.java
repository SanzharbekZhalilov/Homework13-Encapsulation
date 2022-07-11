package com.company;

public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setType("salmon");
        fish.setWeight(4.75);
        System.out.println("Class Fish");
        System.out.println("Type: " + fish.getType());
        System.out.println("Weight: " + fish.getWeight());

        Parrot parrot = new Parrot();
        parrot.setName("Ataman");
        parrot.setPrice(10000);
        System.out.println("\nClass Parrot");
        System.out.println("Name: " + parrot.getName());
        System.out.println("Price: " + parrot.getPrice());

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setColor("yellow");
        System.out.println("\nClass Cat");
        System.out.println("Name: " + cat.getName());
        System.out.println("Color: " + cat.getColor());

        Dog dog = new Dog();
        dog.setName("Alabay");
        dog.setBreed("shepherd");
        System.out.println("\nClass Dog");
        System.out.println("Name: " + dog.getName());
        System.out.println("Breed: " + dog.getBreed());
    }
}