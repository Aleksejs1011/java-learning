package lv.acodemy;

import lv.acodemy.objects.Car;
import lv.acodemy.objects.Dog;

public class ObjectExample {
    public static void main(String[] args) {

        Car audi = new Car("Blue", "RS6");
        audi.start();
        System.out.println(audi);

//        audi.color = "Blue";
//        audi.model = "RS6";
        audi.setColor("Blue");
        audi.setModel("RS6");
        System.out.println(audi);


        Car bmw = new Car();
        bmw.start();
        bmw.setColor("Red");
        bmw.setModel("Z3");
        System.out.println(bmw);

        System.out.println("My car model is " + bmw.getModel() + " and color is: " + bmw.getColor() + "." );
        System.out.println(String.format("My car model is: %s, and color is: %s.", bmw.getModel(), bmw.getColor() ));


        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();

    }
}
