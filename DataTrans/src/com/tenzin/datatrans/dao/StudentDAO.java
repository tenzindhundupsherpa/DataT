/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.datatrans.dao;

import com.tenzin.datatrans.entity.Student;
import java.util.AbstractList;
/**
 *
 * @author Home
 */
public interface StudentDAO {
    
    boolean add(Student s);
    
    AbstractList<Student> showAll();
    
    boolean checkEmail(Student s);
    boolean checkId(Student s);
    
}
