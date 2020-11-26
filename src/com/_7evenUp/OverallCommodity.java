package com._7evenUp;
import java.util.Scanner;

public class OverallCommodity extends Commodity {
    double height, width, length;

    OverallCommodity(int productCode, String name, String desc, double wholesalePrice, double retailPrice, double height, double width, double length) {
        super(productCode, name, desc, wholesalePrice, retailPrice);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    @Override
    public String toString() {
        String resultString = super.toString();
        resultString += String.format("Height: %.2f\n", height);
        resultString += String.format("Width: %.2f\n", width);
        resultString += String.format("Length: %.2f\n", length);

        return resultString;
    }

    public static OverallCommodity makeNewOverallCommodity(Scanner input) {
        System.out.println("\u001b[31m" + "Программное создание класса OverralCommodity" + "\u001b[0m");

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
        System.out.println("Введите высоту продукта:");
        double newHeight = input.nextFloat();
        System.out.println("Введите ширину продукта:");
        double newWidth = input.nextFloat();
        System.out.println("Введите длину продукта:");
        double newLength = input.nextFloat();

        return new OverallCommodity(newCode, newName, newDesc,
                                    newWholesalePrice, newRetailPrice,
                                    newHeight, newWidth, newLength);
    }
}
