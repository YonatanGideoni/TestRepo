package com.iasa.example_proj;

public class Garage {
    final int numCars; // this is an attribute/state variable. It happens to also be a constant
    static int numGarages = 0; // this is a class variable/class attribute
    private Car[] cars; // this is another attribute, but a private one - it can only be accessed internally

    /**
     * This is Javadoc-style documentation. Here specifically it's for this constructor - the method which creates an
     * instance of the "garage" object. It is called when creating a new object via "new Garage(...);"
     *
     * @param cars An array of all the cars inside the garage.
     */
    public Garage(Car[] cars) {
        this.cars = cars;
        numCars = cars.length;
        numGarages++;
    }

    /**
     * Finds and returns the price of the most expensive car in the garage.
     *
     * @return the price of the most expensive car.
     */
    public int getMostExpensiveCarPrice() { // this is a method
        int largestPrice = Integer.MIN_VALUE;
        for (Car car : cars) {
            // here the garage class interacts with the cars class via calling the getPrice method
            largestPrice = Math.max(largestPrice, car.getPrice());
        }

        return largestPrice;
    }

    public void createGarageWithTrashCansWithWheels(int numTrashCansWithWheels) {
        cars = new Car[numTrashCansWithWheels];
        for (int i = 0; i < numTrashCansWithWheels; i++) {
            // here new "Car" variables are created.
            cars[i] = new Car(0, "TrashCanWithWheels");
        }
    }

}
