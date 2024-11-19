package lv.acodemy;

public class ExampleClass {
    public static void main(String[] args) {
        sayHello();
        greet("Aleksejs");
        System.out.println(add(5, 3));
        System.out.println(add(12.2, 13.5));
    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
