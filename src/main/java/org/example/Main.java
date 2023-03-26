package org.example;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new HomeCat(200, 0, "Barsik", "homecat"),
                new Dog(500, 10, "Bobik", "dog"),
                new Tiger(800, 20, "Sherhan", "tiger")
        };

        for (Animal a: animals) {
            a.run(450);
            a.swim(15);
        }
        System.out.println(Animal.count);
        System.out.println(HomeCat.count);
        System.out.println(Dog.count);
        System.out.println(Tiger.count);
    }
}