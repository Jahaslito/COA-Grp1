package com.COA_Group1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 3) {
            System.out.println("Hey Geek!! Want to convert some numbers? " +
                    "Choose:" +
                    "\n1 => Convert from decimal to binary" +
                    "\n2 => Convert from binary to decimal" +
                    "\n3 => Exit program");
            Scanner input = new Scanner(System.in); //System.in is a standard input stream.
            choice = input.nextInt();
            int value;
            DecimalBinaryConversion eg = new DecimalBinaryConversion();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number decimal number to be converted \n");
                    value = input.nextInt();
                    eg.setDecimalValue(value);
                    eg.convertToBinary();
                    eg.printValue();
                    break;
                case 2:
                    System.out.println("Enter a binary value to convert : ");
                    int binary;
                    binary = input.nextInt();
                    eg.setBinaryValue(binary);
                    System.out.println("\nThe decimal equivalent of " + binary + " is " + eg.convertToDecimal());
                    break;
                default:
                    System.out.println("Do you understand English !!");
            }
        }
    }
}
