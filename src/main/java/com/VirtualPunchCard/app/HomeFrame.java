package com.VirtualPunchCard.app;


import javax.swing.*;

/**
 * Home frame that displays an overview of their recent work history.
 * As well as serve as a main navigation page to manage their work schedule.
 */
public class HomeFrame extends JFrame {

    public static void main(String[] args) {
        HomeFrame freshFrame = new HomeFrame();
    }


    JPanel panel = new JPanel();

    HomeFrame(){
        super("Virtual Punch Card");
        setSize(800,700);
        setLocationRelativeTo(null);
        panel.setLayout (null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
