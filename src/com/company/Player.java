package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Player
{
    private ArrayList<Card> Hand;

    public Player()
    {
        this.Hand = new ArrayList<>();
    }
    public void lookAtHand()
    {
        for(Card card: this.Hand)
        {
            if(card.getTag() == Tag.FACE_DOWN)
            {
                card.setTag(Tag.FACE_UP);
            }
            System.out.println(card);
        }
    }
    public void getCards(Card card)
    {
        Hand.add(card);
    }
    /*
    Input:Hand Rank and Guess
    Output:Return cards that match your guess
    Description:The function returns an arraylist of all cards that match the rank of the guess
     */
    public ArrayList<Card> checkHand(ArrayList<Card> Hand, Rank guess)
    {
        ArrayList<Card> newHand = new ArrayList<>();
        for(int i = 0; i < Hand.size(); i++)
        {
            Card card = Hand.get(i);
            if(card.getRank() == guess)
            {
                newHand.add(Hand.remove(i));
            }
        }
        return newHand;
    }

    public ArrayList<Card> getHand()
    {
        return Hand;
    }

    public void setHand(ArrayList<Card> hand)
    {
        Hand = hand;
    }
}

