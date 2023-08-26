package com.dataindev.view;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversor extends JFrame {

    private JPanel panel;
    private JComboBox Divisas1;
    private JComboBox Divisas2;
    private JPanel PanelIngreso;
    private JPanel PanelSalida;
    private JTextField CajaIngreso;
    private JPanel TextoAdicional;
    private JLabel Leyenda;
    private JLabel Titulo;
    private JLabel Salida2;
    private JPanel PanelSalida3;
    private JLabel Salida3;
    private JPanel PanelSalida2;
    private JLabel Salida;
    private JButton convertirButton;

    public Conversor(){
        super("Conversor de divisas");
        setContentPane(panel);

        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("texto");
            }
        });
    }


}
