/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.datatrans;

import com.tenzin.datatrans.controller.Controller;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;



/**
 *
 * @author Home
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
    // try{
      
         
         
         /*FileWriter writer=new FileWriter("D:\\DataT\\DataTrans\\src\\com\\tenzin\\datatrans\\rawdata\\data\\data.txt");
       writer.write("1,Ram,Nepali,ram@gmail.com,1\r\n");
        writer.write("2,tashi,Gurung,tashi@gmail.com,0\r\n");
         writer.write("3,karsang,tamang,karsang@gmail.com,1\r\n");
         writer.write("4,hari,Nepali,hari@gmail.com,0\r\n");
         writer.write("5,dawa,lama,lamagmail.com,1\r\n");
       writer.close();*/
     //}catch(IOException ioa){
        // System.out.println(ioa.getMessage());
     
         
        
        
        
        
        
        Controller controller = new Controller();
        
        controller.add();
        controller.showAll();
    
    }    
}
