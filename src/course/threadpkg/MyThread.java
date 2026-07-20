package course.threadpkg;

public class MyThread implements Runnable {


    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("Thread is "+ Thread.currentThread().getName()+", i value is ::" +i);
        }
    }
    public static void main(String[] args){
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        t1.setName("A");
        Thread t2 = new Thread(obj);
        t1.setName("B");
        Thread t3 = new Thread(obj);
        t1.setName("C");
        t1.start();
        t2.start();
        t3.start();
    }
}
