package LeetCode;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;
// Shuffle String
public class LeetCode1 {
    public static String restoreString(String s, int[] indices) {
        String[] strArr = s.split("");
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(indices[i], strArr[i]);
        }
        SortedSet<Integer> keys = new TreeSet<>(map.keySet());
        String value = "";
        for(int i = 0; i < s.length(); i++){
            value += map.get(i);
        }
        return value;
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
}
