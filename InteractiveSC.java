import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.lang.StringBuilder;
/**
 * This version of the SpellChecker is made to be interactive
 * it prompts the user to correct the misspelling based on the given dictionary
 * @author Kerul Mathur
 * @version 1.0
 */
public class InteractiveSC extends SpellChecker {
    /**
     * Scanner input as the field because we need to ask for user input
     */
    protected Scanner input;
    /**
     * PrintWriter field for printing to the screen when needed
     */
    protected PrintWriter output;

    /**
     * Constrcutor for InteractiveSC Class
     * @param dictFileName
     * @param ignoreCase
     * @param input
     * @param output
     */
    public InteractiveSC(String dictFileName, boolean ignoreCase, Scanner input, PrintWriter output) {
        super(dictFileName, ignoreCase);
        this.input = input;
        this.output = output;
    }
    /**
     * When given a word it will ask for a correction even if 
     * the word is correct according to the dictionary
     * @param word
     * @return word, edited with wtv the user wants it to be
     */
    public String correctWord(String word) {
        output.println("@- Correction for **" + word + "**:");
        word = input.next();
        output.println("@ Corrected to: " + word);
        return word;
    }
    /**
     * correctDocument method takes a document and for each misspelling asks
     * the user for a correction and replaces it with the correction
     * @param doc
     * @throws SpellingException
     */
    public void correctDocument(Document doc) throws SpellingException {
        String word;
        while(doc.hasNextWord() == true) {
            word = doc.nextWord();
            if(isCorrect(word) == false) {
               doc.replaceLastWord("**" + word + "**");
               output.println("@ MISSPELLING in: " + doc.currentLine());
               word = correctWord(word);
               doc.replaceLastWord(word);
            }
        } 
    }
    public static void main(String[] args) throws SpellingException {
        Scanner stdin = new Scanner(System.in);
        PrintWriter stdout = new PrintWriter(System.out,true);
        InteractiveSC sc = new InteractiveSC("english-dict.txt",true,stdin,stdout);
        System.out.println(sc.isCorrect("Richa"));
        System.out.println(sc.isCorrect("Kerul"));

    } 

}