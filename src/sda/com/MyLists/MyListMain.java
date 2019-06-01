package sda.com.MyLists;

import sda.com.StopWatch.StopWatch;

import java.util.ArrayList;

public class MyListMain {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();

        double avarageTime=0;
        int j =0;
        while(j<1000) {
            IList<Integer> list= new ArrayList2x<>();
            watch.start();
            for(int i =0; i<1000;i++){
                list.add(i);
            }
//            for (int i = 0; i < list.size(); i++) {
//                System.out.print(list.get(i) + ", ");
//            }
//            System.out.println();
            avarageTime+=watch.stop();
            j++;
        }
        System.out.println(avarageTime/1000);

    }
}
