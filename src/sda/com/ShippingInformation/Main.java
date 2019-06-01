package sda.com.ShippingInformation;

import sda.com.MyLists.ArrayList1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ShippingData> dataArr = new ArrayList<>();
        ShippingData data = new ShippingData();
        System.out.println("Is it your shipping data? 0 - No , 1- Yes" );
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n ==0 ){
            ShippingData data1 = new ShippingData(data.getName(),data.getLastName());
            outerloop:
            while(true){
                System.out.println("soooooo whats your street?");
                data1.setStreet(in.nextLine());
                System.out.println("soooooo whats your City?");
                data1.setCity(in.nextLine());
                System.out.println("are you sure ? 0 - no, 1 - yes");
                int x = in.nextInt();
                if(n ==1){
                    break outerloop;
                }
            }
            dataArr.add(data1);
        }


    }
}
