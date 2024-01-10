   package com.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
class MyFrame5 extends Frame implements ActionListener{
    
    //declare button
    Button b,b1;
    Random rnd = new Random();
    public MyFrame5(String title)
    {
        super(title);
        b = new Button("Quit");
        b1 = new Button("color ");
        rnd= new Random();
//        FlowLayout fl = new FlowLayout();
        setLayout(new FlowLayout());      //programmer is intructing  java to us FlowLayout 
        add(b);
        add(b1);
 
        Quit q= new Quit(); //ragister a btn ,interconnect a btn
        b.addActionListener(this);
        b1.addActionListener(this);         
        setBounds(50,50,400,540);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b){
             System.exit(0);

         }
         else{
             int red = rnd.nextInt(256);
             int green =rnd.nextInt(256);
             int blue = rnd.nextInt(255);
             Color c =new Color(red,green,blue);
             setBackground(c);

         }
 
         
           
    }
}


public class changecolor {
    public static void main(String args[]){
        MyFrame5 mf = new MyFrame5("color");
//        Random ob= new Random();
//        int x=ob.nextInt(49);
//        System.out.println("the number is " +x);
        
    }
}
