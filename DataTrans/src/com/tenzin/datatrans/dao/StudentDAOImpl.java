/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.datatrans.dao;

import com.tenzin.datatrans.entity.Student;
import java.util.AbstractList;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class StudentDAOImpl implements StudentDAO{
   ArrayList<Student> stdList=new ArrayList<Student>();

    
    @Override
    public boolean add(Student s) {
        return stdList.add(s);
    }

   

    @Override
    public boolean checkEmail(Student s) {
      
               return false;
    }
    @Override
    public boolean checkId(Student s) {
     
       return true;       
           
       
    }

    @Override
    public AbstractList<Student> showAll() {
       return stdList;
    }
    
}
