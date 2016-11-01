package com.practice;


public class Printing {

    public String printCentered(int lines) {
        StringBuilder sb = new StringBuilder("");
        for(int lineNumber = 0; lineNumber<lines; lineNumber++){
            int starQuantity = ((2 * (lines-lineNumber)) -1);

            String str2 = new String(new char[(lineNumber*2)]).replace("\0", " ");
            sb.append(str2);

            while(starQuantity > 0){
                sb.append("*");
                if(starQuantity>1){
                    sb.append(" ");
                }
                --starQuantity;
            }
            if(lineNumber+1<lines){
                sb.append("\n");
            }
        }

        return  sb.toString();
    }
}
