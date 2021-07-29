package com.company;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = {
                new Cat("Vasya", 10),
                new Cat("Sharick" , 20),
                new Cat("Vaity", 30),
                new Cat("Marpha", 40),
                new Cat("Matroskin",  30),
                new Cat("Schrödinger's cat",100000)
        };
        for (Cat cat: cats) {
            cat.Eat(plate);
            String status = cat.isHungry()?"hungry":"not hungry";
            System.out.printf("%s is %s%n",cat.getName(),status);
        }

    }
}
