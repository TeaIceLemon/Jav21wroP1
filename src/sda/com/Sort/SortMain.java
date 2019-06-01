package sda.com.Sort;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        Sort sort = new Sort();

        try(Scanner in = new Scanner(System.in )){
            System.out.println("Jakiej wielkości ma być tablica?");
            int n =in.nextInt();
            int[] arr= new int[n];
            for(int i =0; i<arr.length;i++){
                arr[i] = (int)(Math.random()*27 -6);
            }
            for(int i : arr){
                System.out.print(i+ " ");
            }
            System.out.println();
            for(int i : sort.arraySelecttionSort(arr) /*sort.arrayBoubleSort(arr)*/){
                System.out.print(i + " ");
            }
        }catch(IllegalFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
