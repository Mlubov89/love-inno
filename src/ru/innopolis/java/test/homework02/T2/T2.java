package ru.innopolis.java.test.homework02.T2;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-е целое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int b = scanner.nextInt();
        int sum = Integer.sum(a, b);
        System.out.println("Сумма двух целых чисел: " + sum);
        int difference = Math.subtractExact(a, b);
        System.out.println("Разность двух целых чисел: " + difference);
        int product= Math.multiplyExact(a, b);
        System.out.println("Произведение из двух целых чисел: " + product);
        int average = (a + b) / 2;
        System.out.println("Среднее из двух целых чисел: " + average);
        int distance = Math.abs(a - b);
        System.out.println("Расстояние двух целых чисел: " + distance);
        int max = Math.max(a, b);
        System.out.println("Максимальное целое число: " + max);
        int min = Math.min(a, b);
        System.out.println("Минимальное целое число: " + min);
    }
}
