/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;
/**
 *
 * @author Dora Di
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.rmi.*; 
import p5.*;

public class RMIClientDB 
{
    public static void main(String args[])throws Exception
    {  
            // name =  rmi:// + ServerIP +  /EngineName;
            String customerEngine = "rmi://localhost/Customer";
            String fileEngine = "rmi://localhost/File";
            
            // Create local stub, lookup in the registry searching for the remote engine - the interface with the methods we want to use remotely
            BankInterface bankObj = (BankInterface) Naming.lookup(customerEngine);
            FileInterface fileObj = (FileInterface) Naming.lookup(fileEngine);
            


        List<Customer> list = bankObj.getCustomers();
        for(Customer c:list)
        {
            System.out.println(c.getAccnum()+ " " + c.getName() + " " + c.getAmount());
        }

        File file = fileObj.getFile();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
} 
