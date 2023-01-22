package week3.week3;
import java.util.Arrays;
public class ArraysExample {

    public static void main(String[] args) {
        // index starts from 0
        int [] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println(array[1]);
        for(int i=0; i<10; i++){
            array[i] = 1 + i;

        }
        for(int i =0; i<10; i++){
            System.out.println(array[i]);
        }

        double [] arr2 = new double[5];
        arr2[0] = 1.5;
        arr2[1] = 3.0;

        System.out.println(arr2[1]);

        String [] arr3 = new String[3];
        arr3[0] = "hello";
        arr3[1] = "world";
        arr3[2] = "!";

        System.out.println(arr3[0] + " " + arr3[1] + "" + arr3[2]);

        // {1,2,3} row 1
        // {4,5,6} row 2
        int[][] twodarray = new int[2][3];
        twodarray[0][0] = 2;
        twodarray[0][1] = 3;
        twodarray[0][2] = 4;
        twodarray[1][0] = 5;
        twodarray[1][1] = 6;
        twodarray[1][2] = 7;

        for(int i = 0; i <2; i++){
            for(int j = 0; j<3; j++){
                System.out.println(twodarray[i][j]);
            }
        }
        int[] arr4 = {1,2,4,3,10,7,9,11,6};
        String [] arr5 = {"hello", "world", "!"};

        Arrays.sort(arr4);
        System.out.println("min value: " + arr4[0]);
        System.out.println("max value: " + arr4[arr4.length -1]);


        {
    }
}

}

