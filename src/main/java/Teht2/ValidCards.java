package Teht2;

import java.util.ArrayList;
import java.util.List;

public class ValidCards {


    /**
     * @.pre true
     * @.post RESULT == validCards
     * @return List<String>
     */
    public List<String> getValidCards() {
        return validCards;
    }

    private List<String> validCards;


    /**
     * @.pre true
     * @.post validCards != null && validCards.length == 52
     */
    public ValidCards() {
        validCards = new ArrayList<String>();
                    initLandCards("c");
                    initLandCards("d");
                    initLandCards("h");
                    initLandCards("s");


                }

                private  void initLandCards(String land){
                    validCards.add(land+"2");
                    validCards.add(land+"3");
                    validCards.add(land+"4");
                    validCards.add(land+"5");
                    validCards.add(land+"6");
                    validCards.add(land+"7");
                    validCards.add(land+"8");
                    validCards.add(land+"9");
                    validCards.add(land+"10");
                    validCards.add(land+"J");
                    validCards.add(land+"Q");
                    validCards.add(land+"K");
                    validCards.add(land+"A");

                }
}
