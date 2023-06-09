public class MyThreadMethodOne extends Thread{


    @Override
    public void run(){
        System.out.println("MyThread 1 is running 🏃‍♂️");

        for (int i = 1; i < 6; i++) {
            System.out.println("Thread 1 " + " 👉 "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("MyThread 1 is finished 🥳");
    }
}
