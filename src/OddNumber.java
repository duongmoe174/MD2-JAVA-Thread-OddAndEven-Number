public class OddNumber  extends Thread{

    private Thread oddNumber;

    public OddNumber() {
        oddNumber = new Thread(this, "OddNumber");
    }

    @Override
    public void run() {
        try {
            System.out.println("This thread is " + oddNumber);
            for (int i = 0; i < 10; i++) {
                if(i % 2 != 0) {
                    System.out.println("OddNumber is: " + i);
                }
                Thread.sleep(10);
            }
        }
        catch (InterruptedException e) {
            System.out.println("OddNumber Dead!");
        }
        System.out.println("OddNumber done!");
    }
}
