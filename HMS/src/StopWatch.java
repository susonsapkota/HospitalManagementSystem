/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Suson
 */
public class StopWatch {

    private final long start;
    private long stop;

    public StopWatch() {
        this.start = System.currentTimeMillis();
    }

    public void stop() {
        this.stop = System.currentTimeMillis();
    }

    public long timeElapsed() {
//        System.out.println("Time Elapsed: " + (stop - start) +" ms."); // can also divide by 1000 to get this into seconds :D
        return stop - start;
    }

}
