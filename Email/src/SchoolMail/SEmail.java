package SchoolMail;

import java.util.Scanner;

public class SEmail {
    public static void main(String[] args) {
        EmailApp email1 = new EmailApp();

        email1.setAemail("j.akli@gmail.com");
        System.out.println("Your alternat email is: " + email1.getAemail());

    }
}

