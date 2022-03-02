public class Card implements Comparable<Card>{
    int suit;
    int value;
    public Card(int value, int suit){
        this.value=value;
        this.suit=suit;

    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }




    @Override
    public String toString() {
        return "value"+value+"suit"+suit;
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
