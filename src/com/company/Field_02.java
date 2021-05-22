package com.company;

public class Field_02 {
    public static void main(String[] args) {
        double size = 100;
        double productivity = 20;
        double percentSize = 5;
        double percentProductivity = 2;

        int maxYear = 8;
        int currentYear = 1;

        double sumCrop = size * productivity;
        int finishCropYear = 6;

        String outputForProductivity = "";
        String outputForSize = "";

        while (currentYear < maxYear) {
            size = size + size * percentSize / 100;
            productivity = productivity + productivity * percentProductivity / 100;

            currentYear++;

            if (currentYear <= finishCropYear) {
                sumCrop += size * productivity;
            }

            outputForProductivity += String.format(("Урожайность за %d ый год = %.3f\n"), currentYear, productivity);

            if (currentYear >= 4 && currentYear <= 7) {
                outputForSize += String.format(("Площадь участка за %d ый год = %.3f\n"), currentYear, size);
            }
        }

        System.out.println(outputForProductivity);

        System.out.println(outputForSize);

        System.out.println(String.format(("Суммарный урожай за %d лет = %.3f\n"), finishCropYear, sumCrop));
    }
}
