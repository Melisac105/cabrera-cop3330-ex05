package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public String readInput1(String type) {
        System.out.format("What is the %s number? ", type);
        return input.nextLine();
    }
}
