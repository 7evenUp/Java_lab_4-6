package com._7evenUp;
import java.util.Scanner;

public class PerishableCommodity extends Commodity {
    double timeToServe;

    PerishableCommodity(int productCode, String name, String desc, double wholesalePrice, double retailPrice, double timeToServe) {
        super(productCode, name, desc, wholesalePrice, retailPrice);
        this.timeToServe = timeToServe;
    }

    public double getTimeToServe() { return timeToServe; }
    public void setTimeToServe(double timeToServe) { this.timeToServe = timeToServe; }

    @Override
    public String toString() {
        String resultString = super.toString();
        resultString += String.format("Time to serve: %.2f\n", timeToServe);

        return resultString;
    }

    public static PerishableCommodity makeNewPerishableCommodity(Scanner input) {
        System.out.println("\u001b[31m" + "Программное создание класса PerishableCommodity" + "\u001b[0m");

        System.out.println("Введите название продукта:");
        input.nextLine();
        String newName = input.nextLine();
        System.out.println("Введите код продукта:");
        int newCode = input.nextInt();
        System.out.println("Введите описание продукта:");
        input.nextLine();
        String newDesc = input.nextLine();
        System.out.println("Введите оптовую цену продукта:");
        double newWholesalePrice = input.nextFloat();
        System.out.println("Введите розничную цену продукта:");
        double newRetailPrice = input.nextFloat();
        System.out.println("Введите срок хранения:");
        double newTimeToServe = input.nextFloat();

        return new PerishableCommodity(newCode, newName, newDesc,
                                    newWholesalePrice, newRetailPrice, newTimeToServe);
    }
}
