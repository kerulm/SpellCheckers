/**
 * interaface implemented by KeyboardDistanace and LevenshteinDistance
 * @author Kerul Mathur
 * @version 1.0
 * 
 */
public interface StringComparator {
    /**
     * 
     * @param x
     * @param y
     * @return implemented by KeyboardDistance and LevenshteinDistance
     */
    public int distance(String x, String y);
}
