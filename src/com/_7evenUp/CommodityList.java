package com._7evenUp;


import java.io.Serializable;
import java.util.ArrayList;

public class CommodityList implements Serializable {
    ArrayList<Commodity> commodities;

    CommodityList() { commodities = new ArrayList<>(); }

    CommodityList(CommodityList commodityList) {
        commodities = commodityList.GetCommodities();
    }

    public void AddToList(Commodity commodityItem) {
        commodities.add(commodityItem);
    }

    public ArrayList<Commodity> GetCommodities() { return commodities; }

    public void PrintList() {
        System.out.println("\u001b[31m" + "Список:" + "\u001b[0m");
        commodities.forEach(System.out::println);
    }
}
