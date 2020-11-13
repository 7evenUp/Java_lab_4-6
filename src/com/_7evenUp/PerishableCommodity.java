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
}
