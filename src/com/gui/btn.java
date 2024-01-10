package com.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class MyFrame2 extends Frame implements ActionListener{
    
    //declare button
    Button b,b1;
    public MyFrame2(String title)
    {
        super(title);
        b = new Button("Quit");
        b1 = new Button("yellow");
//        FlowLayout fl = new FlowLayout();
        setLayout(new FlowLayout());      //programmer is intructing  java to us FlowLayout 
        add(b);
        add(b1);
        Quit q= new Quit(); //ragister a btn ,interconnect a btn
        b1.addActionListener(this);
        b.addActionListener(q);
               
        setBounds(50,50,400,540);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         setBackground(Color.yellow);
    }
}


class Quit implements ActionListener
   {

    @Override
    public void actionPerformed(ActionEvent e) 
    {
     System.exit(0); //close program 
    }
    
}

 

public class btn {
    public static void main(String args[]){
        MyFrame2 mf = new MyFrame2("logo");
        
    }
}
