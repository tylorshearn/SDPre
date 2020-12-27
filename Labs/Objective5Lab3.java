import java.util.Scanner;
public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int userNum = 0;

    System.out.println("Please enter a number: ");

    userNum = scanner.nextInt();

    if (userNum > 0) {
    System.out.println("The number is positive");
  }
    if (userNum < 0) {
    System.out.println("The number is negative");
}
    if (userNum == 0) {
    System.out.println("The number is equal to 0");
}
    scanner.close();

  }
}
