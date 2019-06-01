package sda.com.StopWatch;

public class stopWatchMain {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        int[] arr = new int[100];
        for(int i = 0; i<arr.length;i++){
            arr[i] = (int) (Math.random()*100) +1;
        }
        float avarageTime;
        watch.start();
        for(int i =0; i<arr.length;i++){
            arr[i]*=2;
        }
        //System.out.println(watch.stop());
    }
}
