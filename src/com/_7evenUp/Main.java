package com._7evenUp;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommodityList commodities = new CommodityList();
        CommodityList downloadedCommodities = new CommodityList();
        showMenu();

        while (true) {
            int menuItem = scanner.nextInt();

            if (menuItem == 7) {
                System.out.println("Вы закрыли программу");
                System.exit(0);
            }
            else if (menuItem == 1) {
                commodities.PrintList();
            }
            else if (menuItem == 2) {
                FragileCommodity oc = FragileCommodity.makeNewFragileCommodity(scanner);
                System.out.println(oc);
                commodities.AddToList(oc);
            }
            else if (menuItem == 3) {
                PerishableCommodity oc = PerishableCommodity.makeNewPerishableCommodity(scanner);
                System.out.println(oc);
                commodities.AddToList(oc);
            }
            else if (menuItem == 4) {
                OverallCommodity oc = OverallCommodity.makeNewOverallCommodity(scanner);
                System.out.println(oc);
                commodities.AddToList(oc);
            }
            else if (menuItem == 5) {
                try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("output.out"))) {
                    outStream.writeObject(commodities);
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
            }
            else if (menuItem == 6) {
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("output.out"))) {
                    commodities = (CommodityList)inputStream.readObject();
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
            }
            showMenu();
        }
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
