package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Serves as a parent class for other classes
 * Layman terms: A template for other classes through inheritance
 */
public class Contact {

    public final String value;
    private boolean isPrivate;
    
    public Contact(String value, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        this.value = value;
    }

    public String toString() {
        return value;
    }
    
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
