class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Thread1 is running..."+i);
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for(int i=15;i<30;i++){
            System.out.println("Thread2 is running..."+i);
        }
    }
}

class MyThread3 extends Thread{
    public void run(){
        for(int i=30;i<45;i++){
            System.out.println("Thread3 is running..."+i);
        }
    }
}

class SetThreadPriority{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();

        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10
    //t1.setPriority(1); // Minimum priority
    //t2.setPriority(5); // Normal priority
        t1.start();
        t2.start();
        t3.start();
    }
}

// Output may come out as mixed, setting priority does not guarantee the order of execution, it is just a hint to the thread scheduler.