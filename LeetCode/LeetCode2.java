package LeetCode;
// Palindrome number
public class LeetCode2 {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int orig = x;
        int mirror = 0;
        while(x > 0){
            mirror = mirror * 10 + x % 10;
            x /= 10;
        }
        return orig == mirror;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
