// Import libraries here

import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here

///Initals
  System.out.println("SSSSS   HH     HH");
  System.out.println("SS      HH     HH");
  System.out.println("SS      HH     HH");
  System.out.println(" SSSS   HHHHHHHHH");
  System.out.println("    SS  HH     HH");
  System.out.println("    SS  HH     HH");
  System.out.println("SSSSS   HH     HH");


///Temp Conversion
  Scanner scan = new Scanner(System.in);
  int fahrenheitTemp;
  double celcTemp;
  final int BASE = 32;
  final double CONVERSION_FACTOR = 9.0 / 5.0;

  System.out.println("\n Please enter a Temperature in Fahrenheit:");
  fahrenheitTemp = scan.nextInt();

  celcTemp = (fahrenheitTemp - BASE) / CONVERSION_FACTOR;

///5 Letter String
  Scanner scanner = new Scanner(System.in);
  System.out.print("\n Enter a string: ");
  String originalInput = scanner.next();
  scanner.close();
  scan.close();

  String newAnswer = new StringBuilder(originalInput).reverse().substring(1, originalInput.length() - 1);

////Random Number
  Random generator = new Random();
  int num1;

  num1 = generator.nextInt(13352) + 32;
  System.out.println("Your Random Number:" + num1);

  System.out.println("\n Generating your random number....");

///Final Output
  System.out.println("\n" + celcTemp + newAnswer + num1); }}
