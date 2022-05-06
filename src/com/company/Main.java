package com.company;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends Frame {

    public Main() {
        setTitle("D.V.Bara");
        setLocation(1070, 0);
    }


    public static void main(String[] args) {
        Main gui = new Main();
        gui.setSize(300, 300);
        gui.setVisible(true);
        gui.setLayout(null);

        gui.setIconImage(Toolkit.getDefaultToolkit().getImage("src/com/company/icon.png"));


        TextField txt = new TextField("Enter your name");
        txt.setBounds(100, 200, 300, 50);

        Button btn = new Button("Click me");
        btn.setBounds(100, 100, 100, 50);
        btn.setBackground(Color.RED);

        Label lbl = new Label(" D.V.Bara");
        lbl.setBounds(100, 250, 200, 50);
        lbl.setForeground(Color.BLUE);
        lbl.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("Enter key pressed");
                    lbl.setText("D.V.Bara IS A Genius !! 👌👌✌");
                    lbl.setBounds(100, 250, 250, 50);
                }
            }
        });
        lbl.setBackground(Color.CYAN);

        System.out.println(txt.getText());


        gui.add(lbl);
//        gui.add(txt);
//        gui.add(btn);

        gui.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println("Window is closing");
                lbl.setText("Window is closing");
                lbl.setBackground(Color.RED);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.exit(0);
            }
        });
    }
}
