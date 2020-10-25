package Teht1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String pelaaja1 = new Scanner(System.in).nextLine();
        String pelaaja2 = new Scanner(System.in).nextLine();

        int voittaja = pelaaKierros(pelaaja1, pelaaja2);
if(voittaja == 3) System.out.println("Tasapeli?");
        else System.out.println("Pelin voitti pelaaja " + voittaja);

    }


    /**
     *
     * @param player1 - String
     * @param player2 - String
     * @.pre player1 != null && player2 != null
     * @.post  (RESULT == 1 && pelaaja1 == "saksi" && palaaja2 == "paperi" )||
     * (RESULT == 1 && pelaaja1 == "kivi" && palaaja2 == "saksi" )||
     * (RESULT == 1 && pelaaja1 == "paperi" && palaaja2 == "kivi" )||
     * (RESULT == 2 && pelaaja2 == "saksi" && palaaja1 == "paperi" )||
     *      * (RESULT == 2 && pelaaja2 == "kivi" && palaaja1 == "saksi" )||
     *      * (RESULT == 2 && pelaaja2 == "paperi" && palaaja1 == "kivi" )||
     *      (RESULT == 3 && pelaaja1 == pelaaja2) ||
     *      ( (pelaaja1 != "kivi" && pelaaja1 != "saksi" && pelaaja1 != "paperi")||
     *      (pelaaja2 != "kivi" && pelaaja2 != "saksi" && pelaaja2 != "paperi") && throws ErrorException  )
     * @return int
     * @throws ErrorException
     *
     */
    private static int pelaaKierros(String player1, String player2)throws ErrorException{


    }


}
