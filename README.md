# Brian Lukonsolo's X509CertificateFormatter  
  A personal application I made to convert X509 base64 single-line strings into standard X509 certificates.

 To run the application, follow the instructions below:

 - [x] Clone this project with: `git clone https://github.com/brianlukonsolo/X590CertificateFormatter`
 - [x] Run a maven build: `mvn clean install`
 - [ ] Copy the Jar file to a convinient location (optional)
 - [x] Place your single-line base64 x509 certificate string in text file
 - [x] Run the Jar, passing the path to the text file as an argument: `java -jar X590CertificateFormatter-1.0-SNAPSHOT.jar /path/to/text/file.txt`

Your formatted certificate will be printed to stdout (your terminal or CMD prompt).
I may add more features later, enjoy! :)