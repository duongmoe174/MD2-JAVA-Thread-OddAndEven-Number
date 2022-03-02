public class EvenNumber extends Thread{

    private Thread evenNumber;

    public EvenNumber() {
        evenNumber = new Thread(this, "EvenNumber");

    }

    @Override
    public void run() {
        try {
            System.out.println("This thread is: " + evenNumber);
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even number is: " + i);
                }
                Thread.sleep(15);
            }
        }
        catch (InterruptedException e) {
            System.out.println("EvenNumber DEAD!");
        }
        System.out.println("EvenNumber Done!");
    }
}
