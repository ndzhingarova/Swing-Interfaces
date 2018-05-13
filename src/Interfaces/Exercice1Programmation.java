/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author usager
 */
public class Exercice1Programmation extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    private JLabel jLabel1, jLabel2;
    private JPanel jPanel1;
    private JRadioButton jRadioButton1, jRadioButton2;

    public Exercice1Programmation() {
        setTitle("Fenêtre Exercice 1");
        getContentPane().setLayout(new BorderLayout());
        setLocation(500, 500);
        setMinimumSize(new Dimension(400,150));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel1 = new JPanel(new GridLayout(0, 1));
        jLabel1 = new JLabel("Bienvene dans la fenetre de l'exercice 1");
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);  
        jLabel2 = new JLabel("Clique sur un button pour change la couleur");
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        
        jRadioButton1 = new JRadioButton("Cyan");
        jRadioButton1.setBackground(Color.CYAN);
        jRadioButton1.setHorizontalAlignment(SwingConstants.CENTER);
        jRadioButton2 = new JRadioButton("Jaune");
        jRadioButton2.setBackground(Color.CYAN);
        jRadioButton2.setHorizontalAlignment(SwingConstants.CENTER);
        
        ButtonGroup color = new ButtonGroup();
        add(jPanel1);
        add(jLabel1, BorderLayout.NORTH);
        add(jLabel2, BorderLayout.SOUTH);
        jPanel1.add(jRadioButton1);
        jPanel1.add(jRadioButton2);
        color.add(jRadioButton1);
        color.add(jRadioButton2);
    }
    
    
    
    
    public static void main(String[] args) {
        Exercice1Programmation niki = new Exercice1Programmation();
        niki.setVisible(true);
    }
    
}
