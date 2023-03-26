package org.example.task76;

public class Main {
    public static void main(String[] args) {
        Human people = new Human();
        Car car = new Car();

        people.drive(car);
        people.drive(new Bicycle());
        people.stop();
        people.stop();
    }
}
