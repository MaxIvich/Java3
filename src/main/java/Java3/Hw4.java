package Java3;

public class Hw4  {





    final public String A = "A";
    final public String B = "B";
    final public String C = "C";
    private String ABC = C;


    //  private static void printABC(){
    //      PrintA();
    //      PrintB();
    //      PrintC();
    //
    //  }

    public synchronized   void PrintA() {

        if (ABC.equals(A) || ABC.equals(B)) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        if(ABC.equals(C)) {
            ABC = A;
            System.out.print(ABC);
            notifyAll();
        }else PrintA();


    }

    public synchronized void PrintB() {

            if (ABC.equals(C) || ABC.equals(B)) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(ABC.equals(A)){
            ABC = B;
            System.out.print(ABC);
                notifyAll();
            }else PrintB();




    }
    public synchronized void PrintC() {

        if (ABC.equals(A) || ABC.equals(C)) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(ABC.equals(B)) {
                ABC = C;
                System.out.print(ABC);
                notifyAll();
            }else PrintC();



    }
}
