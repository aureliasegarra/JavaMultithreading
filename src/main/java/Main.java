public class Main {
    public static void main(String[] args) {
        System.out.println("##### DEMO THREAD JAVA #####");


        MyThreadMethodOne thread1 = new MyThreadMethodOne();
        thread1.start();

        MyThreadMethodTwo myThread = new MyThreadMethodTwo();
        Thread thread2 = new Thread(myThread);
        thread2.start();

    }
}


