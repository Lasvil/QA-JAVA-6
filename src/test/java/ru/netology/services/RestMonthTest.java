package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestMonthTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restMonth.csv")
    public void calculateRest(int income, int expenses, int threshold) {
        RestMonth service = new RestMonth();
        int rest = service.calculate(income, expenses, threshold);
        System.out.println("Месяцев отдыха в году - " + rest);

    }
}