package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, WrongFormatException, EndOfEmailException {
        File file = new File("test.txt");
        Scanner filein = new Scanner(file);
        Scanner stdin = new Scanner(System.in);

        Person testPerson = new Person();
        ArrayList<Email> emails = new ArrayList<>();

        String title = filein.nextLine();
        if(!title.equals("Emails")){
            throw new WrongFormatException();
        }

        try {
            //test if adding emails works
            while (true) {
                Email tempE = new Email(filein);
                //add emails to array
                emails.add(tempE);
            }
        } catch (EndOfEmailException e){

        }

        //add emails to person
        testPerson.addEmails(emails);


        //use for testing
        testPerson.printEmails();

        /* future website interface?
           gives the ability to search for people and see stats on them
        */

    }



}
