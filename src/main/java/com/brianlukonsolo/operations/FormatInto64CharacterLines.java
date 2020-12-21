package com.brianlukonsolo.operations;

public class FormatInto64CharacterLines {
    public String format(int numberOfCharsPerLine, String loadedX509CertBas64String) {
        StringBuilder stringBuilder = new StringBuilder();
        int marker = 0;

        for(char c : loadedX509CertBas64String.toCharArray()){
            final String newLine = System.getProperty("line.separator");
            if(marker == numberOfCharsPerLine){
               stringBuilder.append(newLine);
               marker = 0;
            }
            stringBuilder.append(c);
            marker++;

        }

        return stringBuilder.toString();

    }

}
