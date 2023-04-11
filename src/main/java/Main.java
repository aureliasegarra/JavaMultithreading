public class Main {
    public static void main(String[] args) {
        System.out.println("##### DEMO THREAD JAVA #####");

        MyThreadMethodOne thread1 = new MyThreadMethodOne();
        thread1.start();
    }
}
