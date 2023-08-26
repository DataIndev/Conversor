package com.dataindev;

import com.dataindev.view.Conversor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Conversor();
                frame.setSize(800, 600);
                frame.setVisible(true);

            }
        });
    }

}
