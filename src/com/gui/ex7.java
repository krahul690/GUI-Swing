 package com.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
 
class MyFrame7 extends Frame implements ActionListener{
    
    //declare button
    Button b,b1,b2;
    int count=0;
    public MyFrame7(String title)
    {
        super(title);
        b = new Button("Quit");
        b1 = new Button("Inc");
        b2 = new Button("Decr");
//        FlowLayout fl = new FlowLayout();
        setLayout(new FlowLayout());      //programmer is intructing  java to us FlowLayout 
        add(b);
        add(b1);
        add(b2);
        Quit q= new Quit(); //ragister a btn ,interconnect a btn
        b1.addActionListener(this);
        b2.addActionListener(this);
        b.addActionListener(this);
               
        setBounds(50,50,400,540);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b){
             System.exit(0);

         }
//         else if(e.getSource()==b1){
//                ++count;
//                setTitle(String.valueOf(count));
//         }
//         else{
//             --count;
//                setTitle(String.valueOf(count));             
//         }
         else{
            count = (e.getSource()==b2)?count+1:count-1;
            setTitle(String.valueOf(count));
         }
    }
}


public class ex7 {
    public static void main(String args[]){
        MyFrame7 mf = new MyFrame7("logo");
        
    }
}
