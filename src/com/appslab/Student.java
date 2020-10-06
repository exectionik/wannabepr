package com.appslab;


public class Student {



    private String name;
    private int numberofs;
    private int sNumber;
    private String address;
    public Student(String name, int numberofs, int sNumber, String address){
        this.name = name;
        this.numberofs = numberofs;
        this.sNumber = sNumber;
        this.address = address;

    }

    public Student() {

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNumberofs(){
        return numberofs;
    }

    public void setNumberofs(int numberofs) {
        this.numberofs = numberofs;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setsNumber(int sNumber) {
       this.sNumber = sNumber;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
