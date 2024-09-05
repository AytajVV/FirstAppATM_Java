/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author AS Service
 */
public class Operations {
    private static User currentUser;
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void authenticateUser(){
        System.out.println("Enter your ID: ");
        String id = scanner.nextLine();
        
        if (DB.userDatabase.containsKey(id)) {
            currentUser=DB.userDatabase.get(id);
            System.out.println("Welcome "+ currentUser.getFirstName() +" " + currentUser.getLastName());
            verifyPin();
        }
        else{
            System.out.println("Incorrect ID");
        }
    }
    
    
    
    public static void verifyPin(){
        int attempts = 3;
        
        while(attempts > 0){
            System.out.println("Enter your PIN: ");
            
            String pin = scanner.nextLine();
            
            
            if (currentUser.getPin().equals(pin)) {
                showMenu();
                return;
                
            }
            else{
                attempts--;
                System.out.println("Incorrect PIN. You have " + attempts + " attempts left. ");
            }
        }
        System.out.println("Incorrect PIN. Exiting the program.");
    }
    
    
    
    public static void showMenu(){
        while(true){
            System.out.println("\nATM Menu: ");
            System.out.println("1 - Check balance");
            System.out.println("2 - Withdraw money");
            System.out.println("3 - Change PIN");
            System.out.println("4 - Exit program");
            System.out.println("Choose an option: ");
            
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch(choice){
                case 1: 
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    changePin();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
               
            }
            
            
            
        }
    }
    
    public static void checkBalance(){
        System.out.println("Your balance is " + currentUser.getBalance());
    }
    
    public static void withdrawMoney(){
        System.out.println("Enter amount to withdraw: ");
        double amount = Double.parseDouble(scanner.nextLine());
        
        if (amount>currentUser.getBalance()) {
            System.out.println("Insufficient balance. ");
            
        }
        else{
            currentUser.setBalance(currentUser.getBalance()-amount);
            System.out.println("Successfully withdrawn " + amount);
        }
    }
    
    
    
    public static void changePin(){
        System.out.println("Enter your new PIN: ");
        String newPin = scanner.nextLine();
        currentUser.setPin(newPin);
        
        System.out.println("Your PIN has been successfully changed. ");
        
    }
    
    
}
