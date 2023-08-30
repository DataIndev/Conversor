package com.dataindev;

import com.dataindev.view.Conversor;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new Conversor();
                frame.setSize(950, 550);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);

                //contenido centrado y mejor visualizacion
                GridBagConstraints constraints;
                constraints = new GridBagConstraints();
                constraints.gridx = 0;
                constraints.gridy = 0;
                constraints.weightx = 1.0;
                constraints.weighty = 1.0;
                constraints.fill = GridBagConstraints.BOTH;
            }
        });

    }

}
