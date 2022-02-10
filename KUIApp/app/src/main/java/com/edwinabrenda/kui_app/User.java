package com.edwinabrenda.kui_app;

public class User {
    private String Username;
    private String regnumber;
    private  String phonenumber;
    private  String email;

    public  User(){

    }

    public User(String username, String regnumber, String phonenumber, String email) {
        Username = username;
        this.regnumber = regnumber;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

