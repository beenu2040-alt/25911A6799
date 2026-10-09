class SBuffer {
     int data;
    boolean hasData = false;

    // Producer method
    synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // wait until data is consumed
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught");
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
        notify(); // notify consumer
    }

    // Consumer method
    synchronized void consume() {
        while (!hasData) {
            try {
                wait(); // wait until data is produced
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught");
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // notify producer
    }
}

// Producer Thread
class Producer extends Thread {
    SBuffer b;

    Producer(SBuffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 6; i++) {
            b.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught");
            }

        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    SBuffer b;

    Consumer(SBuffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 6; i++) {
            b.consume();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught");
            }
        }
    }
}

// Main class
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SBuffer b = new SBuffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}

