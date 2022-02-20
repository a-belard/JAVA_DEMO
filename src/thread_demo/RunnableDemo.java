package thread_demo;

public class RunnableDemo implements Runnable{
    Thread t;
    String threadName;
    public RunnableDemo(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Thread is: " + this.threadName);
        }
    }

    public void execute(){
        t = new Thread(this, threadName);
        t.start();
    }
}
