package org.example;

public abstract class Animal {
    Integer runDistance;
    Integer swimDistance;
    String name;
    String typeOfAnimals;
    static int count;


    public Animal(Integer runDistance, Integer swimDistance, String name, String typeOfAnimals) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.name = name;
        this.typeOfAnimals = typeOfAnimals;
        count++;
    }

    abstract void swim(Integer distance);
    void run(Integer distance) {
        if(distance>runDistance) {
            System.out.println(name + " не добежал");
        }
        else {
            System.out.println(name + " пробежал " + distance);
        }

    }
}
