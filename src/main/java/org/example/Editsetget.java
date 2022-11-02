package org.example;

public class Editsetget {
    private String address;
    private String pharmacy;
    private String insurance;

    private String name;


    public String getInsurance(){
        return this.insurance;
    }

    public void setInsurance(String insur){
        this.insurance = insur;
    }
    public String getPharmacy(){
        return this.pharmacy;
    }

    public void setPharmacy(String pharm){
        this.pharmacy = pharm;
    }
    public String getAddress(){
        return this.address;
    }

    public void setAddress(String add){
        this.address = add;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }


}
