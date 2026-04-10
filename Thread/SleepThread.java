class MyThread1 implements Runnable{
public void run(){
for(int i=0;i<10;i++){
try{ Thread.sleep(1000);}
catch(InterruptedException e){
System.out.println(e);}
System.out.println("Thread1 is running:"+i);}}}

class MyThread2 implements Runnable{
public void run(){
for(int i=10;i<20;i++){
try{ Thread.sleep(2000);}
catch(InterruptedException e){
System.out.println(e);}
System.out.println("Thread2 is running:"+i);}}}

class MyThread3 implements Runnable{
public void run(){
for(int i=20;i<30;i++){
System.out.println("Thread3 is running:"+i);}}}

class SleepThread{
public static void main(String args[]){
Thread t1=new Thread(new MyThread1());
Thread t2=new Thread(new MyThread2());
Thread t3=new Thread(new MyThread3());
t1.start();
t2.start();
t3.start();}}