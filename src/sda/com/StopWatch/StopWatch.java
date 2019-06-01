package sda.com.StopWatch;

public class StopWatch {
    private long startTime;
   public void start(){
       startTime = System.nanoTime();
   }
   public float stop(){
       return  (System.nanoTime() - startTime)/1000000f;
   }


}
