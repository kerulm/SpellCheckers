/**
 * This KeyboardDistance class essentially checks if there is a letter that is misspelled
 * from the correct word, and adjecent to the correct letter it returns the index where in the 
 * string.
 * 
 * @author Kerul Mathur
 * @version 1.0
 * 
 */

public class KeyboardDistance implements StringComparator { 
    /**
     * 
     * @param x the incorrect spelling
     * @param y the correct spelling
     * @return i, the location (index) where the incorrect spelling is
     */
    public int distance(String x, String y) {
        x.toLowerCase(); 
        y.toLowerCase();
        if(x.equals(y)) {
            return 0;
        }
        String[] wordx = x.split("");
        String[] wordy = y.split("");
        for(int i = 0; i < wordx.length; i++) {
            if(!wordx[i].equals(wordy[i])) {
                if(wordy[i].equals("a")) {
                    if(wordx[i].equals("s")) {
                        return i + 1;
                    }
                }
                if(wordy[i].equals("b")) {
                    if(wordx[i].equals("v") || wordx[i].equals("n")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("c")) {
                    if(wordx[i].equals("x") || wordx[i].equals("v")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("d")) {
                    if(wordx[i].equals("s") || wordx[i].equals("f")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("e")) {
                    if(wordx[i].equals("w") || wordx[i].equals("r")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("f")) {
                    if(wordx[i].equals("d") || wordx[i].equals("g")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("g")) {
                    if(wordx[i].equals("f") || wordx[i].equals("h")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("h")) {
                    if(wordx[i].equals("g") || wordx[i].equals("j")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("i")) {
                    if(wordx[i].equals("u") || wordx[i].equals("o")) {
                        return i + 1; 
                    }
                }   
                if(wordy[i].equals("j")) {
                    if(wordx[i].equals("h") || wordx[i].equals("k")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("k")) {
                    if(wordx[i].equals("j") || wordx[i].equals("l")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("l")) {
                    if(wordx[i].equals("k") || wordx[i].equals(";")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("m")) {
                    if(wordx[i].equals("n") || wordx[i].equals(",")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("n")) {
                    if(wordx[i].equals("b") || wordx[i].equals("m")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("o")) {
                    if(wordx[i].equals("i") || wordx[i].equals("p")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("p")) {
                    if(wordx[i].equals("o") || wordx[i].equals("[")) {
                        return i + 1;  
                    }
                }
                if(wordy[i].equals("q")) {
                    if(wordx[i].equals("w") || wordx[i].equals("\t")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("r")) {
                    if(wordx[i].equals("e") || wordx[i].equals("t")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("s")) {
                    if(wordx[i].equals("a") || wordx[i].equals("d")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("t")) {
                    if(wordx[i].equals("r") || wordx[i].equals("y")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("u")) {
                    if(wordx[i].equals("y") || wordx[i].equals("i")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("v")) {
                    if(wordx[i].equals("c") || wordx[i].equals("b")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("w")) {
                    if(wordx[i].equals("q") || wordx[i].equals("e")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("x")) {
                    if(wordx[i].equals("z") || wordx[i].equals("c")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("y")) {
                    if(wordx[i].equals("t") || wordx[i].equals("u")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("z")) {
                    if(wordx[i].equals("x")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("A")) {
                    if(wordx[i].equals("S")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("B")) {
                    if(wordx[i].equals("V") || wordx[i].equals("N")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("C")) {
                    if(wordx[i].equals("X") || wordx[i].equals("V")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("D")) {
                    if(wordx[i].equals("S") || wordx[i].equals("F")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("E")) {
                    if(wordx[i].equals("W") || wordx[i].equals("R")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("F")) {
                    if(wordx[i].equals("D") || wordx[i].equals("G")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("G")) {
                    if(wordx[i].equals("F") || wordx[i].equals("H")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("H")) {
                    if(wordx[i].equals("G") || wordx[i].equals("J")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("I")) {
                    if(wordx[i].equals("U") || wordx[i].equals("O")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("J")) {
                    if(wordx[i].equals("H") || wordx[i].equals("K")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("K")) {
                    if(wordx[i].equals("J") || wordx[i].equals("L")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("L")) {
                    if(wordx[i].equals("K") || wordx[i].equals(":")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("M")) {
                    if(wordx[i].equals("N") || wordx[i].equals("<")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("N")) {
                    if(wordx[i].equals("B") || wordx[i].equals("M")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("O")) {
                    if(wordx[i].equals("I") || wordx[i].equals("P")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("P")) {
                    if(wordx[i].equals("O") || wordx[i].equals("{")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("Q")) {
                    if(wordx[i].equals("W") || wordx[i].equals("\t")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("R")) {
                    if(wordx[i].equals("E") || wordx[i].equals("T")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("S")) {
                    if(wordx[i].equals("A") || wordx[i].equals("D")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("T")) {
                    if(wordx[i].equals("R") || wordx[i].equals("Y")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("U")) {
                    if(wordx[i].equals("Y") || wordx[i].equals("I")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("V")) {
                    if(wordx[i].equals("C") || wordx[i].equals("B")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("W")) {
                    if(wordx[i].equals("Q") || wordx[i].equals("E")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("X")) {
                    if(wordx[i].equals("Z") || wordx[i].equals("C")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("Y")) {
                    if(wordx[i].equals("T") || wordx[i].equals("U")) {
                        return i + 1; 
                    }
                }
                if(wordy[i].equals("Z")) {
                    if(wordx[i].equals("X")) {
                        return i + 1; 
                    }
                }
            }
        }
        return Integer.MAX_VALUE; 
        
    }
    
}