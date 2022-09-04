package Java3.hw6;

import org.junit.jupiter.api.Test;

import static Java3.hw6.hw6.after4Del;
import static Java3.hw6.hw6.is4and1Inside;
import static org.junit.jupiter.api.Assertions.*;

class Testhw6 {

              hw6 hw6 = new hw6();
    int[] a = new int[]{};
    int[] b = new int[]{-1,2,-3};
    int[] c = new int[]{4,2,3,4,7,8,-9};

    int[] d = new int[]{1,4,1,4,1,4,1,4};


    @Test
    void test1() {
      after4Del(a);

    }
    @Test
    void test2(){
        after4Del(b);
    }

    @Test
    void test3(){
        after4Del(c);

    }
    @Test
    void test21(){
        is4and1Inside(a);
    }
    @Test
    void test22(){
        is4and1Inside(d);
    }
}