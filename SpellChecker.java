import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.lang.StringBuilder;
/**
 * A class to do spell checking. This version only marks misspelled words with
 * asterisks as in **mispeling**.  It serves as a parent class for other spell
 * checkers to inherit functionality to add features by overriding methods.
 * @author Kerul Mathur
 * @version 1.0
 */


public class SpellChecker { 

    /**
     * array of words filled from the given dictionary
     */
    protected String[] words;
    /**
     * boolean value to see if we want our spellChecker to be caseSensitive or not
     */
    protected boolean ignoreCase;

    /**
     * takes in a filename with a list of words and puts it in a String[] 
     * @param filename
     * @return String[] with each cell holding a word from the filename
     */
    public static String[] readAllLines(String filename) {
        try {
        int counter = 0;
        Scanner kerul = new Scanner(new File(filename));
        while(kerul.hasNext()) {
            counter++;
            kerul.next();
        }
        String[] words = new String[counter];
        Scanner twiceScan = new Scanner(new File(filename));
        while(twiceScan.hasNext()) {
           for(int i = 0; i < words.length;i++) {
            words[i] = twiceScan.next();
           }
        }
        return words;
        } 
        catch (Exception e) {
            String[] exception = new String[0];
            return exception;
        }
    }
    /**
     * Constructor for SpellChecker takes in the filename with the dictionary
     * and a boolean parameter to see if it's case sensitive or not
     * @param dictFileName
     * @param ignoreCase
     */
    public SpellChecker(String dictFileName, boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        this.words = readAllLines(dictFileName);
    }
    /**
     * finds the size of the dictionary
     * @return length of the dictionary (how many words in the dictionary)
     */
    public int dictSize() {
        return this.words.length;
    }
    /**
     * checks if the given word is found in the dictionary or not
     * @param word
     * @return true, if the word is in the dictionary, otherwise false
     */
    public boolean isCorrect(String word) {
        if(ignoreCase == true) {
            for(int i = 0; i < this.words.length; i++) {
                if(word.equalsIgnoreCase(this.words[i])) {
                    return true; 
                }
            }
            return false;
        } else {
            for(int i = 0; i < this.words.length; i++) {
                if(word.equals(this.words[i])) {
                    return true; 
                } 
            }
            return false;
        }
    }
    /**
     * puts a correction around whatever word is passed through the method
     * @param word
     * @return corrected word
     * 
     */
    public String correctWord(String word) {
        word = "**" + word + "**";
        return word;
    }
    /**
     * takes in a document and searches through each word in the document and
     * puts a correction if the word is not found in the dictionary
     * @param doc
     * @throws SpellingException
     */
    public void correctDocument(Document doc) throws SpellingException{
        int checker = 1;
        int counter = 1;
        while(doc.hasNextWord() == true) {
            if(isCorrect(doc.nextWord()) == false) {
                doc.rewind();
                while(checker < counter) {
                    doc.nextWord();
                    checker++;
                }
               doc.replaceLastWord((correctWord(doc.nextWord())));
            }
            checker = 1;
            counter++;
            
        }
    } 
     
    public static void main(String args[]) throws SpellingException   {
        SpellChecker check = new SpellChecker("english-dict.txt", true);
        Document doc = new Document("hello hi \\fas");
        check.correctDocument(doc);
      }
}