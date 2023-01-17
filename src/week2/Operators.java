package week2;

public class Operators {
    //objects are created through constructor


    //variable private
    //variable declaration
    //step1 access type private public default
    //step2 data types
    //step3 variable name
    //step4 initialtion give inital value =

    private int age = 100;
    private  String name = "Java";
    private float num1 = 12.59f;
    private long bigNumber = 100000000000000l;
    private double num2 = 32156317381.37128;
    private boolean isActive = true;

    //default constructor
    public Operators(){

    }

    //public methods
    //method declaration
    //step1 accesser type
    //step 2 return types or void
    //step 3 method name ()

    public void saySomething(){
        System.out.println("My name is :" + name);
        System.out.println("My age is :" + age);
    }

    public float addNum(){
        int addNum = 5;
        float add = addNum + num1;
        return add;
    }
    public double subtract (){
        int subNum = 10;
        double sub = num2 - subNum;
        return  sub;
    }

    public static void main(String[] args) {
        Operators operatorsObjects = new Operators();
    operatorsObjects.saySomething();
    float addOperation = operatorsObjects.addNum();
        System.out.println(addOperation);
    double subtractOperator = operatorsObjects.subtract();
        System.out.println(subtractOperator);

        operatorsObjects.arithMathicOperations();

    }

    public void arithMathicOperations(){
        int i = 5;
        float f = 6.0f;
        double d = 10.25;
        long l = 10000l;
        int a = 10;
        int b = 3;


        float multiply = i * f;
        double divide = d / i;
        double remainder = l % d;
        int remainder2 = a % b;
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);
        System.out.println("Remainder: "+ remainder);
        System.out.println("Remainder2:" + remainder2);




    }

}