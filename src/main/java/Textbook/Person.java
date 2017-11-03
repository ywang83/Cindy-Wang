package Textbook;

public class Person {

    /**
     *
     */
    String familyName;
    String givenName;

    /**
     *
     * @param per person name
     * @return
     */
    public int compareTo(Person per) {
        if (familyName.compareTo(per.familyName) == 0)
            return givenName.compareTo(per.givenName);
        else
            return familyName.compareTo(per.familyName);
    }

    /**
     *
     * @param justMarried
     * @param newFamily
     */
//File: \KW\CH01\Person.java startLine: 199 endLine 213
    /**
     * Method to set the last name of this Person to a new
     * value provided that justMarried is true.
     *
     * @param justMarried true if this Person's name is to be changed
     * param newLast The new last name if justMarried is true
     * @param newLast DOCUMENT ME!
     *
     * @post lastName is equal to newLast if justMarried is true
     * otherwise no change is made to this Person
     */
    public void changeFamilyName(boolean justMarried, String newFamily) {
        if (justMarried)
            familyName = newFamily;
    }
}
