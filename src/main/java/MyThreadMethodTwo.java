public class MyThreadMethodTwo implements Runnable{


    @Override
    public void run(){
        System.out.println("MyThread 2 is running 🏃‍♂️");

        for (int i = 1; i < 6; i++) {
            System.out.println("Thread 2" + " 👉 "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("MyThread 2 is finished 🥳");
    }
}


