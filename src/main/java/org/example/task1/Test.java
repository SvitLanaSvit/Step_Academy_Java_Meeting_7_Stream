package org.example.task1;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Завдання 1:
        //Для набору випадково згенерованих цілих чисел потрібно:
        // Кількість парних
        // Кількість непарних
        // Кількість рівних нулю
        // Кількість рівних значенню, введеному користувачем
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<Integer> randomNumbers = random.ints(100, -100, 100).boxed().toList();
        System.out.println("Random Numbers: " + randomNumbers);

        System.out.print("Enter a number to count occurrences: ");
        int userValue = scanner.nextInt();

        long evenCount = randomNumbers.stream().filter(item -> item % 2 == 0).count();
        long oddCount = randomNumbers.stream().filter(item -> item % 2 != 0).count();
        long zeroCount = randomNumbers.stream().filter(item -> item == 0).count();
        long userValueCount = randomNumbers.stream().filter(item -> item == userValue).count();

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of zeros: " + zeroCount);
        System.out.println("Number equal to " + userValue + ": " + userValueCount);
    }
}
