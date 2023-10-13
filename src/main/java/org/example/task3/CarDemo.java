package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {
    private List<Car> cars;

    public CarDemo(){
        cars = new ArrayList<>();
        fillList();
    }

    private void fillList(){
        cars.add(new Car("Car1", 2018, 25000.0, "Red", 2.0));
        cars.add(new Car("Car2", 2020, 30000.0, "Blue", 2.5));
        cars.add(new Car("Car3", 2019, 18000.0, "Black", 1.8));
        cars.add(new Car("Car4", 2022, 35000.0, "White", 2.4));
        cars.add(new Car("Car5", 2017, 22000.0, "Red", 2.2));
    }

    private void showCars(){
        cars.forEach(System.out::println);
    }

    private void showCarsWithColor(String color){
        System.out.println(color + " Cars:");
        cars.stream()
                .filter(car -> car.getColor().equals(color))
                .forEach(System.out::println);
    }

    private void showCarsWithEngineCapacity(double engineCapacity){
        System.out.println("Cars with Engine Capacity " + engineCapacity + " :");
        cars.stream()
                .filter(car -> car.getEngineCapacity() == engineCapacity)
                .forEach(System.out::println);
    }

    private void showCarsWithPrice(double price){
        System.out.println("Expensive Cars (Price > $" + price + "):");
        cars.stream()
                .filter(car -> car.getPrice() > price)
                .forEach(System.out::println);
    }

    private void showCarsWithStartEndYear(int startYear, int endYear){
        System.out.println("Cars Manufactured from " + startYear + " to " + endYear + ":");
        cars.stream()
                .filter(car -> car.getYearOfManufacture() >= startYear && car.getYearOfManufacture() <= endYear)
                .forEach(System.out::println);
    }

    public void getCitiesFunction(String color, double engineCapacity, double price, int startYear, int endYear){
        showCars();
        showCarsWithColor(color);
        showCarsWithEngineCapacity(engineCapacity);
        showCarsWithPrice(price);
        showCarsWithStartEndYear(startYear, endYear);
    }
}
