package oop2.inheritance;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);

        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
        // System.out.println(c); 는 실제로는 System.out.println(c.toString());을 의미한다.
    }
}

class Deck {
    final int CARD_NUM = 52;

//    Card[] cardARR = new Card[CARD_NUM];  ※ 배열을 선언하는 두 방식은 같은 의미이다.
    Card cardArr[] = new Card[CARD_NUM];

    Deck() {
        int i = 0;
        for (int k = Card.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card.NUM_MAX; n++) {
                cardArr[i++] = new Card(k, n+1);
            }
        }
    }
    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }

    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return cardArr[index];
    }

    Card pick(int index) {
        return cardArr[index];
    }
}

class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";
        return "kind : " + kinds[this.kind] + ", numbers : " + numbers.charAt(this.number);
    }
}
