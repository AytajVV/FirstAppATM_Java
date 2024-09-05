/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author AS Service
 */
public class DB {
    public static Map<String, User> userDatabase = new HashMap<>();
  
  
    
    
    
    
    
    public static void initializeUsers() {
    userDatabase.put("1", new User("1", "Aytaj", "Veyisli", "1111", 500.0));
    userDatabase.put("2", new User("2", "Narmin", "Aliyeva", "2222", 1000.0));
     
    }
    
}

