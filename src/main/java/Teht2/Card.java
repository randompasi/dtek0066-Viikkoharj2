package Teht2;

public class Card {

    public String getRank() {
        return rank;
    }

    public String getLand() {
        return land;
    }

    private String rank;
    private String land;


    public Card(String land, String rank) {
        this.land = land;
        this.rank = rank;
    }
}
