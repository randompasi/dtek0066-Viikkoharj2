package Teht3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FinnishName {

    private String callingName;
    private List<String> firstNames;
    private String lastName;


    /**
     *
     * @param firsNames - list of first names
     * @param lastName - string of lastname
     *          will throw IllegalArgumentException if used other than letters and -.
     *                 no limits on string sizes.
     *                 First names can only bee max 4.
     *
     *
     */
    public FinnishName(List<String> firsNames, String lastName) {
        tooManyFirstName(firsNames);
        this.firstNames = new ArrayList<String>();
        for (String firstName : firsNames){
            if (isOnlyLetters(firstName)){
                this.firstNames.add(firstName);
            }
            else {
                throw new IllegalArgumentException("Only lower or upper case letter are acceptable on firstName");
            }
        }
        if(isOnlyLetters(lastName)){
            this.lastName = lastName;
        }


    }

    /**
     *
     * @param firstNames List<String>
     * throws IllegalArgumentException if there is more than 4 first name
     */
    private void tooManyFirstName(List<String> firstNames){
        if (firstNames.size() > 4)  {
            throw new IllegalArgumentException("Too many first Name");
        }
    }

    /**
     * Check that name only has letters and -
     * @param name String
     * @return boolean
     */
    private boolean isOnlyLetters(String name){
        return Pattern.matches("[a-zA-Z-]+",name);
    }
}
