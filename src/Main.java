public class Main {
    public static void main(String[] args) {
        OddNumber o1 = new OddNumber();
        EvenNumber e1 = new EvenNumber();
        o1.setPriority(Thread.MAX_PRIORITY);
        e1.setPriority(Thread.MIN_PRIORITY);

        o1.start();
        try {
            o1.join();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        e1.start();
    }
}
