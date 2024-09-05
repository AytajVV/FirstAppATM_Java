/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author AS Service
 */
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String pin;
    private double balance;
    
    public User(String id, String firstName, String lastName, String pin, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.balance = balance;
    }
    
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getPin(){
        return pin;
    }
    
    public void setPin(String pin){
        this.pin = pin;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance=balance;
    }
            
}
