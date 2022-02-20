package thread_demo;

public class ThreadImplementationDemo extends Thread{
    Thread t;
    String threadName;
    public ThreadImplementationDemo(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Thread is: " + this.threadName);
        }
    }

    public void execute(){
        t = this;
        t.start();
    }
}
