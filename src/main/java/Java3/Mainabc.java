package Java3;

public class Mainabc {

    public static void main(String[] args) {
        Hw4 hw4 = new Hw4();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                hw4.PrintA();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                hw4.PrintB();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                hw4.PrintC();
            }
        }).start();


    }


}
