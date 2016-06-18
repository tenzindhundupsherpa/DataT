/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.datatrans.controller;

import com.tenzin.datatrans.dao.StudentDAO;
import com.tenzin.datatrans.dao.StudentDAOImpl;
import com.tenzin.datatrans.entity.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Home
 */
public class Controller {

    StudentDAO studentDAO = new StudentDAOImpl();

    public void add() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\DataT\\DataTrans\\src\\com\\tenzin\\datatrans\\rawdata\\data\\data.txt"));
            String l = "";
            while ((l = reader.readLine()) != null) {

                
                    String[] tokens = l.split(",");

                    if (tokens.length <= 5) {
                        Student std = new Student();
                        std.setId(Integer.parseInt(tokens[0]));
                        std.setfName(tokens[1]);
                        std.setlName(tokens[2]);
                        std.setEmail(tokens[3]);
                        if (Integer.parseInt(tokens[4]) == 0) {
                            std.setStatus(false);
                        } else if (Integer.parseInt(tokens[4]) == 1) {
                            std.setStatus(true);
                        }
                        boolean a = studentDAO.checkEmail(std);
                        boolean b = studentDAO.checkId(std);

                        studentDAO.add(std);

                    
                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void showAll() {
        for (Student sd : studentDAO.showAll()) {
            System.out.println("ID:" + sd.getId());
            System.out.println("First Name:" + sd.getfName());
            System.out.println("Last Name:" + sd.getlName());
            System.out.println("Email:" + sd.getEmail());
            if (sd.isStatus() == true) {
                System.out.println("Status: valid");
            } else if (sd.isStatus() != true) {
                System.out.println("Status: invalid");
            }
        }
    }

}
