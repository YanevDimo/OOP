package Abstraction.card;

public class Card {
    private CardSuits cardSuits;
    private CardRanks cardRanks;

    public Card(CardSuits cardSuits, CardRanks cardRanks) {
        this.cardSuits = cardSuits;
        this.cardRanks = cardRanks;
    }
    public int getPower(){
        return cardRanks.getRankPower() + cardSuits.getSuitPower();
    }
}
