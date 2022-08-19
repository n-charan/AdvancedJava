package com.varargs;

public class Varags {

    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        printShoppingList(item1, item2, item3);
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");
    }

    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for(int i=0; i < items.length; i++) {
            System.out.println(i + 1 + ". " + items[i]);
        }
    }

    /*private static void printShoppingList(String str1, String str2) {
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + str1);
        System.out.println("2. " + str2);
    }

    private static void printShoppingList(String str1, String str2, String str3) {
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + str1);
        System.out.println("2. " + str2);
        System.out.println("3. " + str3);
    }

    private static void printShoppingList(String[] items) {
        System.out.println("SHOPPING LIST");
        for(int i=0; i < items.length; i++) {
            System.out.println(i + 1 + ". " + items[i]);
        }
    }*/
}
