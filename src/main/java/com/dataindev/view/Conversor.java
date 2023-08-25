package com.dataindev.view;

import javax.swing.*;
import javax.swing.JFrame;

public class Conversor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor de divisas");
        frame.setContentPane(new Conversor().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 450);
        frame.setLocationRelativeTo(null);
    }
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

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
