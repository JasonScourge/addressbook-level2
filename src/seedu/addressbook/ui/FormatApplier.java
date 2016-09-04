package seedu.addressbook.ui;

public class FormatApplier {
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    /** A divider to separate the printed output into different paragraphs nicely. */
    private static final String DIVIDER = "===================================================";

    // Accessors
    public String getLinePrefix(){
        return LINE_PREFIX;
    }
    
    public String getLS(){
        return LS;
    }
    
    public String getDivider(){
        return DIVIDER;
    }
}
