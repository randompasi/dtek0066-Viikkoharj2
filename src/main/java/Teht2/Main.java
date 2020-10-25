package Teht2;

import com.sun.istack.internal.NotNull;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Set<Card> käsi = new HashSet<>(5);
        System.out.println("Input Cards first land then rank with Small cases example ck");
        for(int i=0; i<5; i++) {
            String card = new Scanner(System.in).nextLine();
            määritäKortti(card);
        }

        boolean käsiSisältääParin = sisaltaaParin(käsi);

        System.out.println("Käsi " +
                (käsiSisältääParin ? "sisältää parin" : "ei sisällä paria")
        );
    }

    /**
     *
     * @param card
     * @return - Card object that has Land and Rank as String
     */

    private static @NotNull Card määritäKortti(@NotNull String  card){
        while(true) {
            if (isValidCard(card)) {
                return new Card(card.substring(0, 0), card.substring(1, 1));
            }
            else{
                System.out.println("Wrong format on card use \"C3\" try again");
                card = new Scanner(System.in).nextLine();
            }

        }
    }

    /**
     *
     *  @param  hand
     * @return -boolean is there pair in hand
     * doubble pairs, three or four same will be counted that hand contains pair
     */
    private static @NotNull boolean sisaltaaParin(@NotNull Set<Card> hand){

        for (Card card : hand){
          if( Collections.frequency(hand, card.getRank()) > 1);
                return true;
        }
        return false;
    }

    /**
     *
     * @param card
     * @return - boolean is user given card acceptable
     */
    private static @NotNull boolean isValidCard(@NotNull String card){
        List<String> validCards = new ValidCards().getValidCards();
        return validCards.contains(card);

    }
}
