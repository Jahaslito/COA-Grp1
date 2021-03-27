package com.COA_Group1;

public class DecimalHexadecimalConversion {
    private int decimalValue;
    private String hexadecimalValue;
    char hexCharacters[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};


    public DecimalHexadecimalConversion() {
    }

    public int getDecimalValue() {
        return decimalValue;
    }

    public void setDecimalValue(int decimalValue) {
        this.decimalValue = decimalValue;
    }

    public String getHexadecimalValue() {
        return hexadecimalValue;
    }

    public void setHexadecimalValue(String hexadecimalValue) {
        this.hexadecimalValue = hexadecimalValue;
    }

    public String convertToHexadecimal(){
       int remainder;
       hexadecimalValue = "";
       while ( decimalValue > 0 ){
        remainder = decimalValue % 16;
        hexadecimalValue = hexCharacters[remainder] + hexadecimalValue;
        decimalValue = decimalValue/16;
    }
        return hexadecimalValue;

    }

    public int convertToDecimal(){
        hexadecimalValue = hexadecimalValue.toUpperCase();
        decimalValue = 0;
        String hexChars = "0123456789ABCDEF";
        for (int i = 0; i < hexadecimalValue.length(); i++)
        {
            char c = hexadecimalValue.charAt(i);
            int d = hexChars.indexOf(c);
            decimalValue = 16*decimalValue + d;
        }
        return decimalValue;
    }

}
