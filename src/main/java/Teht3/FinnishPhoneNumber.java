package Teht3;

import java.util.regex.Pattern;

public class FinnishPhoneNumber<phoneNumber> {

    private String phoneNumber;

    /**
     *
     * @param number - user inputed number on string
     *   Accepts only numbers and + in the beginning
     *    String size limi is 7 to 12 otherwise IllegalArgumentException
     *    Will accept numbers in region number in beginning but will save it in normal format.
     */
    public FinnishPhoneNumber(String number) {
        isPhoneNumberValid(number);
        char first =  number.charAt(0);
        if (String.valueOf(first).equals("+")){
            phoneNumber =  "0" + number.substring(4, number.length()-1);
        }
        else{
            phoneNumber = number;
        }

    }

    private void  isPhoneNumberValid(String phoneNumber){
      if(Pattern.matches("^+[0-9]", phoneNumber) && phoneNumber.length() > 6 && phoneNumber.length() < 13){
          return;
      }
      else {
          throw  new IllegalArgumentException("Invalid phone number");
      }
    }

}
