package org.example.seminar1.hw1;

import java.util.Scanner;

public class hw1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.nextLine();

        System.out.println("Результат: " + reverseWords(s));
    }

    public static String reverseWords(String s) {
        // Разбиваем строку на массив слов, используя пробел в качестве разделителя
        String[] words = s.split(" ");

        StringBuilder revers = new StringBuilder();

        // Обходим массив слов в обратном порядке и добавляем каждое слово в StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            // Если текущее слово не пустое, то добавляем его в StringBuilder
            if (!words[i].isEmpty()) {
                revers.append(words[i]).append(" ");
            }
        }
        // Удаляем последний пробел из строки
        revers.setLength(revers.length() - 1);

        // Возвращаем полученную строку
        return revers.toString();
    }
}
