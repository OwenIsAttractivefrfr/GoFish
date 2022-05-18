package com.company;

import java.util.Objects;

public class Card
{
    private Rank rank;
    private Suit suit;
    private Tag tag;

    public Card()
    {
        this.rank = null;
        this.suit = null;
        this.tag = null;
    }

    public Card(Rank rank, Suit suit, Tag tag) {
        this.rank = rank;
        this.suit = suit;
        this.tag = tag;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit && tag == card.tag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit, tag);
    }

    @Override
    public String toString() {
        return "rank=" + rank + '\n' +
                "suit=" + suit + '\n' +
                "tag=" + tag + '\n';
    }
}
