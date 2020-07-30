package BT_LopThreadDonGian;

public class NumberGenerator extends Thread {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread(){
        @Override
        public void run() {
            System.out.println("test");
    }
};
        NumberThread thread3 = new NumberThread();


}