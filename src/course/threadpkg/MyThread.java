package course.threadpkg;

public class MyThread implements Runnable {


    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("i value is :: " +i);
        }
    }
    public static void main(String[] args){
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();
    }
}
