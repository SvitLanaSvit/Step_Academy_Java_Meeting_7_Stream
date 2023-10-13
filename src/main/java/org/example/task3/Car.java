package org.example.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Car {
    private String name;
    private int yearOfManufacture;
    private double price;
    private String color;
    private double engineCapacity;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
