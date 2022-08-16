package Java3.task2;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    //2. Написать метод, который преобразует массив в ArrayList;
    public static String[] str= {"A","B","C","D","E","F","G",};


    public static <T> List<T> change(T[] arr){

        List<T> list = Arrays.asList(arr);
        return list;

    }

    public static void main(String[] args) {
        System.out.println("Массив: "+ Arrays.toString(str));

        List<String> list = change(str);
        System.out.println("Лист: "+ list);




    }
}
