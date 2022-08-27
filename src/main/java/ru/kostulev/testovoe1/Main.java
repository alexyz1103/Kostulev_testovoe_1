package ru.kostulev.testovoe1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Page page = new Page();
        page.getPage();
        System.out.println("GET " + page.getUrl());
        System.out.println(page.getText());
        System.out.println("Частоты:");
        Statistic statistic = new Statistic();
        statistic.setStats(page.getText());
        statistic.setAverage();
        statistic.setApproximate();
    }
}