package seedu.addressbook.data.tag;

import java.util.*;
import seedu.addressbook.data.person.Person;

public class Tagging {

    public static final String CONTACT_DELETED = "-";
    public static final String CONTACT_ADDED= "+";
    public static final String SPACE = " ";

    private boolean isContactDeleted;
    private Person person;
    private Tag tag;

    // Constructor 
    public Tagging(Person person, Tag tag, boolean isContactDeleted){
        this.isContactDeleted = isContactDeleted;
        this.tag = tag;
        this.person = person;
    }

    // Gets the output
    public String toString(){
        String output = " ";
        LinkedList<String> Storage = new LinkedList<String>();
        if(isContactDeleted == true){
            Storage.add(CONTACT_DELETED);
        } else {
            Storage.add(CONTACT_ADDED);
        }
        Storage.add(person.getName().toString());
        Storage.add(tag.toString());
        for (int i = 0; i < Storage.size(); i++){
            output.concat(Storage.get(i));
            output.concat(SPACE);
        }
        output.trim();
        return output;
    }

}
