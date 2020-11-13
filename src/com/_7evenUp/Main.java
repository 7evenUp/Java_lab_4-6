package com._7evenUp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu();

        while (true) {
            int menuItem = scanner.nextInt();

            if (menuItem == 7) {
                System.out.println("Вы закрыли программу");
                System.exit(0);
            }
            else if (menuItem == 1) {

            }
            else if (menuItem == 2) {

            }
            else if (menuItem == 3) {

            }
            else if (menuItem == 4) {
                OverallCommodity oc = OverallCommodity.makeNewOverallCommodity(scanner);
                System.out.println(oc);
            }
            else if (menuItem == 5) {

            }
            else if (menuItem == 6) {

            }
            showMenu();
        }


//	    FragileCommodity fragile = new FragileCommodity(1, "Fanera",
//                                                        "Very hrupkaya thing", 300,
//                                                        400, 2.1);
//        PerishableCommodity perishable = new PerishableCommodity(2, "Milk",
//                                                        "Liquid with white color", 50,
//                                                        70, 5);
//        OverallCommodity overall = new OverallCommodity(3, "Computer",
//                                                        "Just a thing", 3000,
//                                                        5000, 1.6, .9, .1);
//
//        CommodityList commodityList = new CommodityList();
//        commodityList.AddToList(fragile);
//        commodityList.AddToList(perishable);
//        commodityList.AddToList(overall);
//
//        commodityList.PrintList();
    }

    private static void showMenu() {
        System.out.println("\n");
        System.out.println("1 - Show commodity");
        System.out.println("2 - Add FragileCommodity");
        System.out.println("3 - Add PerishableCommodity");
        System.out.println("4 - Add OverallCommodity");
        System.out.println("5 - Save program");
        System.out.println("6 - Load program");
        System.out.println("7 - Exit");
    }
}
