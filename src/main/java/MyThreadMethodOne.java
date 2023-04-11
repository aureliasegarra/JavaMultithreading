public class MyThreadMethodOne extends Thread{

    @Override
    public void run(){
        System.out.println("MyThread is running");

        for (int i = 0; i < 5; i++) {
            System.out.println("THREAD #1 : 👉 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("MyThread is finished 🥳");
    }
}
