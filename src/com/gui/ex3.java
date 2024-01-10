/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;

import java.awt.Frame;

class MyFrame extends Frame{
    public MyFrame(){ //child class
        setTitle("rahul");
        setBounds(50,50,500,400);
        setVisible(true);
        
    }
}

public class ex3 {
    public static void main(String arsg[]){
        MyFrame fr= new MyFrame();
    }
}
