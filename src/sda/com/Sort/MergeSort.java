package sda.com.Sort;

public class MergeSort {
    public int[] mergeSort (int[] arr , int low, int high){
        if(low<high){
            int half = (low+high)/2;
            mergeSort(arr,low,half);
            mergeSort(arr,half+1,high);
            merge(arr,low,high,half);
        }
        return arr;
    }
    public void merge(int[] arr, int low, int high, int half){

    }
}
