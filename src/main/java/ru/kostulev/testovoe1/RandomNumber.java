package ru.kostulev.testovoe1;

public class RandomNumber {
    private int number= (int)(Math.random()* 100500);

    public int getNumber() {
        return number;
    }
}
