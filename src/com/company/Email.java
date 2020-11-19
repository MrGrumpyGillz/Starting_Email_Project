package com.company;

import java.util.Scanner;

public class Email {
    private String sender;
    private String receiver;
    private String subject;
    private String body;
    //this is between 0-1. 1 being stronger response/reaction likely hood
    //-1 means no response/reaction
    private double response;
    private Time sent;
    private Time received;

    Email(Scanner s) throws EndOfEmailException {


        //sets sender and receivers addresses
        String strin = "";
            strin = s.nextLine();
        while (!strin.equals("---")) {

            if (strin.equals("===")) {
                throw new EndOfEmailException();
            }

            String[] sendres = strin.split(":");
            sender = sendres[0];
            receiver = sendres[1];
            strin = s.nextLine();
            subject = strin;

            //build body
            String tempBody = null;
            strin = s.nextLine();
            while (!strin.equals("...")) {
                if (tempBody == null) {
                    tempBody = strin;
                } else {
                    tempBody = tempBody + " " + strin;
                }
                strin = s.nextLine();
            }
            body = tempBody;

            //stats
            strin = s.nextLine();
            String[] sendSplit = strin.split("::");
            if (sendSplit[0].equals("Sent")) {
                String date = sendSplit[1].split("\\.")[0];
                String[] dateSplit = date.split("/");

                String time = sendSplit[1].split("\\.")[1];
                String[] timeSplit = time.split(":");

                sent = new Time(Integer.parseInt(dateSplit[0]), Integer.parseInt(dateSplit[1]), Integer.parseInt(dateSplit[2]), Integer.parseInt(timeSplit[0]), Integer.parseInt(timeSplit[1]));
            }
            strin = s.nextLine();
            String[] tempRes;
            tempRes = strin.split(":");
            response = Double.parseDouble(tempRes[1]);

            strin = s.nextLine();
        }
    }

    public String printSub(){
        return subject;
    }

    public void setResponse(double response) {
        this.response = response;
    }
    public double getResponse(){
        return response;
    }

    public String getSubject(){
        return subject;
    }
}



    class WrongFormatException extends Exception {}

    class EndOfEmailException extends Exception {}
