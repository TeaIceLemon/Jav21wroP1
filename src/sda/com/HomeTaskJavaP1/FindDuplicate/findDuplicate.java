package sda.com.HomeTaskJavaP1.FindDuplicate;

public class findDuplicate {
    public static void main(String[] args){
        findDuplicate dup = new findDuplicate();
        int[] arr = {1,1,2,3,4,5,5};
        dup.findDuplicate(arr);

    }

    public void findDuplicate(int [] arr){
        boolean[] isDuplicated = new boolean[arr.length];
        boolean finded = false;
        for(int i =0; i<arr.length;i++){
            if(isDuplicated[arr[i]]){
                System.out.println("duplikowana liczba to: " + arr[i]);
                finded = true;
            }
            isDuplicated[arr[i]] = true;
        }
        if(!finded) System.out.println("there is no duplicated number in array");
    }
}
