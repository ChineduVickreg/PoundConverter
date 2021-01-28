package udemyfullcourse.timbuchalkavariables;

// An Application that converts weights from Pounds to Kilograms.

import java.util.Scanner;

public class PoundConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of pounds");
        double pounds = scanner.nextDouble();

        System.out.printf("The result is: %fkg", convertToKilogram(pounds));

    }
    public static double convertToKilogram(double pounds){
        double onePound = 0.45359237;
        double kilogram = onePound;
        double convertPoundsToKilograms = pounds * kilogram;


        return convertPoundsToKilograms;
    }
}
