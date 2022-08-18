package Java3.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit>{



    private ArrayList<T> fuitsbox;


    public Box(T... fruits) {

        this.fuitsbox = new ArrayList<>(Arrays.asList(fruits));
    }

    void addAll(List< ? extends T > fruits){
        fuitsbox.addAll(fruits);

    }

    public double getWeight() {
        double sum = 0.0;
        for (T fruit : fuitsbox) {
            sum += fruit.getWeight();

        }
        return sum;
    }


    public void pour (Box < ? super T > box){
        box.addAll(fuitsbox);
            fuitsbox.clear();

        }
}
