package com.brianlukonsolo;

public class AddX509StartAndEndLines {

    public String encapsulateCert(String formattedCertificateBase64String) {
        final String newLine = System.getProperty("line.separator");

        return "-----BEGIN CERTIFICATE-----" +
                newLine +
                formattedCertificateBase64String +
                newLine +
                "-----END CERTIFICATE-----";

    }

}
