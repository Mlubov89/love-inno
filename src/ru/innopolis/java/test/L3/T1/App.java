package ru.innopolis.java.test.L3.T1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int price = scanner.nextInt();
        int diagonal = scanner.nextInt();
        Television television = new Television(name, price, diagonal);
        System.out.println(television);
        Television television2 = new Television("lg", 10000, 30);
        television2.on();
    }
}
