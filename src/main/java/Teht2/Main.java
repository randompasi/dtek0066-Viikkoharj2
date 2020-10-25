package Teht2;

import com.sun.istack.internal.NotNull;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Set<Card> käsi = new HashSet<>(5);
        System.out.println("Input Cards first land then rank with Small cases example ck");
        for(int i=0; i<5; i++) {
            String land = new Scanner(System.in).nextLine();
            String rank = new Scanner(System.in).nextLine();
            määritäKortti(land, rank);
        }

        boolean käsiSisältääParin = sisaltaaParin(käsi);

        System.out.println("Käsi " +
                (käsiSisältääParin ? "sisältää parin" : "ei sisällä paria")
        );
    }

    /**
     * @.pre land != null && rank != null
     * @.post ( RESULT == Card && (Card.getLand() == "d" || Card.getLand() == "c" || Card.getLand() == "h" || Card.getLand() == "s") &&
     *( Card.getRank() == "2" || Card.getRank() == "3" || Card.getRank() == "4" || Card.getRank() == "5" || Card.getRank() == "6" ||
     * Card.getRank() == "7" || Card.getRank() == "8" || Card.getRank() == "9" || Card.getRank() == "10" || Card.getRank() == "J" ||
     * Card.getRank() == "Q" || Card.getRank() == "K" || Card.getRank() == "A") ) || throws WrongCardError)
     * @param land
     * @param rank
     * @return - Card object that has Land and Rank as String
     *
     * @throws WrongCardError
     */

    private static Card määritäKortti(String  land, String rank) throws WrongCardError{

    }

    /**
     *
     *  @param  hand
     * @return -boolean is there pair in hand
     * doubble pairs, three or four same will be counted that hand contains pair
     * @.pre hand != null && hand.length == 5
     * @.post RESULT == true && EXIST(card1,card2 : hand ; FORALL(card1, card2 : hand ; card1 != card2)
     * && card1.getRank.equals(card2.getRank) )
     *
     */
    private static boolean sisaltaaParin( Set<Card> hand){

    }


}
