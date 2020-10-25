package Teht2;

public class Card {


    /**
     * @.pre true
     * @.post RESULT == rank
     * @return String
     */
    public String getRank() {
        return rank;
    }



    /**
     * @.pre true
     * @.post RESULT == land
     * @return String
     */
    public String getLand() {
        return land;
    }

    private String rank;
    private String land;


    /**
     *
     * @param land
     * @param rank
     *
     * @.pre land != null && rank != null
     * @.post getRank().equals(rank) && getLand().equals(land)
     */
    public Card(String land, String rank) {
        this.land = land;
        this.rank = rank;
    }
}
