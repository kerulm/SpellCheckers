
public class SpellingException extends Exception {

    private String check;

    public SpellingException() {
        super("No words remain in the document");
    }
    public SpellingException(String check) {
        super(check);
    }
}
