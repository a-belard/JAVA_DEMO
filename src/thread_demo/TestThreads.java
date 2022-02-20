package thread_demo;

public class TestThreads {
    public static void main(String[] args) {
//        RunnableDemo thread1 = new RunnableDemo("Thread 1");
//        RunnableDemo thread2 = new RunnableDemo("Thread 2");
        ThreadImplementationDemo thread1 = new ThreadImplementationDemo("Thread 1");
        ThreadImplementationDemo thread2 = new ThreadImplementationDemo("Thread 2");
        thread1.execute();
        thread2.execute();
    }
}
