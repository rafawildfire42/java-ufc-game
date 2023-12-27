package Event;

public class Card {
    public enum CardType {
        MAIN,
        PRELIMINARIES,
        INITIAL_PRELIMINARIES
    }

    private CardType cardType;
    private Event event;

    public Card(CardType cardType) {
        this.cardType = cardType;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public static void main(String[] args) {
        Card card = new Card(CardType.MAIN);

        System.out.println("Card Type: " + card.getCardType());
    }
}
