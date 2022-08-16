package Java3.task1;

import java.util.Arrays;

public class Task1 {

    public static <t> void  swap(t[] s, int first, int second) {
        t sw = s[first];
        s[first]=s[second];
        s[second]= sw;



    }

    public static void main(String[] args) {
        String[] str ={"a","b","c"};
        System.out.println(Arrays.toString(str));
        swap(str,0,2);
        System.out.println(Arrays.toString(str));










    }

}


