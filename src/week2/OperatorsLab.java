package week2;
//lab4
public class OperatorsLab {

    public static void main(String[] args) {


     int investment = 14000;
     double firstYear = investment * .40;
     double addition = firstYear + investment;
     int secondYear = -1500;
     double subtract = addition - secondYear;
     float thirdYear = .12f;


        System.out.println("Initial investment $" + investment);
        System.out.println("First year investment $" + addition );
        System.out.println("Second year investment $" + subtract);
        System.out.println("Third year investment $" + subtract*thirdYear + subtract);
        System.out.println();

        System.out.println(weight());
        System.out.println();
        System.out.println(celsiustoFahrenheit());
        System.out.println();
        System.out.println(fahrenheittoCelsius());

    }
    public static double weight(){
     int earthWeight = 50;
     double moonWeght= earthWeight * .17;
     return moonWeght;
    }

    public static float celsiustoFahrenheit(){
        int celsius = 100;
        float farhrenheit = celsius * 1.8f + 32;
        return farhrenheit;
    }
    public static float fahrenheittoCelsius(){
        int fahrenheit = 100;
        float celsius = (fahrenheit - 32) /1.8f;
        return  celsius;
    }


}
