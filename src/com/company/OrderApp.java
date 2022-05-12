package com.company;

import java.util.Arrays;

public class OrderApp {
    public static void main(String[] args) {
        Article a1 = new Article("Schokolade", 1, 5);
        Article a2 = new Article("Staubsauger", 2, 35);
        Article a3 = new Article("Handy", 3, 550);
        Article a4 = new Article("Wasser", 4, 2.5);
        Article a5 = new Article("Rucksack", 2, 42);

        Order o1 = new Order(4);

        o1.addArticle(a1);
        o1.addArticle(a2);
        o1.addArticle(a3);
        o1.addArticle(a4);


        System.out.println(o1);
        System.out.println("The most expensive article is: " + o1.findMostExpensiveArticle());
        System.out.println("The sum of the order is " + o1.sumOrder());

        System.out.println("The tax for this order is " + o1.calculateTax());
        System.out.println("The price of this order including tax is: " + o1.sumOrderWithTax());

        o1.addArticle(a5);

    }
}
