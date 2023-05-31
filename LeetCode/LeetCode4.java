package LeetCode;

import java.util.Arrays;

// Check If Two String Arrays are Equivalent
public class LeetCode4 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for(String s1 : word1) w1.append(s1);
        for(String s2 : word2) w2.append(s2);
        return w1.toString().equals(w2.toString());
    }
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
