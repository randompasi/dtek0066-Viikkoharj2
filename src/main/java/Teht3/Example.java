package Teht3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * esimerkit luokkien käytöstä
 */

public class Example {


        public static void main(String[] args){

            DataTransferSpeed koe = new DataTransferSpeed(1.234, "M"); // 1,234Mbit/s
            Fraction fraction = new Fraction(23,78);//  23/78
            List<String> firstNames = new ArrayList<>();
            firstNames.add("Antti");
            firstNames.add("Mikael");
            FinnishName finnishName = new FinnishName(firstNames, "Vuorinen");
            FinnishPhoneNumber finnishPhoneNumber = new FinnishPhoneNumber("+358 969 324 324");

        }

}
