package com.neoteric._4;

import java.util.Date;

public class Account {

    public String accountholdername;
    public String aadhar;
    public String pan;
    public Date dob;


    public Account(String accountholdername , String aadhar ,String pan,Date dob){
        this.accountholdername=accountholdername;
        this.aadhar=aadhar;
        this.pan=pan;
        this.dob=dob;

    }


    public String getAccountholdername() {
        return accountholdername;
    }

    public String getAadhar() {
        return aadhar;
    }

    public String getPan() {
        return pan;
    }

    public Date getDob() {
        return dob;
    }
}
