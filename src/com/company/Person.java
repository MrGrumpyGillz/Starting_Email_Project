package com.company;


import java.util.ArrayList;

public class Person {

    private ArrayList<Email> emails;
    private Time bestTime;
    private String name;

    Person(){

    }

    public void responded(String emailSubject){
        //used to set responses to an email
        for(Email e:emails){
            if (emailSubject.equals(e.getSubject())){
                e.setResponse(e.getResponse() + 0.022);
            }
        }
    }

    public void addEmails(ArrayList<Email> email) {
        this.emails = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Email> getEmails(){
        return emails;
    }

    //for testing purposes
    public void printEmails(){
        for(Email e: emails){
            System.out.println(e.printSub());
        }
    }
}
