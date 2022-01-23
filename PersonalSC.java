import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.lang.StringBuilder;
/**
 * PersonalSC is a type of InteractiveSC that will ask the user if the word
 * wants to be added to a personalDictionary of words created by the User
 * 
 * @author Kerul Mathur
 * @version 1.0
 */
public class PersonalSC extends InteractiveSC{
    /**
     * String[] field which contains all the words from 
     * the personal dictionary
     */
    private String[] personalWords;
    /**
     * the filename for the personalDictionary
     */
    private String personalDictFilename;

    /**
     * Constructor for PersonalSC Class (has two extra parameters than ISC)
     * @param dictFileName
     * @param ignoreCase
     * @param input
     * @param output
     * @param personalDictFilename
     */
    public PersonalSC(String dictFileName, boolean ignoreCase, Scanner input, PrintWriter output, String personalDictFilename) {
        super(dictFileName, ignoreCase, input, output);
        this.personalDictFilename = personalDictFilename;
        personalWords = readAllLines(personalDictFilename);
    }
    /**
     * returns the size of the dictionary
     * @return length of PersonalWords[]
     */
    public int personalDictSize() {
        return personalWords.length;
    }
    /**
     * runs similarly too parent version but also checks if 
     * the word is in the personal Dictionary
     * @param word
     * @return true if it's in either dictionary, else returns false 
     */
    public boolean isCorrect(String word) {
        if(super.isCorrect(word) == false) {
            if(ignoreCase == true) {
                for(int i = 0; i < personalWords.length;i++) {
                    if(word.equalsIgnoreCase(personalWords[i])) {
                        return true; 
                    }
                }
                return false;
            } 
            else {
                for(int i = 0; i < this.words.length; i++) {
                    if(word.equals(this.words[i])) {
                        return true; 
                    } 
                }
                for(int i = 0; i < personalWords.length; i++) {
                    if(word.equals(personalWords[i])) {
                        return true;
                    }
                }
                return false;
            } 
        }
        return true; 
    }
    /**
     * runs similarly to ISC class but instead asks if the user wants to add
     * the word too the personal dictionary otherwise it still prompts if the word wants
     * to be corrected jus tlike ISC implemenation
     * @param word
     * @return modified word 
     */
    public String correctWord(String word) {
        String option = "";
        if(isCorrect(word) == false) {
            output.println("@- **" + word + "** not in dictionary add it? (yes / no)");
            option = input.next();
            if(option.equals("yes")) {
                personalWords = increaseLength();
                personalWords[personalWords.length - 1] = word;
                return word;
            } 
            else if (option.equals("no")){
               return super.correctWord(word);
            }
        } 
        return super.correctWord(word);
        
    }
    /**
     * gets all the words currently in the personalDictionary 
     * @return string of all the words in the personal Dictionary
     */
    public String getAllPersonalDictWords() {
        String words = "";
        for(int i = 0; i < personalWords.length; i++) {
            words = words + personalWords[i] + "\n";
        }
        return words;
    }
    /**
     * increases the length of the array by one so we can add an
     * extra word to the personalWords[] 
     * @return String[] of the increased size array
     */
    public String[] increaseLength() {
        String[] copy = Arrays.copyOf(personalWords, personalWords.length + 1);
        return copy;

    }
    /**
     * Employs a PrintWriter too write in the file the new words that are in the
     * array which are added through correctWord()
     */
    public void savePersonalDict() {
        try {
            PrintWriter print = new PrintWriter(personalDictFilename);
            for(int i = 0 ; i < personalWords.length; i++) {
                print.println(personalWords[i]);
            }
            print.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) throws SpellingException {
        Scanner stdin = new Scanner(System.in);
        PrintWriter stdout = new PrintWriter(System.out,true);
        PersonalSC sc = new PersonalSC("english-dict.txt",true,stdin,stdout,"personal-dict.txt");
        sc.correctWord("Richa");
        sc.correctWord("Kerul");
        sc.savePersonalDict();
    }

}
