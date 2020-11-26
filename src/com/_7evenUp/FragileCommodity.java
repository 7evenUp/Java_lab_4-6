package com._7evenUp;
import java.util.Scanner;

public class FragileCommodity extends Commodity {
    double fragileCoefficient;

    FragileCommodity(int productCode, String name, String desc, double wholesalePrice, double retailPrice, double fragileCoefficient) {
        super(productCode, name, desc, wholesalePrice, retailPrice);
        this.fragileCoefficient = fragileCoefficient;
    }

    public double getFragileCoefficient() { return fragileCoefficient; }
    public void setFragileCoefficient(double fragileCoefficient) { this.fragileCoefficient = fragileCoefficient; }

    @Override
    public String toString() {
        String resultString = super.toString();
        resultString += String.format("FragileCoefficient: %.2f\n", fragileCoefficient);

        return resultString;
    }

    public static FragileCommodity makeNewFragileCommodity(Scanner input) {
        System.out.println("\u001b[31m" + "Программное создание класса FragileCommodity" + "\u001b[0m");

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
        System.out.println("Введите коэффициент хрупкости:");
        double newFragile = input.nextFloat();

        return new FragileCommodity(newCode, newName, newDesc,
                                    newWholesalePrice, newRetailPrice, newFragile);
    }
}
