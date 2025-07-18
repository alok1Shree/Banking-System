package org.banking;

import java.security.PublicKey;

public class Util {
    public String randomId(String accountType){
        if(accountType.equals(AccountType.SAVING.toString())){
            double randomGeneratedId = Math.random();
            randomGeneratedId = (int)(randomGeneratedId*900)+100;
            String randomNumberFormated = String.valueOf(randomGeneratedId).replace(".0","");
            //System.out.println("SA"+randomGeneratedId);
            return "SA"+randomNumberFormated;
        }
        if(accountType.equals(AccountType.CURRENT.toString())){
            double randomGeneratedId = Math.random();
            randomGeneratedId = (int)(randomGeneratedId*900)+100;
            String randomNumberFormated = String.valueOf(randomGeneratedId).replace(".0","");
            //System.out.println("CA"+randomGeneratedId);
            return "CA"+randomNumberFormated;
        }
        return null;
    }

    public String accountNumber(String accountType){
        if(accountType.equals(AccountType.SAVING.toString())){
            double randomGeneratedId = Math.random();
            String randomNumberFormated = String.valueOf(randomGeneratedId).replace("0.","");
            //System.out.println("SA"+randomGeneratedId);
            return "SA"+randomNumberFormated;
        }
        if(accountType.equals(AccountType.CURRENT.toString())){
            double randomGeneratedId = Math.random();
            String randomNumberFormated = String.valueOf(randomGeneratedId).replace("0.","");
            //System.out.println("CA"+randomGeneratedId);
            return "CA"+randomNumberFormated;
        }
        return null;
    }
}
