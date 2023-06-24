package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestMonth service = new RestMonth();
        int rest = service.calculate(10_000, 3_000, 20_000);
        System.out.println("Месяцев отдыха в году - " + rest);

    }
}