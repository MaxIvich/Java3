package Java3.hw6;

import java.util.Arrays;

public class hw6 {


    static int[] after4Del(int[] a) throws RuntimeException {
        // ArrayList<Integer> arrayList = new ArrayList<>();
        int l = 0;
        if(a.length==0){
            throw new NullPointerException();
        }
        int[] after4 = new int[a.length];
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] != 4) {
                after4[i] = a[i];
                // arrayList.add(a[i]);
            }  else {
                l = a.length - i - 1;
               // System.out.println(l);
                if(l==0){

                }
                break;
            }
        }
        int[] nm = new int[l];

        int h = a.length - nm.length;
        for (int j = a.length; j >a.length- l; j--) {
           nm[j-h-1] = a[j-1];
        }
        if(l==0){ throw new RuntimeException();
        }
        return nm;
    }
    static boolean is4and1Inside(int[] arr) {

        if (arr.length==0){
            throw new NullPointerException();

        }
        int count1 = 0, count4 = 0;
        for (int x : arr) {
            if (x == 1) count1++;
            else if (x == 4) count4++;
            else return false;
        }
        return (count1 > 0 && count4 > 0);
    }

    public static void main (String[]args){


        int[] arr14 = new int[]{1, 1, 4, 1, 4};
        int[] arr = new int[]{1, 45, 2, 5, 21, 4, 2, 3, 465, 96,1,2};


        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.toString(after4Del(arr)));


        System.out.println( is4and1Inside(arr14));





        }

    }

