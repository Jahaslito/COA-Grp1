package com.COA_Group1;

import java.util.Random;

public class FloatingPoints {
    private static final int numbers = 30;
    double result;
    private String remark = "Approximate";

    public String getRemark() {
        return remark;
    }

//    public void setRemark(String remark) {
//        this.remark = remark;
//    }

    public double randomNumber(){
        Random rand = new Random();
        result = rand.nextInt(100000) / 1000.0;
        return result;
    }
    public String convert(double result){
        remark = "Approximate";
        DecimalBinaryConversion decimalConversion = new DecimalBinaryConversion();
        int[] separatedValues = separateValue(result);
        decimalConversion.setDecimalValue(separatedValues[0]);
        decimalConversion.convertToBinary();
        String binaryValue = decimalConversion.printValue();
        double decimalPointValue = separatedValues[1] / Math.pow(10, separatedValues[2]);
        String binaryNumber = "";

        for (int i = 0; i < 5; i++){
            double calculation = decimalPointValue * 2;
            int [] separatedValues2 = separateValue(calculation);
            decimalPointValue = separatedValues2[1] / Math.pow(10, separatedValues2[2]);
            if (decimalPointValue == 0.0){
                remark= "Exact";
                binaryNumber = binaryNumber + separatedValues2[0];
                break;
            }
            binaryNumber = binaryNumber + separatedValues2[0];
        }
        return binaryValue +"." +binaryNumber;
    }

    public int [] separateValue(double result){
        String[] arr=String.valueOf(result).split("\\.");
        int[] separatedValue=new int[3];
        separatedValue[0]=Integer.parseInt(arr[0]);
        separatedValue[1]=Integer.parseInt(arr[1]);
        separatedValue[2] = arr[1].length();


        return separatedValue;
    }

    public void displayTable(){

    }
}
