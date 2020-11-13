package com._7evenUp;

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
}
