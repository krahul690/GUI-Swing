  package com.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
 
class MyFrame4 extends Frame implements ActionListener{
    
    //declare button
    Button b,b1,b2,b3;
    public MyFrame4(String title)
    {
        super(title);
        b = new Button("Quit");
        b1 = new Button("yellow");
        b2= new Button("Green");
        b3= new Button("blue");
//        FlowLayout fl = new FlowLayout();
        setLayout(new FlowLayout());      //programmer is intructing  java to us FlowLayout 
        add(b);
        add(b1);
        add(b2);
        add(b3);
        Quit q= new Quit(); //ragister a btn ,interconnect a btn
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b.addActionListener(this);
               
        setBounds(50,50,400,540);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b){
             System.exit(0);

         }
         else if(e.getSource()==b1){
             setBackground(Color.yellow);
         }
         else if(e.getSource()==b2){
             setBackground(Color.green);
         }
         else{
             setBackground(Color.blue);
         }
         
           
    }
}


public class color {
    public static void main(String args[]){
        MyFrame4 mf = new MyFrame4("color");
        
    }
}
