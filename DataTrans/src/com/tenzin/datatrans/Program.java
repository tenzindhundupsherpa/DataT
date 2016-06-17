/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.datatrans;

import com.tenzin.datatrans.controller.Controller;


/**
 *
 * @author Home
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        
        controller.add();
        controller.showAll();
    
    }    
}
