package LeetCode;

public class LeetCode5 {
    public static int sumOddLengthSubarrays(int[] arr) {
        int N = arr.length;
        int[] PS = new int[N];
        PS[0] = arr[0];
        for(int i=1; i<N; i++){
            PS[i] = arr[i] + PS[i-1];
        }
        int sum = PS[N-1];
        for(int len=3; len<=N; len+=2){
            sum += PS[len-1];
            for(int i=len; i<N; i++){
                sum += PS[i] - PS[i - len];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
