package com.dataindev.view;

import com.dataindev.service.restAPI;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

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
    private JTextArea footer;

    public Conversor(){
        super("Conversor de divisas");
        setContentPane(panel);

        DecimalFormat df = new DecimalFormat("#.##");
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currency1 = Objects.requireNonNull(Divisas1.getSelectedItem()).toString().substring(0,3);
                String currency2 = Objects.requireNonNull(Divisas2.getSelectedItem()).toString().substring(0,3);

                restAPI rs = new restAPI();
                try {
                    double newCurrency = rs.exchange(currency1, currency2);
                    Salida.setText(CajaIngreso.getText() + " " + Divisas1.getSelectedItem().toString().substring(6));
                    Salida2.setText((df.format(newCurrency* Double.parseDouble(CajaIngreso.getText()))) + " " + Divisas2.getSelectedItem().toString().substring(6));
                    Salida3.setText(CajaIngreso.getText() + " " + Divisas2.getSelectedItem().toString().substring(0,3) + " = " +(df.format(rs.exchange(currency2,currency1)* Double.parseDouble(CajaIngreso.getText()))) + " " + Divisas1.getSelectedItem().toString().substring(0,3));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                // Texto del footer
                String textoLargo = " \u26A0 Usamos la tasa del mercado medio para nuestro conversor. Esto solo tiene fines informativos. No recibir\u00E1s esta tasa cuando env\u00EDes dinero.";
                footer.setText(textoLargo);;
                footer.setLineWrap(true); // Habilitar el ajuste automático de línea
                footer.setWrapStyleWord(true); // Ajustar palabras completas en lugar de caracteres individuales
                footer.setEditable(false);

            }
        });

    }

}
