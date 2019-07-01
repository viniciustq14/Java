/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lab1
 */
public class Formulario {
    private JFrame form;
    private JLabel lblNome;
    private JButton btnSaudacao;
    private JTextField txtNome;

    public Formulario(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes() {
        // instancia objeto da Classe JFrame
        form = new JFrame("Meu Primeiro Formulario");
        // configura eixo (x, y) e tamanhop (largura, altura)
        form.setBounds(300, 250, 400, 200);
        // elimina pré-configurações de layout
        form.setLayout(null);
        // configura operação padrão ao fechar o form
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Font fontePadrao = new Font("Arial", Font.PLAIN, 16);
        
        // instancia objeto JLabel
        lblNome = new JLabel("Informe seu nome:");
        
        lblNome.setBounds(20, 30, 130, 20);
        
        lblNome.setForeground(Color.blue);
        lblNome.setFont(fontePadrao);
               
        form.getContentPane().add(lblNome);
        
        txtNome = new JTextField();
        
        txtNome.setBounds(155, 30, 200, 20);
        
        txtNome.setFont(fontePadrao);
        
        form.getContentPane().add(txtNome);
        
        btnSaudacao = new JButton("Enviar");
        
        btnSaudacao.setBounds(140, 100, 90, 20);
        //btnSaudacao.addActionListener(this);
        btnSaudacao.addActionListener( new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                                  // aqui vai a ação
                                  JOptionPane.showMessageDialog(form, " Voce digitou: "+txtNome.getText());
                     }


            });
        
        form.getContentPane().add(btnSaudacao);
        
        //apresenta o form
        form.setVisible(true);
        
        
        
    }
    
    
    
}
