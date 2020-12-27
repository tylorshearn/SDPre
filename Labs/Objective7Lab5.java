import java.util.Scanner;
public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;


    while (true) {
      System.out.println("____Menu____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println("");

      selection = scanner.nextInt();

      if (selection == 1) {
      System.out.println("Hello World");
    }
      if (selection == 2) {
      System.out.println("Apples, Bananas, Coconuts");
    }
      if (selection >3 || selection <1) {
      System.out.println("This is not a valid answer choice");
    }
      if (selection == 3) {
      System.out.println("Goodbye");
      break;
    }
    }
scanner.close();
  }
}
