package com.company;

import java.util.Scanner;

public class Sequence_03 {
    public static void main(String[] args) {
        int countNumbers = 0;
        int currentNumber;
        int sum = 0;
        final int EXIT_CODE = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("input current number: ");
            currentNumber = input.nextInt();

            if (currentNumber != EXIT_CODE) {
                sum += currentNumber;
                countNumbers++;
            }
        }
        while (currentNumber != EXIT_CODE);

        System.out.println(String.format(("Сумма всех чисел последовательности = %d"), sum));
        System.out.println(String.format(("Кол-во чисел последовательности = %d"), countNumbers));
    }
}
