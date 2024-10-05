package ru.innopolis.java.test.homework04.T2;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String symbol = ">>-->";
        String symbol2 = "<--<<";
        int lastIndex = 0;
        int index = 0;
        while ((lastIndex = input.indexOf(symbol, lastIndex)) != -1) {
            index++;
            lastIndex += symbol.length();
        }
        while ((lastIndex = input.indexOf(symbol2, lastIndex)) != -1) {
            index++;
            lastIndex += symbol2.length();
        }
        System.out.println(index);
    }
}

// >>-->>>-->>>-->-------<--<<<--<<<--<<<--<<----<<<<>>>> //
