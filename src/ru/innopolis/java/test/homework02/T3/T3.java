package ru.innopolis.java.test.homework02.T3;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Исходная строка: ");
        String input = scanner.nextLine();
        System.out.println("Сколько раз вывести строку? ");
        int number = scanner.nextInt();
        String result = input.repeat(number);
        System.out.println("Повторяем " + input + " " + number + " раз: " + result);

    }
}
