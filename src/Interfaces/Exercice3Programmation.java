/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author usager
 */
public class Exercice3Programmation extends javax.swing.JFrame {

    /**
     * Creates new form Exercice3Programmation
     */
    public Exercice3Programmation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        quantite = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prixUnitaire = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        JLabel4 = new javax.swing.JLabel();
        totalNet = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tvq = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tps = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        totalBrut = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fenetre Exercice 3");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Article: ");
        jPanel2.add(jLabel1);

        jTextField1.setColumns(10);
        jPanel2.add(jTextField1);

        jLabel2.setText("Quantité: ");
        jPanel2.add(jLabel2);

        quantite.setColumns(5);
        quantite.setName("quantite"); // NOI18N
        jPanel2.add(quantite);

        jLabel3.setText("Prix Unitaire: ");
        jPanel2.add(jLabel3);

        prixUnitaire.setColumns(5);
        jPanel2.add(prixUnitaire);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 20, 570));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Calculer");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 1, 1, 1));
        jPanel4.setLayout(new java.awt.GridLayout(0, 2));

        JLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JLabel4.setText("Total: ");
        jPanel4.add(JLabel4);

        totalNet.setColumns(20);
        totalNet.setMaximumSize(new java.awt.Dimension(166, 20));
        jPanel4.add(totalNet);

        jPanel3.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(70, 1, 70, 1));
        jPanel5.setLayout(new java.awt.GridLayout(0, 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("TVQ: ");
        jPanel5.add(jLabel5);

        tvq.setColumns(20);
        tvq.setMaximumSize(new java.awt.Dimension(166, 20));
        jPanel5.add(tvq);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("TPS: ");
        jPanel5.add(jLabel6);

        tps.setColumns(20);
        tps.setMaximumSize(new java.awt.Dimension(166, 20));
        jPanel5.add(tps);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 50, 1));
        jPanel6.setLayout(new java.awt.GridLayout(0, 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Total: ");
        jPanel6.add(jLabel7);

        totalBrut.setColumns(20);
        totalBrut.setMaximumSize(new java.awt.Dimension(166, 20));
        jPanel6.add(totalBrut);

        jPanel3.add(jPanel6, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel3, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        totalNet.setText(String.valueOf(Double.parseDouble(quantite.getText()) * Double.parseDouble(prixUnitaire.getText())));
        tvq.setText(String.valueOf(Double.parseDouble(totalNet.getText()) * 0.09975));
        tps.setText(String.valueOf(Double.parseDouble(totalNet.getText()) * 0.05));
        totalBrut.setText(String.valueOf(Double.parseDouble(totalNet.getText()) + 
                                            Double.parseDouble(tvq.getText()) + 
                                            Double.parseDouble(tps.getText())));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exercice3Programmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercice3Programmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercice3Programmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercice3Programmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercice3Programmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField prixUnitaire;
    private javax.swing.JTextField quantite;
    private javax.swing.JTextField totalBrut;
    private javax.swing.JTextField totalNet;
    private javax.swing.JTextField tps;
    private javax.swing.JTextField tvq;
    // End of variables declaration//GEN-END:variables
}