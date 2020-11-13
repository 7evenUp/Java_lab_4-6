package com._7evenUp;

public class Main {

    public static void main(String[] args) {
	    FragileCommodity fragile = new FragileCommodity(1, "Fanera", "Very hrupkaya thing", 300, 400, 2.1);
        PerishableCommodity perishable = new PerishableCommodity(2, "Milk", "Liquid with white color", 50, 70, 5);
        OverallCommodity overall = new OverallCommodity(3, "Computer", "Just a thing", 3000, 5000, 1.6, .9, .1);

        CommodityList commodityList = new CommodityList();
        commodityList.AddToList(fragile);
        commodityList.AddToList(perishable);
        commodityList.AddToList(overall);

        commodityList.PrintList();
    }
}
