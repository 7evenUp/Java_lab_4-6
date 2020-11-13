package com._7evenUp;

import java.util.ArrayList;

public class CommodityList {
    ArrayList<Commodity> commodities = new ArrayList<>();

    public void AddToList(Commodity commodityItem) {
        commodities.add(commodityItem);
    }

    public void PrintList() {
        commodities.forEach(System.out::println);
    }
}
