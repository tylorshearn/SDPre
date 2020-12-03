import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    age = input.nextInt();
    currentYear = 2020;
    birthYear = currentYear - age;

    /*
    I've noticed this code doesn't necessarily calculate the person's birth month. For example, I'm 24,
    but I was born in 1995, not 1996. I cannot get the code any more precise with the expected output guidelines.
    */ 



    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
