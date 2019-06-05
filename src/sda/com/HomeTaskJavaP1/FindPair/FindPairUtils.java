package sda.com.HomeTaskJavaP1.FindPair;

import sda.com.HomeTaskJavaP1.InsertionSort.InsertionSort;

public class FindPairUtils {
    public void FindPairBruteForce(int[] arr, int sum){
        boolean isPairFound = false;
        for(int i =0; i<arr.length-1;i++) {  // i-> first Pair element
            for(int j = i+1; j<arr.length;j++){ //j -> second element of Pair
                if(arr[i] + arr[j] == sum){ //if true print index of each Pair element
                    System.out.println("Pair found at " + i + " and " + j );
                    isPairFound = true;
                    System.out.println();
                }
            }
            if(isPairFound == false){
                System.out.println("No pair found");
            }
        }

    }


}
