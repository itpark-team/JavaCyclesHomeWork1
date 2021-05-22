package com.company;

public class Skier_01 {

    public static void main(String[] args) {
        double distance = 10;
        double percent = 10;
        int finishDay = 10;
        int currentDay = 1;

        double sum7days = distance;
        int finishSumDay = 7;

        while (currentDay < finishDay) {
            distance = distance + distance * percent / 100;

            currentDay++;

            if (currentDay <= finishSumDay) {
                sum7days += distance;
            }

            System.out.println(String.format(("Пробег за %d ый день = %.3f"), currentDay, distance));
        }
        System.out.println(String.format(("Пробег за %d дней = %.3f"), finishSumDay, sum7days));
    }
}
