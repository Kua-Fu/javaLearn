package onJava8.content.chapter6;

class Book {
    boolean checkout = false;

    Book(boolean checkout) {
        checkout = checkout;
    }

    void checkIn() {
        checkout = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkout) {
            System.out.println("error: check out");
        }
    }
}

public class TerminationCondition {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Book novel = new Book(true);
            novel.checkIn();
            new Book(true);
            // System.gc();
            // new Nap(1);
        }
    }
}