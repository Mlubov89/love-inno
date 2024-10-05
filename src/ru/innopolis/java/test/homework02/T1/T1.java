package ru.innopolis.java.test.homework02.T1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите степень в градусах Фаренгейта:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println( fahrenheit + " градусов по Фаренгейту равна " + celsius + " по Цельсию");
    }
}