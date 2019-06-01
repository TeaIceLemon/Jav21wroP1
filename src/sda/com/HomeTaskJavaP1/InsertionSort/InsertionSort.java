package sda.com.HomeTaskJavaP1.InsertionSort;

import sda.com.StopWatch.StopWatch;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        StopWatch watch = new StopWatch();
        int[] arr = new int[15];
        for(int i =0; i<arr.length;i++){
            arr[i] = (int)((Math.random()*100) +1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        watch.start();
        sort.insertioSort(arr);
        System.out.println(watch.stop());
        for(int a : arr) System.out.print(a + " ");
    }

    public int[] insertioSort(int[] arr){
        int i, j ,temp;
        for(i=1; i<arr.length;i++){
            j=i-1;
            while(j>=0 && arr[j]>arr[i]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i=j;
                j--;
            }
        }
        return arr;
    }
}
