package ru.x5;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value);
    }
}
