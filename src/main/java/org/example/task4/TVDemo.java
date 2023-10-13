package org.example.task4;

import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class TVDemo {
    private List<TV> tvs;

    public TVDemo() {
        tvs = new ArrayList<>();
        fillList();
    }

    private void fillList() {
        tvs.add(new TV("TV1", 2021, 500.0, 43.0, "Samsung"));
        tvs.add(new TV("TV2", 2020, 600.0, 55.0, "LG"));
        tvs.add(new TV("TV3", 2022, 400.0, 32.0, "Sony"));
        tvs.add(new TV("TV4", 2021, 800.0, 65.0, "Samsung"));
        tvs.add(new TV("TV5", 2022, 750.0, 50.0, "LG"));
    }

    private void showTVs() {
        System.out.println("All TVs:");
        tvs.forEach(System.out::println);
    }

    private void showTvsWithDiagonal(double diagonal) {
        System.out.println("TVs with " + diagonal + " inches diagonal:");
        tvs.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .forEach(System.out::println);
    }

    private void showTVsWithProducer(String producer) {
        System.out.println(producer + " TVs:");
        tvs.stream()
                .filter(tv -> tv.getProducer().equals(producer))
                .forEach(System.out::println);
    }

    private void showTVsWithCurrentYear() {
        Year currentYear = Year.now();
        int year = currentYear.getValue();

        System.out.println("TVs manufactured in current year " + year + ":");
        tvs.stream()
                .filter(tv -> tv.getYearOfManufacture() == year)
                .forEach(System.out::println);
    }

    private void showTVsWithPrice(double price){
        System.out.println("Expensive TVs (Price > $" + price + "):");
        tvs.stream()
                .filter(tv -> tv.getPrice() > price)
                .forEach(System.out::println);
    }

    private  void showTVsWithSortPrice(){
        System.out.println("TVs sorted by ascending price:");
        tvs.stream()
                .sorted(Comparator.comparing(tv -> tv.getPrice()))
                .forEach(System.out::println);
    }

    private  void showTVsWithSortPriceDESC(){
        System.out.println("TVs sorted by ascending price:");
        tvs.stream()
                .sorted(Comparator.comparing(tv -> ((TV)tv).getPrice()).reversed())
                .forEach(System.out::println);
    }

    private  void showTVsWithSortDiagonal(){
        System.out.println("TVs sorted by ascending diagonal:");
        tvs.stream()
                .sorted(Comparator.comparing(tv -> tv.getDiagonal()))
                .forEach(System.out::println);
    }

    private  void showTVsWithSortDiagonalDESC(){
        System.out.println("TVs sorted by ascending diagonal:");
        tvs.stream()
                .sorted(Comparator.comparing(tv -> ((TV)tv).getDiagonal()).reversed())
                .forEach(System.out::println);
    }

    public void getTVsFunctions(double diagonal, String producer, double price){
        showTVs();
        showTvsWithDiagonal(diagonal);
        showTVsWithProducer(producer);
        showTVsWithCurrentYear();
        showTVsWithPrice(price);
        showTVsWithSortPrice();
        showTVsWithSortPriceDESC();
        showTVsWithSortDiagonal();
        showTVsWithSortDiagonalDESC();
    }
}
