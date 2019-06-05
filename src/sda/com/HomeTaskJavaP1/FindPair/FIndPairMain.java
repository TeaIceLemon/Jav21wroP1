package sda.com.HomeTaskJavaP1.FindPair;

public class FIndPairMain {
    public static void main(String[] args) {
        FindPairUtils findPair = new FindPairUtils();
        int[] arr = {1,4,6,8,5,3};
        findPair.FindPairBruteForce(arr,9);
    }
}
