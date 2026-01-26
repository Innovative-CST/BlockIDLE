package android.icu.text;

public enum DisplayContext
{
    STANDARD_NAMES, 
    DIALECT_NAMES, 
    CAPITALIZATION_NONE, 
    CAPITALIZATION_FOR_MIDDLE_OF_SENTENCE, 
    CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE, 
    CAPITALIZATION_FOR_UI_LIST_OR_MENU, 
    CAPITALIZATION_FOR_STANDALONE, 
    LENGTH_FULL, 
    LENGTH_SHORT, 
    SUBSTITUTE, 
    NO_SUBSTITUTE;
    
    public Type type() {
        throw new RuntimeException("Stub!");
    }
    
    public int value() {
        throw new RuntimeException("Stub!");
    }
    
    public enum Type
    {
        DIALECT_HANDLING, 
        CAPITALIZATION, 
        DISPLAY_LENGTH, 
        SUBSTITUTE_HANDLING;
    }
}
