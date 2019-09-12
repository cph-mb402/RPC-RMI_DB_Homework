/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5.rmiclientdb;
/**
 *
 * @author Dora Di
 */

import java.io.File;
import java.util.*;
import java.rmi.*; 
import p5.*;

public class RMIClientDB 
{
    public static void main(String args[])throws Exception
    {  
            // name =  rmi:// + ServerIP +  /EngineName;
            String customerEngine = "rmi://localhost/Customer";
            String fileEngine = "rmi://localhost/Customer";
            
            // Create local stub, lookup in the registry searching for the remote engine - the interface with the methods we want to use remotely
            BankInterface bankObj = (BankInterface) Naming.lookup(customerEngine);
            FileInterface fileObj = (FileInterface) Naming.lookup(fileEngine);
            


//        List<Customer> list = bankObj.getCustomers();
//        for(Customer c:list)
//        {
//            System.out.println(c.getAccnum()+ " " + c.getName() + " " + c.getAmount());
//        }

        File file = fileObj.getFile();

        System.out.println(file.toString());
    }
  
} 
