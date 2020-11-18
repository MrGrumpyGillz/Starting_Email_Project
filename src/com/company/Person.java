package com.company;


import java.util.ArrayList;

public class Person {

    private ArrayList<Email> emails;
    private Time bestTime;
    private String name;

    Person(){

    }

    public void send(){
        //used to send an email
    }

    public void addEmails(ArrayList<Email> email) {
        this.emails = email;
    }

    public void setName(String name) {
        this.name = name;
    }


    //for testing purposes
    public void printEmails(){
        for(Email e: emails){
            System.out.println(e.printSub());
        }
    }
}
