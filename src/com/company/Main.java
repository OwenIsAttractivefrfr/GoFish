package com.company;

import java.util.*;


public class Main
{

    public static void main(String[] args)
    {
        Stack<Card> lake = new Stack<>();
        for (Rank r : Rank.values())
        {
            for (Suit s : Suit.values())
            {
                lake.push(new Card(r, s, Tag.FACE_DOWN));
            }
        }
        Collections.shuffle(lake);
        Player player1 = new Player();
        Player player2 = new Player();
        for (int i = 0; i < 7; i++)
        {
            player1.getCards(lake.pop());
            player2.getCards(lake.pop());
        }

        while (lake.size() > 0) {
            try
            {
                String[] cls = new String[] {"cmd.exe", "/c", "cls"};
                Runtime.getRuntime().exec(cls);
            }
            catch (final Exception e)
            {
                e.printStackTrace();
            }
            player1.lookAtHand();
            System.out.println("What card do you need? 1-13");
            Scanner A = new Scanner(System.in);
            int PlayerCardChoice = A.nextInt() - 1;
            Rank[] rankArray = new Rank[13];
            for (int i = 0; i < Rank.values().length; i++)
            {
                rankArray[i] = Rank.values()[i];
            }
            while(PlayerCardChoice > 12 || PlayerCardChoice < 0)
            {
                System.out.println("That is not a valid choice");
                System.out.println("Try again. Chose a card 1-13");
                A = new Scanner(System.in);
                PlayerCardChoice = A.nextInt() - 1;
            }
                if (rankArray[PlayerCardChoice] == Rank.ACE) {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 2: Go Fish ");
                        player1.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player1.getCards(cardlist[i]);
                        }
                    }
                }
            if (rankArray[PlayerCardChoice] == Rank.TWO) {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }

            if (rankArray[PlayerCardChoice] == Rank.THREE) {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }

            if (rankArray[PlayerCardChoice] == Rank.FOUR) {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }

            if (rankArray[PlayerCardChoice] == Rank.FIVE) {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }

            if (rankArray[PlayerCardChoice] == Rank.SIX) {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }

            if (rankArray[PlayerCardChoice] == Rank.SEVEN)
            {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }
            if (rankArray[PlayerCardChoice] == Rank.EIGHT)
            {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }
            if (rankArray[PlayerCardChoice] == Rank.NINE)
            {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }
            if (rankArray[PlayerCardChoice] == Rank.TEN)
            {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }
            if (rankArray[PlayerCardChoice] == Rank.JACK)
            {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }
            if (rankArray[PlayerCardChoice] == Rank.QUEEN)
            {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }
            if (rankArray[PlayerCardChoice] == Rank.KING)
            {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                if (cardlist.length == 0) {
                    System.out.println("Player 2: Go Fish ");
                    player1.getCards(lake.pop());
                } else {
                    for (int i = 0; i < cardlist.length; i++) {
                        player1.getCards(cardlist[i]);
                    }

                }
            }

            else if (rankArray[PlayerCardChoice] == Rank.TWO)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.THREE)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.FOUR)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.FIVE)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.SIX)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.SEVEN)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.EIGHT)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.NINE)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.TEN)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.JACK)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.QUEEN)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[PlayerCardChoice] == Rank.KING)
                {
                    ArrayList<Card>newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                }
                else
                {

                }
                Random random = new Random();
                int computerCardChoice = random.nextInt(13);
                if (rankArray[computerCardChoice] == Rank.TWO) {
                ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                Card[] cardlist = new Card[newHand.size()];
                cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }

                if (rankArray[computerCardChoice] == Rank.THREE) {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }

                if (rankArray[computerCardChoice] == Rank.FOUR) {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }

                if (rankArray[computerCardChoice] == Rank.FIVE) {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }

                if (rankArray[computerCardChoice] == Rank.SIX) {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }

                if (rankArray[computerCardChoice] == Rank.SEVEN)
                {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }
                if (rankArray[computerCardChoice] == Rank.EIGHT)
                {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }
                if (rankArray[computerCardChoice] == Rank.NINE)
                {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }
                if (rankArray[computerCardChoice] == Rank.TEN)
                {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }
                if (rankArray[computerCardChoice] == Rank.JACK)
                {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }
                if (rankArray[computerCardChoice] == Rank.QUEEN)
                {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }
                if (rankArray[computerCardChoice] == Rank.KING)
                {
                    ArrayList<Card> newHand = player1.checkHand(player2.getHand(), rankArray[PlayerCardChoice]);
                    Card[] cardlist = new Card[newHand.size()];
                    cardlist = newHand.toArray(cardlist);

                    if (cardlist.length == 0) {
                        System.out.println("Player 1: Go Fish ");
                        player2.getCards(lake.pop());
                    } else {
                        for (int i = 0; i < cardlist.length; i++) {
                            player2.getCards(cardlist[i]);
                        }

                    }
                }

                else if (rankArray[computerCardChoice] == Rank.TWO)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.THREE)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.FOUR)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.FIVE)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.SIX)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.SEVEN)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.EIGHT)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.NINE)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.TEN)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.JACK)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.QUEEN)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else if (rankArray[computerCardChoice] == Rank.KING)
                {
                    ArrayList<Card>newHand = player2.checkHand(player1.getHand(), rankArray[PlayerCardChoice]);
                }
                else
                {

                }
            }
        }
    }
