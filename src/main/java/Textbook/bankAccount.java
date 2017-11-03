package Textbook;

import java.util.Scanner;

public class bankAccount implements ATM {


    @Override
    public boolean verifyPIN(String pin) {
        Scanner in = new Scanner(System.in);
        String inputPin=in.nextLine();
        if(inputPin==pin){
            return true;
        }
        return false;
    }

    @Override
    public String selectAccount() {
        return null;
    }

    @Override
    public boolean withdraw(String account, double amount) {
        return false;
    }

    @Override
    public void display(String account, double amount, boolean success) {

    }

    @Override
    public void display(String pin, boolean success) {

    }

    @Override
    public void showBalance(String account) {

    }
}
