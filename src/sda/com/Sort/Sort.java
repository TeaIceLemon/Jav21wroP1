package sda.com.Sort;

public class Sort {
    public int[] arrayBoubleSort(int arr[]){
        boolean isSorted=false;
        do{
           isSorted=true;
            for(int i = 1 ; i<arr.length;i++){
                if(arr[i-1]>arr[i]){
                    int temp = arr[i-1];
                    arr[i-1]= arr[i];
                    arr[i] = temp;

                    isSorted = false;
                }
            }
        }while(!isSorted);
            return arr;
    }
    public int[] arraySelecttionSort(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            int minIndex =i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j] <arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    private void swap(int a, int b){
        int temp = a;
        a =b;
        b= temp;
    }
}
