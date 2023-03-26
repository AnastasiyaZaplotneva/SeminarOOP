package org.example.task76;

public class Human {

    private Car lastCar;
    private Skate lastSkate;
    private Bicycle lastBicycle;
    void drive(Car car) {
        car.run();
        lastCar = car;
    }

    void drive(Skate skate) {
        skate.run();
        lastSkate = skate;
    }


    void drive(Bicycle bicycle) {
        bicycle.run();
        lastBicycle = bicycle;
    }
    void stop() {
        if(lastCar != null) {
            lastCar.stop();
            lastCar = null;
        }
        if(lastSkate != null) {
            lastSkate.stop();
            lastSkate = null;
        }
        if(lastBicycle != null) {
            lastBicycle.stop();
            lastBicycle = null;
        }
    }


}
