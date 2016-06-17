/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.datatrans.controller;

import com.tenzin.datatrans.dao.StudentDAO;
import com.tenzin.datatrans.dao.StudentDAOImpl;
import com.tenzin.datatrans.entity.Student;
import com.tenzin.datatrans.rawdata.RawData;

/**
 *
 * @author Home
 */
public class Controller {
     StudentDAO studentDAO=new StudentDAOImpl();
    
    
    public void add(){
          String[] rd=RawData.data();
       
       for(int i=0;i<5;i++){
           String[] tokens=rd[i].split(",");
       
       if(tokens.length<=5){
           Student std=new Student();
           std.setId(Integer.parseInt(tokens[0]));
           std.setfName(tokens[1]);
           std.setlName(tokens[2]);
           std.setEmail(tokens[3]);
           if(Integer.parseInt(tokens[4])==0){
               std.setStatus(false);
           }else if(Integer.parseInt(tokens[4])==1){
               std.setStatus(true);
           }
           boolean a = studentDAO.checkEmail(std);
           boolean b = studentDAO.checkId(std);
          
           studentDAO.add(std);
       
       }
    }
    
    }
    
    public void showAll(){
        for(Student sd:studentDAO.showAll()){
         System.out.println("ID:" + sd.getId());
         System.out.println("First Name:" + sd.getfName());
         System.out.println("Last Name:" + sd.getlName());
         System.out.println("Email:" + sd.getEmail());
         if(sd.isStatus()==true){
             System.out.println("Status: valid");   
         }else if(sd.isStatus()!=true){
             System.out.println("Status: invalid");
         }
     }  
    }
    
}
