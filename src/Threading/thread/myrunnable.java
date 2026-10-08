package Threading.thread;

public class myrunnable implements Runnable {

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("thread was interrupted");
            }
            if(i==5){
                System.out.println("Time's UP!");
            }
        }
    }
}
