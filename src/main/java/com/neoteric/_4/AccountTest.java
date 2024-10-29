package com.neoteric._4;

import java.util.Date;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("naveen","23456789","234567899",new Date());

        System.out.println(account.getAccountholdername()+" "+account.getAadhar()+" "+account.getPan()+" "+account.getDob());
    }

}
