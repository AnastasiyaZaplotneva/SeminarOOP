package org.example;

public class Tiger extends Cat{
    static int count;

    public Tiger(Integer runDistance, Integer swimDistance, String name, String typeOfAnimals) {
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
