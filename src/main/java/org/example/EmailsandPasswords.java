package org.example;

import java.util.HashMap;

public class EmailsandPasswords {

    private String Email;
    private String Pharmacy;
    private String Last;
    private String First;
    private String Address;

    private String Insurance;
    HashMap<String, String> logininfo = new HashMap<String,String>();

    EmailsandPasswords(){
        logininfo.put("A","abc");
        logininfo.put("D","def");
        logininfo.put("G","ghi");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }

    public void setEmail(String newEmail){
        this.Email = newEmail;

    }
    public String getEmail(){
        System.out.println(Email);
        return Email;
    }

    public String getPharmacy(){
        return Pharmacy;
    }

    public void setPharmacy(String pharm){
        this.Pharmacy = pharm;
    }

    public String getLast(){
        return Last;
    }

    public void setLast(String last){
        this.Last = last;
    }

    public String getFirst(){
        return First;
    }

    public void setFirst(String first){
        this.First = first;
    }

    public String getAddress(){
        return Address;
    }

    public void setAddress(String address){
        this.Address = address;
    }

    public String getInsurance(){
        return Insurance;
    }

    public void setInsurance(String insurance){
        this.Insurance = insurance;
    }
}

