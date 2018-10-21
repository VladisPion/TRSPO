package main;

class Threads implements Runnable {
    boolean isRun = true;

    @Override
    public void run() {
         int i = 0;
        System.out.println("Begin");
        while (isRun){
            try {
                Thread.sleep(1000);
                System.out.println("Thread "+ i++);

            }
            catch (InterruptedException ie)
            {
                System.out.println("\n Thread interrupted");
            }

        }
    }
}
