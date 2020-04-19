package ca.sheridancollege.project;

import java.util.ArrayList;

public class PlayCards {
    public static void main(String[] args) {
        SpotItGame game = new SpotItGame("Spit-It");

        //Create 4 players. can be any number of players
        SpotItPlayer player1 = new SpotItPlayer("Hardeep");
        SpotItPlayer player2 = new SpotItPlayer("Raman");
        SpotItPlayer player3 = new SpotItPlayer("Param");
        SpotItPlayer player4 = new SpotItPlayer("Gaurav");

        //Added playe to list
        ArrayList<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);

        //Set game player
        game.setPlayers(playerList);

        //Start play
        game.play();

        //get Winner
        game.declareWinner();

    }
}
