package coba;

public class executionTime {
    public static void main(String[] args) throws InterruptedException {
        //from bro code
        // long start = System.nanoTime();
        // Thread.sleep(2000);
        // long duration = (System.nanoTime()-start)/1000000;
        // System.out.println(duration+"ms");

        long start = System.currentTimeMillis();
        //your program here(exclude scanner)
        long duration = System.currentTimeMillis()-start;
        System.out.println(duration+" ms");
    }
}
