package day3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Singup{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String patternForName = "^[A-Za-z ]{3,50}$";
        String patternForAadhaar = "^[0-9]{12}$";
        String patternForPAN = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
        String patternForEmail = "^[a-zA-Z0-9._]{2,}+@[a-zA-Z0-9]{2,}+\\.[a-zA-Z]{2,}$";
        String username="", fullName = "";
        String aadhaar = "", myPan = "", email="";

        System.out.println("Enter the following details to validate fullname, username, email, aadhaar, pan");
        fullName = scanner.next();
        username = scanner.next();
        email = scanner.next();
        aadhaar = scanner.next();
        myPan = scanner.next();
        System.out.println("Is name is valid: "+Pattern.matches(patternForName,fullName));
        System.out.println("Is username is valid: "+Pattern.matches(patternForName, username));
        System.out.println("Is aadhaar is vlaid: "+Pattern.matches(patternForAadhaar,aadhaar));
        System.out.println("Is my Pan is valid: "+Pattern.matches(patternForPAN,myPan));
        System.out.println("Is my email valid: "+Pattern.matches(patternForEmail,email));

        scanner.close();
    }
}