package com.company;

import java.util.Scanner;

public class Coins_04 {
    public static void main(String[] args) {

        int countCoins;
        int i = 0;

        int currentCoin;
        int countEagles = 0;
        int countTails = 0;

        final int EAGLE = 1;
        final int TAIL = 0;

        Scanner input = new Scanner(System.in);

        countCoins = input.nextInt();

        while (i < countCoins) {
            currentCoin = input.nextInt();

            switch (currentCoin) {
                case EAGLE:
                    countEagles++;
                    break;
                case TAIL:
                    countTails++;
                    break;
            }

            i++;
        }

        int needTurn = Math.min(countTails, countEagles);

        System.out.println(needTurn);
    }
}
