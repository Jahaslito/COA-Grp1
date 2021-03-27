package com.COA_Group1;

public class DecimalBinaryConversion {
    private int decimalValue;
    private int binaryValue;
    private int binary[];
    int noOfBits;

    public DecimalBinaryConversion() {
    }


    public int getDecimalValue() {
        return decimalValue;
    }

    public void setDecimalValue(int decimalValue) {
        this.decimalValue = decimalValue;
    }

    public int getBinaryValue() {
        return binaryValue;
    }

    public void setBinaryValue(int binaryValue) {
        this.binaryValue = binaryValue;
    }

    public int[] convertToBinary(){

        binary = new int[40];
        noOfBits=0;
        while(decimalValue > 0){
            binary[noOfBits++] = decimalValue%2;
            decimalValue = decimalValue/2;
        }

        return binary;
    }

    public int convertToDecimal(){

        decimalValue = 0;
        int power = 0;
        while(true){
            if(binaryValue == 0){
                break;
            } else {
                int temp = binaryValue%10;
                decimalValue += temp*Math.pow(2, power);
                binaryValue = binaryValue/10;
                power++;
            }
        }
        return decimalValue;
    }
    public void printValue(){
        for(int i = noOfBits-1; i >= 0; i--){
        System.out.print(binary[i]);
        }
        System.out.println();
    }
}
