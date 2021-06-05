/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output

What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints

Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the inputs and outputs separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Don’t allow the user to enter a negative number.
Break the program into functions that do the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
 */

package base;

import java.util.Scanner;

public class SimpleMath {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        SimpleMath myMath = new SimpleMath();

        String input1 = myMath.readInput1();
        String input2 = myMath.readInput2();
        int[] convInt = myMath.conversionStrInt(input1, input2);
        int[] mathOperations = myMath.math(convInt);
        myMath.output(convInt, mathOperations);
    }

    public String readInput1() {
        System.out.print("What is the first number? ");
        return input.nextLine();
    }

    public String readInput2() {
        System.out.print("What is the second number? ");
        return input.nextLine();
    }

    public int[] conversionStrInt(String in1, String in2) {
        int[] i = new int[2];
        i[0] = Integer.parseInt(in1);
        i[1] = Integer.parseInt(in2);
        return i;
    }

    public int[] math(int[] in) {
        int[] i = new int[4];
        i[0] = in[0] + in[1];
        i[1] = in[0] - in[1];
        i[2] = in[0] * in[1];
        i[3] = in[0] / in[1];
        return i;
    }

    public void output(int[] in, int[] operations) {
        System.out.format("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d \n",in[0], in[1], operations[0], in[0], in[1], operations[1], in[0], in[1], operations[2], in[0], in[1], operations[3]);
    }
}
