package ru.innopolis.java.test.homework01.T2;

import java.util.Random;

public class T2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(3);
        int number2 = random.nextInt(3);
        //камень-0,ножницы-1,бумага-2

        System.out.println(number);
        System.out.println(number2);

        if (number == 0){
            if (number2 == 1){
                System.out.println("Вася выиграл");
            }
            else if (number2 == 2){
                System.out.println("Петя выиграл");
            }
            else {
                System.out.println("ничья");
            }
        }
        if (number == 1){
            if (number2 == 0){
                System.out.println("Петя выиграл");
            }
            else if (number2 == 2){
                System.out.println("Вася выиграл");
            }
            else {
                System.out.println("ничья");
            }
        }
        if (number == 2){
            if (number2 == 0){
                System.out.println("Вася выиграл");
            } else if (number2 == 1){
                System.out.println("Петя выиграл");
            }
            else {
                System.out.println("ничья");
            }
        }
    }
}