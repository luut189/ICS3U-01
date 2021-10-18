/*
Name: Tuong Luu
Date: 15th October, 2021
Description: Variables Operations Math
*/

import java.text.DecimalFormat;
import java.util.*;

public class A0 {

  public static char sq = 178;

public static double areaOfCircle(double r) {
  return 3.14* (r*r);
} //method to calculate area of circle

public static void rectangle(double width, double length) {
  double areaOfRectangle = length * width; //calculate
  System.out.println("Length = " + length + "m"); //print length
  System.out.println("Width = " + width + "m"); //print width
  System.out.println("Area = " + areaOfRectangle + "cm" +sq); //print area
} //method to calculate area of rectangle

public static void netPay(double h, double w, double i, double t) {
  double n = (h * w - i) - t * (h * w - i); //calulate
  System.out.println("The net pay is " + "$" + n + " = " + "(" + h + "*" + w + "-" + i  + ") " + "-" + t + "*" + "(" + h + "*" + w + "-" + i + ")"); //print

}

public static void main(String[] args){

  //Q1 Area of a circle
  System.out.println("Question 1: Area of a circle"); //print question
  System.out.println("The area of this circle is " + areaOfCircle(15) + "cm" + sq); //use method and print result



  //Q2 Wayne Gretzky
  String name = "Wayne Gretzky";
  int num = 99;
  System.out.println("\nQuestion 2: Wayne Gretzky"); //print question
  System.out.println(name + " is the number " + num); //print result



  //Q3 Area of rectangle
  System.out.println("\nQuestion 3: Area of rectangle"); //print question
  rectangle(4.8, 5.7); //use method



  //Q4 Net Pay
  System.out.println("\nQuestion 4: Net Pay"); //print question
  netPay(40, 13, 4, 0.22); //use method



  //Q5 Math Operations
  int firstNum = 53; //declare and initialize first number
  int secondNum = 17; //declare and initialize second number
  int thirdNum = 3; //declare and initialize third number

  System.out.println("\nQuestion 5: Math Operations"); //print question
  System.out.println(firstNum + " / " + secondNum + " = " + thirdNum); //print equation



  //Q6 Bill of sale
  DecimalFormat dF = new DecimalFormat("$#0.00"); //create an object to round decimal places
  double price = 12.49; //declare and initialize the price of the shirt
  double given = 20.0; //declare and initialize the given cash
  double tax = 0.13*price; //declare and initialize the tax
  double subTotal = price; //declare and initialize the subtotal
  double total = price + tax; //declare and initialize the total amount after tax
  double change = given - total; //declare and initialize the amount of change

  String[] formatted = {dF.format(change), dF.format(given), dF.format(total), dF.format(tax), dF.format(subTotal)}; //array of strings to store the formatted double

  System.out.println("\nQuestion 6: Bill of sale\n"); //print question

  //print the bill
  System.out.println("| ------------------------------- |");
  System.out.println("|            Vêtements            |");
  System.out.println("| ------------------------------- |");
  System.out.println("| Item         Amount       Price |");
  System.out.println("| ------------------------------- |");
  System.out.println("| Shirt          01        $"+price+" |");
  System.out.println("| ------------------------------- |");
  System.out.println("| Subtotal                 "+formatted[4]+" |");
  System.out.println("| Tax                       "+formatted[3]+" |");
  System.out.println("| Total                    "+formatted[2]+" |");
  System.out.println("|                                 |");
  System.out.println("| Customer Cash            "+formatted[1]+" |");
  System.out.println("| Change                    "+formatted[0]+" |");
  System.out.println("| ------------------------------- |");

 }// close main
}// close class