package com._7evenUp;
import java.util.UUID;
import java.util.Scanner;

public class Commodity {
    UUID id;
    int productCode;
    String name, desc;
    double wholesalePrice, retailPrice;

    Commodity(int productCode, String name, String desc, double wholesalePrice, double retailPrice) {
        id = UUID.randomUUID();
        this.productCode = productCode;
        this.name = name;
        this.desc = desc;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public int getProductCode() { return this.productCode; }
    public void setProductCode(int prCode) { this.productCode = prCode; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return this.desc; }
    public void setDescription(String desc) { this.desc = desc; }

    public double getWholesalePrice() { return this.wholesalePrice; }
    public void setWholesalePrice(double wholesalePrice) { this.wholesalePrice = wholesalePrice; }

    public double getRetailPrice() { return this.retailPrice; }
    public void setRetailPrice(double retailPrice) { this.retailPrice = retailPrice; }

    public String toString() {
        String resultString = "Object ID: " + id + "\n";
        resultString += String.format("%s: product code №%d\n", name, productCode);
        resultString += String.format("Description: %s\n", desc);
        resultString += String.format("WholePrice: %.2f\nRetailPrice: %.2f\n", wholesalePrice, retailPrice);

        return resultString;
    }
}
