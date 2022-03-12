public class Card implements Comparable<Card>{
    private int suit, value;
    private String[] cardSuit = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10",
            "9", "8", "7", "6", "5", "4", "3", "2"};

    public Card(int suits, int values)
    {
        suit=suits;
        value = values;
    }

    public String toString()
    {
        String drawCard = cardValue[value] + " of " + cardSuit[suit];

        return drawCard;
    }

    @Override
    public int compareTo(Card o) {
        if(this.value>o.value){
            return 1;
        }
        else if(this.value<o.value){
            return -1;
        }
        return 0;
    }
}
