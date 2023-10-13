package org.example.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TV {
    private String modelName;
    private int yearOfManufacture;
    private double price;
    private double diagonal;
    private String producer;

    @Override
    public String toString() {
        return "TV{" +
                "modelName='" + modelName + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", producer='" + producer + '\'' +
                '}';
    }
}
