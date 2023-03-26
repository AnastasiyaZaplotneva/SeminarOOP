package org.example;

public class HomeCat extends Cat{

    static int count;

    public HomeCat(Integer runDistance, Integer swimDistance, String name, String typeOfAnimals) {
        super(runDistance, swimDistance, name, typeOfAnimals);
        count++;
    }

    @Override
    void swim(Integer distance) {
        System.out.println(name + " не способен проплыть " + distance);
    }
}
