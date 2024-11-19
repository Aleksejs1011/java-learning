package lv.acodemy;

public class IfStatements {
    public static void main(String[] args) {

        int number = 6;
        if (number % 2 == 0)
            System.out.println("Even");
        else System.out.println("Odd");


        number = 10;
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        int grade = 68;
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 75) {
            System.out.println("B");
        } else if (grade >= 50) {
            System.out.println("C");
        } else System.out.println("F");

        //Task 1
        int age = 6;
        if (age >= 18) System.out.println("Person is eligible to buy alcohol.");
        else System.out.println("Person is not eligible to buy alcohol.");


        //Task 2
        int numer = 10;
        if (numer % 5 == 0) System.out.println("Can divide by 5");

        //Task 3
        int score = 66;
        if (score >= 50) System.out.println("Pass");
        else System.out.println("Fail");

        //Task 4
        int temp = 30;
        if (temp > 30) System.out.println("It's hot!");
        else if (temp >= 15) System.out.println("Nice weather");
        else System.out.println("It's cold!!!");

        //Task 5
        String color = "Yellow";
        if (color.equals("Green")) System.out.println("Go");
        else if (color.equals("Yellow")) System.out.println("Slow down");
        else if (color.equals("Red")) System.out.println("Stop");
        else System.out.println("The light is broken!");

    }
}
