class MyRunnable1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("Runnable Interface 1 is running");

    }}
}

class MyRunnable2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("Runnable Interface 2 is running");
        }
    }
}

class MyRunnable3 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("Runnable Interface 3 is running");
        }
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        Thread t1 =  new Thread(new MyRunnable1());
        Thread t2 =  new Thread(new MyRunnable2());
        Thread t3= new Thread(new MyRunnable3());
        t1.start();
        t2.start();
        t3.start();
    }
}