package deckofcard;

import java.util.ArrayList;


public class Deck {
    public ArrayList<Card> cards= new ArrayList<>();;

    public Deck()
    {
        for(int a =0; a<=3; a++)
        {
            for(int b =0; b<=12;b++)
            {
                cards.add(new Card(a,b));
            }
        }
    }



}

