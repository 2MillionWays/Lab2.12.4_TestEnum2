package com.brainacad.oop.testenum2;

public class Main {
    public static void main(String[] args) {

        Card [] deck = new Card[52];
        int cardIndex = 0;

        for (Rank rank : Rank.values()){
            for(Suit suit : Suit.values()){
                deck[cardIndex] = new Card(suit,rank);
                cardIndex++;
            }
        }
        for (Card card : deck){
            System.out.println("The Card: "+card);
        }
    }
}
