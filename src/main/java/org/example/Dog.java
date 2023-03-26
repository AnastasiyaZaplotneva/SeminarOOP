package org.example;

public class Dog extends Animal{

//    static int count;

    public Dog(Integer runDistance, Integer swimDistance, String name, String typeOfAnimals) {
        super(runDistance, swimDistance, name, typeOfAnimals);
        count++;
    }

    @Override
    void swim(Integer distance) {
        if(distance>swimDistance) {
            System.out.println(name + " не доплыл");
        }
        else {
            System.out.println(name + " проплыл " + distance);
        }
    }
}
