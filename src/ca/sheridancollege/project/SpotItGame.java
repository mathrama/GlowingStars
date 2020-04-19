package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Random;

public class SpotItGame extends Game {


    private SpotItPlayer winner;
    private int NO_OF_CARDS = 15;

    public SpotItGame(String givenName) {
        super(givenName);
    }


    @Override
    public void play() {


        //Add cards to all plauer. 15 cards eacg
        for (Player p : getPlayers()) {
            SpotItPlayer player = ((SpotItPlayer) p);

            ArrayList<Card> cardList = new ArrayList<>();
            for (int i = 0; i < NO_OF_CARDS; i++) {
                Card c = getCard();
                cardList.add(c);
            }
            GroupOfCards deck = new GroupOfCards(cardList);
            player.addCard(deck);
        }
        Card firstCard = getCard();
        System.out.println("Start card" + firstCard);

        //Each player taking turn until we find a winner.
        while (winner == null)

            for (Player p : getPlayers()) {
                SpotItPlayer player = ((SpotItPlayer) p);
                if (((SpotItPlayer) p).getCardCount() == 0) {
                    winner = player;
                    return;
                }
                player.setCurentCard(firstCard);
                player.play();
                firstCard = player.getDisplayCard();

                System.out.println("Player " + player.getPlayerID() + "\t has \t" + player.getCardCount() + firstCard);


            }


    }

    //Generate card with symbols.
    public Card getCard() {
        Card.Symbol s1 = generateRandom();
        Card.Symbol s2 = generateRandom();
        while (s1 == s2) {
            s2 = generateRandom();
        }
        Card.Symbol s3 = generateRandom();
        while (s3 != s1 && s3 != s2) {
            s3 = generateRandom();
        }

        Card card = new Card(generateRandom(), generateRandom(), generateRandom());
        return card;
    }

    //Randome card generator
    private Card.Symbol generateRandom() {
        Card.Symbol[] possibleCardValues = Card.Symbol.values();
        Random random = new Random();
        int result = random.nextInt(possibleCardValues.length);
        return possibleCardValues[result];

    }

    @Override
    public void declareWinner() {
        System.out.println("Winner is ~~~~~~~~~~~~~~~~~  || " + winner.getPlayerID()+" || ~~~~~~~~~~~~~~~~~");
    }


}
