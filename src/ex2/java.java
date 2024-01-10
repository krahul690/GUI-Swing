 
package ex2;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;
public class java {
    public static void main(String [] args){
        Frame fr = new Frame();
        Date dt = new Date();
        String str = dt.toString();
        fr.setBounds(450, 500, 800, 400);
        Color c= new Color(120,000,152);
        //setBackground(new Color (255,255,255); Annom..
        fr.setBackground(c);
        fr.setTitle(str);
        fr.setVisible(true);
    }
}
