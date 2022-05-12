package com.company;

import java.util.Arrays;


public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int capacityOrder) {
        nrArticles = 0;
        this.capacityOrder = capacityOrder;
        articles = new Article[capacityOrder];
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nrArticles=" + nrArticles +
                ", capacityOrder=" + capacityOrder +
                ", articles=" + Arrays.toString(articles) +
                '}';
    }

    public void addArticle(Article a) {
        if (nrArticles >= capacityOrder) {
            increaseArray();
        }
        articles[nrArticles] = a;
        nrArticles++;
    }

    public int findMostExpensiveArticle() {
        int position = 0;
        for (int i = 0; i < articles.length; i++) {
            if (articles[i].getPrice() > articles[position].getPrice()) {
                position = i;
            }
        }
        return position + 1;
    }

    public int findMostExpensiveOrderPosition() {
        int position = 0;
        for (int i = 0; i <= articles.length; i++) {
            if (articles[i].getPrice() * (articles[i].getNumber()) > articles[position].getPrice() * (articles[position].getNumber())) {
                position = i;
            }
        }
        return position+1;
    }

    public double sumOrder() {
        double sum = 0;
        for (Article a : articles) {
            sum = sum + (a.getPrice() * a.getNumber());
        }
        return sum;
    }

    public double calculateTax() {
        double tax = 0;
        for (Article a : articles) {
            if (a.getPrice() < 20) {
                tax += (a.getPrice() * 0.005);
            } else {
                tax += (a.getPrice() * 0.2);
            }
        }
        return tax;
    }

    public double sumOrderWithTax() {
        double sum = 0;
        for (Article a : articles) {
            sum += sumOrder() + calculateTax();
        }
        return sum;
    }

    private void increaseArray() {
       /* Article[] articles1 = new Article[articles.length + 1];
        int index = 0;
        for (int i = 0; i < articles.length; i++) {
            if (i != articles.length) {
                articles1[index] = articles[i];
                index++;*/
        int newCapacity = capacityOrder+1;
        Article[] biggerArray = new Article[newCapacity];
        for (int i = 0; i < nrArticles; i++) {
            biggerArray[i] = articles[i];
        }
        capacityOrder = newCapacity;
        articles = biggerArray;
    }

   /* public void removeArticle(int number) {
        Article[] articles1 = new Article[articles.length - 1];
        int index = 0;
       for (Article a : articles) {
           if (number < )
       }

        for (int i = 0; i < articles.length; i++) {
            if (i != number) {
                articles1[index] = articles[i];
                index++;
            }
        }
    }*/
}

