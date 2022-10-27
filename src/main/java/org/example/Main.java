package org.example;





public class Main {

    public static void main(String[] args) {

        EmailsandPasswords emailandPasswords = new EmailsandPasswords();


        LoginPage loginPage = new LoginPage(emailandPasswords.getLoginInfo());


    }
}