package ru.innopolis.java.test.homework012;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String fullName = null;
        String dateOfBirth = null;
        long mobilePhoneNumber = 0;
        char gender = 0;
        int age = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Фамилия Имя Отчество датарождения номертелефона пол возраст: ");
            String input = scanner.nextLine();

            String[] words = input.split(" ");

            if (words.length != 7) {
                throw new ArrayIndexOutOfBoundsException();
            }
            fullName = words[0] + " " + words[1] + " " + words[2];
            dateOfBirth = words[3];
            mobilePhoneNumber = Long.parseLong(words[4]);
            gender = words[5].charAt(0);
            age = Integer.parseInt(words[6]);

            if (!dateOfBirth.matches("\\d{2}.\\d{2}.\\d{4}")) {
                throw new IllegalArgumentException();
            }

            if (words[5].length() != 1 || (gender != 'm' && gender != 'f')) {
                throw new MyCustomException("А вы точно правильно указали пол? У нас можно только 'm' или 'f'");
            }

            PersonManagement person = new PersonManagement(fullName, dateOfBirth, mobilePhoneNumber, gender, age);
            writeToFile(person);

            System.out.println("Данные успешно записаны в файл " + words[0] + ".txt");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Упс! Кажется что-то не так... Перепроверьте введенные данные.");
        } catch (IllegalArgumentException e) {
            System.out.println("Что-то не так с форматом даты рождения... Перепроверьте правильность ввода.");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Упс! Не удалось записать в файл.");
        }

        // Марфуткина Любовь Викторовна 04.11.1989 89518548833 f 34
        // Марфуткина Анна Викторовна 04.10.1988 89518548833 f 36
        // Лозовой Захар Алексеевич 09.01.2013 89600754458 m 11
        // Отто Ольга Игоревна 08.10.1988 89204246310 f 36
        // Лозовая Алёна Алексеевна 29.10.2009 89600754458 f 14


    }

    private static void writeToFile(PersonManagement person) throws IOException {
        try (FileWriter fileWriter = new FileWriter("/Users/lubovmarfutkina/IdeaProjects/love-inno/src/ru/innopolis/java/test/homework012/"
                + person.getFullName().split(" ")[0] + ".txt", true)) {
            fileWriter.write(person + "\n");
        }
    }
}
