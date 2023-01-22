package week3.week3;

public class StaticVariables {

    private static int num1 = 100;
    private double num2 = 100.2;
    private static final double PI = 3.13516;

    //single design pattern

    private int d = 12; //instance variable

    public static void main(String[] args) {
        System.out.println(num1);

        StaticVariables obj1 = new StaticVariables();

        System.out.println();
        obj1.add(2,4);
        obj1.add(3,4, 6);
        obj1.add(1,4,5);


        String a ="elo";
        String b = a + "world";
        System.out.println(b);


    }
// overloading ca be done by
    // amount of arguements
    // differnt types of data types
    public void add(int a, int b){
        int c = 10;
        System.out.println("The sum is: " + (a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("The sum is: " + (a+b+c));
    }
    public void add (int a, int b, int c, int d){
        System.out.println("The sum is:" + (a+b+c+d));
    }
}