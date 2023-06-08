package com.javaprojects.classes1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", new BigDecimal(34_000), EngineType.PETROL);
//        Exercise 02
            System.out.println(car.getManufacturer());
            System.out.println(car.getEngineType());
            System.out.println(car.getPrice());


//        Exercise 03
            car.setPrice(new BigDecimal(45_000));
            car.setEngineType(EngineType.ELECTRIC);
            System.out.println(car);


//        Exercise 04
//          Make an Enum EngineType


//        Exercise 05
//          The datatype to store all the cars is an array

        System.out.println("Total cars in stock: " + countCars());

    }
//        Exercise 06
            public static int countCars() {
                Car vwPolo = new Car("Volkswagen", new BigDecimal(34_000), EngineType.ELECTRIC);
                Car audiQ3 = new Car("Audi", new BigDecimal(54_000), EngineType.ELECTRIC);
                Car yaris = new Car("Toyota", new BigDecimal(44_000), EngineType.PETROL);

                Car[] cars = {vwPolo, audiQ3, yaris};

                CarDealerShip c = new CarDealerShip("Van Houten Cars", 12, 25);
                int totalCars = 0;
                for (int i = 0; i < cars.length; i++) {
                    if (c.getMaxCarsInStock() > totalCars) {
//                          System.out.println("The total cars can not be more than" + c.getMaxCarsInStock());
                        totalCars++;
//                        return totalCars;
                    }
                }
                return totalCars;
            }
}
