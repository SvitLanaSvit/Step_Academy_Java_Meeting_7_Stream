package org.example.task3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Завдання 3:
        //Створіть клас «Автомобіль». Він має містити інформацію про назву автомобіля, рік випуску, ціну, колір,
        //об’єм двигуна. Потрібно створити набір автомобілів і виконати наступні завдання:
        // Показати всі автомобілі
        // Показати всі автомобілі вказаного кольору
        // Показати всі автомобілі вказаного об’єму двигуна
        // Показати всі автомобілі дорожчі вказаної ціни
        // Показати всі автомобілі чий рік випуску знаходиться в вказаному діапазоні
        CarDemo demo = new CarDemo();
        String specifiedColor = "Red";
        double specifiedEngineCapacity = 2.0;
        double specifiedPrice = 25000.0;
        int startYear = 2018;
        int endYear = 2021;

        demo.getCitiesFunction(specifiedColor, specifiedEngineCapacity, specifiedPrice, startYear, endYear);
    }
}
