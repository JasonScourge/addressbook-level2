package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */

public class Address {
    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be of the format:"
    		+ "Block, Street, Unit, Postal Code";
    public static final String ADDRESS_VALIDATION_REGEX = ".+"; 
    public static final String COMMA_SPLIT = ", ";
    public static final int BLOCK_INDEX = 0;
    public static final int STREET_INDEX = 1;
    public static final int UNIT_INDEX = 2;
    public static final int POSTAL_CODE_INDEX = 3;

    public final String value;
    private boolean isPrivate;
    private Block block; 
    private Street street; 
    private Unit unit; 
    private PostalCode postalCode; 
    
    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = address;
        String[] temp = address.split(COMMA_SPLIT);
        block = new Block(temp[BLOCK_INDEX]);
        street = new Street(temp[STREET_INDEX]);
        unit = new Unit(temp[UNIT_INDEX]);
        postalCode = new PostalCode(temp[POSTAL_CODE_INDEX]);
    }

    private Street Street(String string) {
        // TODO Auto-generated method stub
        return null;
    }

    private Block Block(String string) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
    public class Block {

        private String value; 

        public Block(String value) {
            this.value = value; 
        }

        @Override
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object other) {
            return other == this // short circuit if same object
                    || (other instanceof Block // instanceof handles nulls
                            && this.value.equals(((Block) other).value)); // state check
        }
        
        public String getValue(){
            return value;
        }

    }
    
    public class Street {
        
        private String value; 

        public Street(String value) {
            this.value = value; 
        }

        @Override
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object other) {
            return other == this // short circuit if same object
                    || (other instanceof Street// instanceof handles nulls
                    && this.value.equals(((Street) other).value)); // state check
        }
        
        public String getValue(){
            return value;
        }
    }
        
    public class Unit {

        private String value; 

        public Unit(String value) {
            this.value = value; 
        }

        @Override
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object other) {
            return other == this // short circuit if same object
                    || (other instanceof Unit // instanceof handles nulls
                            && this.value.equals(((Unit) other).value)); // state check
        }
        
        public String getValue(){
            return value;
        }
    }
    
    public class PostalCode {

        private String value; 

        public PostalCode(String value) {
            this.value = value; 
        }

        @Override
        public String toString() {
            return value;
        }

        @Override
        public boolean equals(Object other) {
            return other == this // short circuit if same object
                    || (other instanceof PostalCode // instanceof handles nulls
                    && this.value.equals(((PostalCode) other).value)); // state check
        }
        
        public String getValue(){
            return value;
        }
    }
}


