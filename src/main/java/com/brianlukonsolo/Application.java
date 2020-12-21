package com.brianlukonsolo;

import com.brianlukonsolo.operations.AddX509StartAndEndLines;
import com.brianlukonsolo.operations.FormatInto64CharacterLines;
import com.brianlukonsolo.operations.LoadCertificateBase64String;

import java.io.IOException;

public class Application {
    public final static int MAX_CHARACTERS_PER_LINE = 64;
    public final static String newLine = System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        if(args.length > 0){
            String singleLineX509CertificateBase64 = new LoadCertificateBase64String().loadStringFromFile(args[0]);
            String formattedCert = new FormatInto64CharacterLines()
                    .format(MAX_CHARACTERS_PER_LINE, singleLineX509CertificateBase64);
            String validX509CertificateFormatted = new AddX509StartAndEndLines().encapsulateCert(formattedCert);

            System.out.println("String provided was: " + newLine + singleLineX509CertificateBase64);
            System.out.println("Standard X509 format:" + newLine + validX509CertificateFormatted);
        }else {
            System.out.println("Error: Please provide a valid file path.");
        }
    }
}
