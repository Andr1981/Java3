package homework3_4;



public class PrintTest {

    public static void main(String[] args) throws InterruptedException {

        Print print = new Print();
        new Thread(() -> print.printing_a()).start();
        new Thread(() -> print.printing_b()).start();
        new Thread(() -> print.printing_c()).start();

    }
}
