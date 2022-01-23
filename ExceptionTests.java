import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
/**
 * Tests for both Exception Classes SpellingException.java
 * and SpellingCorrectionException.java. We dont use SPE 
 * in the other classes so we're just gonna test the constructors
 * 
 * @author Kerul Mathur
 * @version 1.0
 */

public class ExceptionTests {

    SpellingException e = new SpellingException();

    /**
     * This test case tests what happens when there are no words left
     * in the document. Since we call doc.nextWord() 4 times and there are 
     * 3 words it should call the spelling exception
     */
    @Test public void testException1() {
        boolean throwd = false;
        try { 
        Document doc = new Document("hello hi bye");
        doc.nextWord();
        doc.nextWord();
        doc.nextWord();
        doc.nextWord();
        }
        catch (SpellingException e){ 
            throwd = true;
        }
        assertEquals("Test doc.nextWord(): ", true, throwd);
      }
    /**
     * This test checks if the default construtor of SE works 
     * properly
     */
    @Test public void testDefaultSpellingExceptionConstructor() {
        String check = "No words remain in the document";
        SpellingException e = new SpellingException();
        assertEquals("Testing Default SE Constructor: ", check, e.getMessage());
    }
    /**
     * this Test checks if the 2nd constructor for SE works 
     * as intended
     */
    @Test public void testSpellingExceptionConstructor() {
        SpellingException e = new SpellingException("There was an error!");
        String check = "There was an error!";
        assertEquals("Testing SE Constructor: ", check, e.getMessage());
    }
    /**
     * This Test checks if the Default Constructor for SCE works
     * as intended
     */
    @Test public void testDefaultSCEConstructor() {
        SpellingCorrectionException e = new SpellingCorrectionException();
        String check = "Spelling Correction Error!";
        assertEquals("Testing SCE Constructor: ", check, e.getMessage());
    }
    /**
     * This Test checks if the 2nd Constructor for SCE works
     * as intended
     */
    @Test public void testSCEConstructor() {
        SpellingCorrectionException e = new SpellingCorrectionException("There was a SpellingCorrectionError");
        String check = "There was a SpellingCorrectionError";
        assertEquals("Testing default SCE Constructor: ", check, e.getMessage());
    }
      public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("ExceptionTests");
      }
}
