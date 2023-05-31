package LeetCode;
// Number of Steps to Reduce a Number to Zero
public class LeetCode3 {
    public static int numberOfSteps(int num) {
        int cnt = 0;
        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
            } else {
                num -= 1;
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
