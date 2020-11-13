package com._7evenUp;

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
}
