package Questions.ValidAnagram;

import java.util.Arrays;

public class validAnagram {
    public boolean validAnagram (String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] cChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(cChars);
        Arrays.sort(tChars);

        return Arrays.equals(cChars, tChars);
    }
}
