package com.COA_Group1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 5) {
            System.out.println("Hey Geek!! Want to convert some numbers? " +
                    "Choose:" +
                    "\n1 => Convert from decimal to binary" +
                    "\n2 => Convert from binary to decimal" +
                    "\n3 => Convert from decimal to hexadecimal" +
                    "\n4 => Convert from hexadecimal to decimal" +
                    "\n5 => Exit program");
            Scanner input = new Scanner(System.in); //System.in is a standard input stream.
            choice = input.nextInt();
            int value;
            DecimalBinaryConversion eg = new DecimalBinaryConversion();
            DecimalHexadecimalConversion convert = new DecimalHexadecimalConversion();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number decimal number to be converted \n");
                    value = input.nextInt();
                    eg.setDecimalValue(value);
                    eg.convertToBinary();
                    eg.printValue();
                    System.out.println("\n\n\n");
                    break;
                case 2:
                    System.out.println("Enter a binary value to convert : ");
                    value = input.nextInt();
                    eg.setBinaryValue(value);
                    System.out.println("\nThe decimal equivalent of " + value + " is " + eg.convertToDecimal());
                    System.out.println("\n\n\n");
                    break;
                case 3 :
                    System.out.println("Enter a decimal value to be converted:\n");
                    value = input.nextInt();
                    convert.setDecimalValue(value);
                    System.out.println("The hexadecimal equivalent of " +value+" is "+convert.convertToHexadecimal());
                    System.out.println("\n\n\n");
                    break;
                case 4:
                    System.out.println("Enter the hexadecimal value to be converted :\n");
                    String hexadecimalValue =input.next();
                    convert.setHexadecimalValue(hexadecimalValue);
                    System.out.println("The hexadecimal equivalent of " +hexadecimalValue+" is "+convert.convertToDecimal());
                    System.out.println("\n\n\n");
                    break;
                default:
                    System.out.println("Do you understand English !!");
            }
        }
    }
}
