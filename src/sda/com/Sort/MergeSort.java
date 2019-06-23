package sda.com.Sort;

public class MergeSort {
    public int[] mergeSort (int[] arr , int low, int high){
        if(low<high){
            int half = (low+high)/2;
            mergeSort(arr,low,half);
            mergeSort(arr,half+1,high);
            merge(arr,low,half,high);
        }
        return arr;
    }
    private void merge(int[] arr, int low, int half, int high){
        // checking what length are tables
        int[] a1 = new int[half-low+1]; // +1 because when low and half = 0 a1.length
        int[] a2 = new int[high - half];

        //copying values from arr to temp tables
        for(int i = 0; i<a1.length;i++){
            a1[i] = arr[low + i];
        }
        for(int i = 0;i<a2.length;i++){
            a2[i] =arr[(half + 1 + i )]; // +1 or not ? answer is not => debugged
        }
        //parsing sorted values to arr
        int i=0;
        int j=0;
        int k=low; // algoritm needs to know where to pass the value
        while((i<  a1.length) && (j < a2.length)){
            if(a1[i]<=a2[j]){
                arr[k] = a1[i];
                i++;
            }else {
                arr[k] = a2[j];
                j++;
            }
            k++;
        }
        // parsing the rest of values
        while(i<a1.length){
            arr[k] =a1[i];
            i++;
            k++;
        }
        while(j<a2.length){
            arr[k] =a2[j];
            j++;
            k++;
        }
    }
}
