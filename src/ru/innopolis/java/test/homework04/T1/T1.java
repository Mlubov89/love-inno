package ru.innopolis.java.test.homework04.T1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        String keyboard = "qwertyuiopasdfghjklzxcvbnm";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одинсимвол — маленькую букву английского алфавита: ");
        String word = scanner.next();
        int index = keyboard.indexOf(word);
        if (word.equals("q")) {
            System.out.println("m");
        }
        else {
            char letter = keyboard.charAt(index - 1);
            System.out.println(letter);
        }
    }
}