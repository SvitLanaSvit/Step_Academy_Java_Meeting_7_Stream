package org.example.task2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Завдання 2:
        //Для набору назв міст(міста можуть повторюватися) потрібно:
        // Показати всі міста
        // Показати всі міста довжиною більше шести символів
        // Порахувати скільки разів зустрічається місто, назву якого ввів користувач
        // Порахувати всі міста, на вказану букву
        Scanner scanner = new Scanner(System.in);
        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York");
        cities.add("San Francisco");
        cities.add("Boston");
        cities.add("Los Angeles");
        cities.add("Miami");
        cities.add("Seattle");
        cities.add("Chicago");

        System.out.println("All Cities: ");
        cities.forEach(System.out::println);

        System.out.print("Enter a city name to count occurrences: ");
        String userCity = scanner.nextLine();

        System.out.println("Cities longer than six characters: ");
        cities.stream().
                filter(item -> item.length() > 6).
                forEach(System.out::println);

        long userCityCount = cities.stream()
                .filter(item -> item.equals(userCity))
                .count();
        System.out.println("Count of " + userCity + ": " + userCityCount);

        System.out.print("Enter a letter to count cities starting with that letter: ");
        String userLetter = scanner.next().toLowerCase();

        long citiesStartingWithLetterCount = cities.stream()
                .filter(item -> item.toLowerCase().startsWith(userLetter))
                .count();
        System.out.println("Count of cities starting with '" + userLetter + "': " + citiesStartingWithLetterCount);
    }
}
