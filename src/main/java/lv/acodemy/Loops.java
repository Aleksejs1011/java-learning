package lv.acodemy;

public class Loops {
    public static void main(String[] args) {

      String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

      for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Current product is: " + shoppingList[i]);
      }

      for (String s : shoppingList) {
            System.out.println("Current product 2 is: " + s);
        }

      int i = 0;
      while (i < shoppingList.length) {
          System.out.println("Current product 3 is: " + shoppingList[i]);
          i++;
      }

      int j = 0;
      do {
          System.out.println("Current product 4 is: " + shoppingList[j]);
          j++;}
      while (j < shoppingList.length);

      boolean x = 1 < 5 && 6 < 3;
      System.out.println(x);
      boolean y = 2 < 5 || 3 < 2;
      System.out.println(y);

    }//end
}
