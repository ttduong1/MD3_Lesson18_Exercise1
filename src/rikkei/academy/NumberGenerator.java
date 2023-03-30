package rikkei.academy;

public class NumberGenerator implements Runnable{
    @Override
    public void run(){
        System.out.println("Generator hashcode:" + hashCode());
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
