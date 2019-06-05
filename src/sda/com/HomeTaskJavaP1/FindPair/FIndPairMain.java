package sda.com.HomeTaskJavaP1.FindPair;

import sda.com.StopWatch.StopWatch;

public class FIndPairMain {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        FindPairUtils findPair = new FindPairUtils();
        int[] arr = {1,4,6,8,5,3};
//        System.out.println("Brute Force");
//        watch.start();
//        findPair.findPairBruteForce(arr,9);
//        System.out.println(watch.stop());
        System.out.println("Optimal");
        watch.start();
        findPair.findPairOptimal(arr,9);
        System.out.println(watch.stop());
    }
}
