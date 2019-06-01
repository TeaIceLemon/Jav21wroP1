package sda.com.HomeTaskJavaP1.MinMax;

import java.util.Scanner;

public class MinMaxDoubleArr {
    public static void main(String[] args) {
        MinMaxDoubleArr minMaxDouble = new MinMaxDoubleArr();
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Put natural number");
            int n = in.nextInt();
            double[] arr = new double[n];
            for(int i =0;i<n; i++){
                arr[i] = (Math.random() *100) + 1 ;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            double[] minMax = minMaxDouble.minMax(arr);
            System.out.println("Min value: " + minMax[0] + ", Max value: " + minMax[1]);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }



    }
    public double[] minMax(double[] arr){
        double[] minMax ={arr[0],arr[0]};
        for(int i =1; i<arr.length;i++){
            if(minMax[0]>arr[i]) minMax[0] = arr[i];
            if(minMax[1]<arr[i]) minMax[1] = arr[i];
        }
        return minMax;
    }
}
