package com.company;

import java.security.PublicKey;
import java.util.Arrays;


public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int capacityOrder) {
        nrArticles = 0;
        this.capacityOrder = capacityOrder;
        Article[] articles = new Article[capacityOrder];
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
        int counter = 0;
        articles[counter] = a;
        counter++;
    }

    public int findMostExpensiveArticle (){
        int position = 0;
        for (int i = 0; i < articles.length; i++) {
            if (articles[i].getPrice() >= articles[position].getPrice()){
            articles[i] = articles[position];
            }
        }
        return position;
    }
    public int findMostExpensiveOrderPosition() {
        int position = 0;
        for (int i = 0; i <= articles.length )
        return position;
    }
}

