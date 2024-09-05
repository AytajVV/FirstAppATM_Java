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
public class ATM {
    
    
    public static void main(String[] args) {
        DB.initializeUsers();
        Operations.authenticateUser();
    }
}
