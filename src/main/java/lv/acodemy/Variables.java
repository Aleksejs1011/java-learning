package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        int age = 41;
        int currentYear = 2024;
        int inventoryItemCount = 100;

        System.out.println("Current age: " + age);
        System.out.println("Current Year: " + currentYear);
        System.out.println("Inventory Item Count: " + inventoryItemCount);

        double temperature = 36.6;
        double price = 19.99;

        System.out.println("Body temperature is: " + temperature);
        System.out.println("Eldorado..?: " + price);

        char grade = 'A';
        char myInitial = 'A';
        char currencySymbol = '$';

        System.out.println("My Grade is: " + grade);
        System.out.println("So is my initial: " + myInitial);
        System.out.println("Just some currency symbol: " + currencySymbol);

        boolean hasAccess = true;
        boolean isSummer = false;

        System.out.println("Does it have access? " + hasAccess);
        System.out.println("Is it summer now? " + isSummer);

        long phoneNumber = 123654789;
        System.out.println("Phone number: " + phoneNumber);

        float interestRate = 4.5f;
        System.out.println("Interest Rate: " + interestRate);

        //Math section
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum is: " + sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println("Difference: " + difference);

        int m = 7;
        int n = 3;
        int result = m * n;
        System.out.println("Result: " + result);

        double num1 = 10;
        double num2 = 3;
        double division = num1 / num2;
        System.out.println("Division result: " + division);

        // % (remainder of division)
        int f = 12;
        int g = 5;
        int remainder = f % g;
        System.out.println("Remainder of division result: " + remainder);

        int number = 8;
        boolean isEven = (number % 2 == 0);
        System.out.println("Is number even? " + isEven);

        int counter = 10;
        counter++;
        int postIncrement = counter++;
        int preIncrement = ++counter;


        String name = "John";
        String lastName = "Doe";

        System.out.println(name);
        System.out.println(lastName);

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        System.out.printf("My name is: %s, My surname is: %s\n", name, lastName);
        System.out.printf("My name is: %s, My surname is: %s%n", name, lastName);

        var myCurrentAge = 41;
        var text = "Hello World";

//end


    }
}
