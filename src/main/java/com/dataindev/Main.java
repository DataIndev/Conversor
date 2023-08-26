package com.dataindev;

import com.dataindev.service.restAPI;
import com.dataindev.view.Conversor;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

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
