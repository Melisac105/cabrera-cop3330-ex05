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
*/

import util.BasicOperations;
import util.Output;
import util.StringToInt;
import util.UsrInput;

public class SimpleMathApp {

    public static void main(String[] args) {
        String input1str = UsrInput.readInput1("first");
        String input2str = UsrInput.readInput1("second");
        int input1 = StringToInt.convertStr(input1str);
        int input2 = StringToInt.convertStr(input2str);
        int sum = BasicOperations.calcSum(input1, input2);
        int difference = BasicOperations.calcDifference(input1, input2);
        int product = BasicOperations.calcProduct(input1, input2);
        int division = BasicOperations.calcDivision(input1, input2);
        Output.printOutput(input1, input2, sum, difference, product, division);
    }
}
