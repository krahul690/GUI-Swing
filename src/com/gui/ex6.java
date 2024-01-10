 package com.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
 
class MyFrame3 extends Frame implements ActionListener{
    
    //declare button
    Button b,b1;
    public MyFrame3(String title)
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
        b.addActionListener(this);
               
        setBounds(50,50,400,540);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b){
             System.exit(0);

         }
             else{
             setBackground(Color.yellow);
         }
    }
}


public class ex6 {
    public static void main(String args[]){
        MyFrame3 mf = new MyFrame3("logo");
        
    }
}
