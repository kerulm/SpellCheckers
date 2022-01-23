/**
 * This version of the spell checker automatically corrects words to 
 * wtv is the closest LevenshteinDistance to the mistyped word
 * 
 * @author Kerul Mathur
 * @version 1.0
 */

public class AutomaticSC extends SpellChecker {

    /**
     * reference too LevenshteinDistance Object
     */
    private StringComparator lev = new LevenshteinDistance();

    /**
     * Constructor for AutomaticSC Class
     * @param dictFileName
     * @param ignoreCase
     * @param comparator
     */
    public AutomaticSC(String dictFileName, boolean ignoreCase, StringComparator comparator) {
        super(dictFileName, ignoreCase);
        lev = comparator;
    }
    /**
     * Constructor for AutomaticSC Class
     * @param dictFileName
     * @param ignoreCase
     */
    public AutomaticSC(String dictFileName, boolean ignoreCase) {
        super(dictFileName, ignoreCase);
    }
    /**
     * overrided method from SpellChecker where the word is automatically corrected
     * depending on if it's case sensitive or not
     * @param word
     * @return word[index], the corrected word from the dictionary
     */
    public String correctWord(String word)   {
        String returnWord;
        int index = 0; 
        int val = 0;
        String trialWord; 
        if(ignoreCase == true) {
           trialWord = word.toLowerCase();
           val = lev.distance(trialWord, words[0]);
        for(int i = 0; i < words.length; i++) {
            if(lev.distance(trialWord, words[i]) < val ) {
                val = lev.distance(trialWord, words[i]);
                index = i; 
            }
         }
         returnWord = matchCase(word, words[index]);
         return returnWord;

        } else {
            val = lev.distance(word, words[0]);
            for(int i = 0; i < words.length; i++) {
                if(lev.distance(word, words[i]) < val ) {
                    val = lev.distance(word, words[i]);
                    index = i; 
                }
             }
             return words[index];
        }
    } 
    /**
     * helper method to match the case with the word we input into
     * correct word. We use this method to implement the correctWord Method
     * @param model
     * @param source
     * @return source, the modified word with the respective Case Pattern shown in the model param
     */
    public static String matchCase(String model, String source) {
        char[] c = model.toCharArray();
        boolean allCaps = true;
        boolean firstLetterisCaps = true;
        outer : for(int i = 0; i < c.length; i++) {
            if(Character.isUpperCase(c[i]) == false) {
                allCaps = false;
                break outer;
            }
        }
        if(allCaps == true) {
            source = source.toUpperCase();
            return source;
        } else {
            if(Character.isUpperCase(c[0])) {
                for(int i = 1; i < c.length; i++) {
                    if(Character.isUpperCase(c[i])) {
                        firstLetterisCaps = false;
                    }
                }
                if(firstLetterisCaps == true) {
                    source = source.substring(0, 1).toUpperCase() + source.substring(1);
                   return source;
                } else {
                 //  source = source.toLowerCase();
                    return source;
                }
            } 
        }
        return source;
        
    }
    public static void main(String[] args) {






    }


}