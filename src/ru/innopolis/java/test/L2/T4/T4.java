package ru.innopolis.java.test.L2.T4;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов сетки: ");
        int rowsAndColumns = scanner.nextInt();
        System.out.println("Введите повторяемый элемент сетки: ");
        String symbol = scanner.next();
        for (int i =0; i < rowsAndColumns; i++){
            for (int j =0; j < rowsAndColumns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
