package Teht1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String pelaaja1 = new Scanner(System.in).nextLine();
        String pelaaja2 = new Scanner(System.in).nextLine();

        String voittaja = pelaaKierros(pelaaja1, pelaaja2);


        System.out.println(voittaja);
    }

    private static String pelaaKierros(String player1, String player2){
        if(player1.equals(player2)) return "Tasapeli";
        else if(isPlayerWinning(player1,player2)) return "Pelin voitti  Player1";
            else if(isPlayerWinning(player2,player1))return "Pelin voitti-  Player2";


            System.out.println("Vääränlainen kirjoitus kirjoita kivi paperi tai saksi");
            String pelaaja1 = new Scanner(System.in).nextLine();
            String pelaaja2 = new Scanner(System.in).nextLine();
           return pelaaKierros(pelaaja1, pelaaja2);
    }

    public static boolean isPlayerWinning(String champion, String competitor){
        if(champion.equals("kivi") && competitor.equals("saksi")) return true;
        if (champion.equals("saksi") && competitor.equals("paperi")) return true;
        if (champion.equals("paperi") && competitor.equals("kivi")) return true;
        return false;
    }


}
