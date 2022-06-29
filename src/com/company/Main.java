package com.company;
import java.util.*;


public class Main
{


    public static void winScenario(ArrayList<Object> p1, ArrayList<Object> p2)
    {
        int player1 = p1.size();
        int player2 = p2.size();
        if(player1 > player2)
        {
            System.out.println("You win");
        }
        else if(player1 == player2)
        {
            System.out.println("You tied with player 2");
        }
        else
        {
            System.out.println("You lose");
        }
    }





    public static Map countFrequency(Player player)
    {
        Map<Rank, Integer> frequency = new HashMap<>();
        Map<Rank, Suit> suitFrequency = new HashMap<>();
        for(int i = 0; i < player.getHand().size(); i++)
        {
            int numberOfCards = 0;
            if(frequency.containsKey(player.getHand().get(i).getRank()))
            {
                frequency.put(player.getHand().get(i).getRank(), frequency.get(player.getHand().get(i).getRank()) +1);
                suitFrequency.put(player.getHand().get(i).getRank(), player.getHand().get(i).getSuit());
            }
            else
            {
                frequency.put(player.getHand().get(i).getRank(), 1);

                suitFrequency.put(player.getHand().get(i).getRank(), player.getHand().get(i).getSuit());

            }
        }
        return frequency;
    }

    public static ArrayList<Object> score(Map player)
    {
        Iterator hashMapIterator = player.entrySet().iterator();
        ArrayList<Object> score = new ArrayList<Object>();
        while (hashMapIterator.hasNext())
        {

            Map.Entry mapElement = (Map.Entry) hashMapIterator.next();
            int values = ((int) mapElement.getValue());
            if (values == 4)
            {
                score.add(mapElement.getKey());
            }
        }
        return score;
    }

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
            System.out.println("My cards");
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
                Random random = new Random();
                int computerCardChoice = random.nextInt(13);
                System.out.println("Do you have a " + rankArray[computerCardChoice] + "?");
                if (rankArray[computerCardChoice] == Rank.TWO) {
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
                    ArrayList<Card> newHand = player2.checkHand(player1.getHand(), rankArray[computerCardChoice]);
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
            }
        Map p1 = countFrequency(player1);
        ArrayList<Object> a = score(p1);
        Map p2 = countFrequency(player2);
        ArrayList<Object> b = score(p2);
        winScenario(a, b);
        }
    }
