package ca.sheridancollege.project;

import java.util.Stack;

public class SpotItPlayer extends Player {
    private Stack<Card> cardDeck;
    private Card displayCard;


    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public SpotItPlayer(String name) {
        super(name);
        cardDeck = new Stack<>();
    }

    public int getCardCount(){
        return cardDeck.size();
    }

    public void addCard(GroupOfCards card) {
        for (Card c : card.showCards()) {
            cardDeck.push(c);
        }

    }

    public void setCurentCard(Card card) {
        this.displayCard = card;
    }

    public Card getDisplayCard() {
        return displayCard;
    }

    @Override
    public void play() {
        Card c = cardDeck.pop();

        while (displayCard.symbolMatched(c)) {
            System.out.println("\t Card marched for "+getPlayerID()+" \t"+displayCard +" and "+c );
            if(cardDeck.empty()){
                break;
            }
            c = cardDeck.pop();
        }
        displayCard = c;

    }
}
