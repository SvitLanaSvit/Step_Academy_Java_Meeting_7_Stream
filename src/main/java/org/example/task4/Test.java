package org.example.task4;

public class Test {
    public static void main(String[] args) {
        //Завдання 4:
        //Створіть клас «Телевізор». Він має містити інформацію про назву моделі, рік випуску, ціна, діагональ,
        //виробник. Потрібно створити набір телевізорів і виконати наступні завдання:
        // Показати всі телевізори
        // Показати всі телевізори з вказаною діагоналлю
        // Показати всі телевізори вказаного виробника
        // Показати всі телевізори поточного року
        // Показати всі телевізори дорожчі вказаної ціни
        // Показати всі телевізори, відсортовані по ціні зростання
        // Показати всі телевізори, відсортовані по ціні спадання
        // Показати всі телевізори, відсортовані по діагоналі по зростанню
        // Показати всі телевізори, відсортовані по діагоналі по спаданню
        TVDemo demo = new TVDemo();
        double specifiedDiagonal = 55.0;
        String specifiedManufacturer = "Samsung";
        double specifiedPrice = 600.0;

        demo.getTVsFunctions(specifiedDiagonal, specifiedManufacturer, specifiedPrice);
    }
}