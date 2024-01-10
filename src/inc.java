 package com.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class MyFrame6 extends Frame implements ActionListener {

    Button quitButton, incrementButton, decrementButton;
    Label numberLabel;
    int number = 0;
    TextField titleLabel;

    public MyFrame6(String title) {
        super(title);

        titleLabel = new TextField(title, 20);
        titleLabel.setEditable(false);

        quitButton = new Button("Quit");
        incrementButton = new Button("Increment");
        decrementButton = new Button("Decrement");
        numberLabel = new Label("Number: " + number);

        setLayout(new FlowLayout());
        add(titleLabel);
        add(quitButton);
        add(incrementButton);
        add(decrementButton);
        add(numberLabel);

        quitButton.addActionListener(this);
        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);

        // Create menu bar and menu
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Options");
        MenuItem aboutMenuItem = new MenuItem("About");
        menu.add(aboutMenuItem);
        menuBar.add(menu);
        setMenuBar(menuBar);

        // Add ActionListener for the "About" menu item
        aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MyFrame6.this, "This is a simple GUI program.", "About", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setBounds(50, 50, 400, 540);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quitButton) {
            int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else if (e.getSource() == incrementButton) {
            number++;
        } else if (e.getSource() == decrementButton) {
            number--;
        }

        numberLabel.setText("Number: " + number);
        setTitle("Increment/Decrement - Number: " + number);
    }
}

public class inc {
    public static void main(String args[]) {
        MyFrame6 mf = new MyFrame6("Increment/Decrement");
    }
}
