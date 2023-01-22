package week2;

public class ExamMarks {

    public static void main(String[] args) {

        hasPassed();

    }
    public static void hasPassed() {
        int marks = 50;
        boolean isOn = marks>=65;
        System.out.println(isOn);
       if (marks >=65 && marks<=100){
           System.out.println("Passed Successfully!");
       }else {
           System.out.println("Failed!");
       }
    }
}
