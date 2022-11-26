package br.edu.ifpr.paranavai.armarios.visao;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
 /*
 * Conteúdo de ajuda:
 * Colocar uma imagem em um JPanel: https://tjisblogging.blogspot.com/2013/04/how-to-set-background-image-to-jframe.html
 */

/**
 *
 * @author Aluno
 */
public class EditorIndexUI extends javax.swing.JFrame {

    /**
     * Creates new form EditorLoginUI
     */
    public EditorIndexUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        painelBackground =  new JPanel() {  
            public void paintComponent(Graphics g) {  
                System.out.println(EditorIndexUI.class.getResource("/assets/bg_main.png")); 
                Image img = Toolkit.getDefaultToolkit().getImage(EditorIndexUI.class.getResource("/assets/bg_main.png"));  
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
            }  
        };
        painelConteudo = new javax.swing.JPanel();
        painelEsquerdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelDireito = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/estudantes.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        painelBackground.setLayout(new java.awt.BorderLayout());

        painelConteudo.setOpaque(false);
        painelConteudo.setPreferredSize(new java.awt.Dimension(500, 378));
        painelConteudo.setLayout(new javax.swing.BoxLayout(painelConteudo, javax.swing.BoxLayout.LINE_AXIS));

        painelEsquerdo.setBackground(new java.awt.Color(220, 220, 220, 150));
        painelEsquerdo.setPreferredSize(new java.awt.Dimension(250, 378));
        painelEsquerdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelEsquerdoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelEsquerdoMouseExited(evt);
            }
        });
        painelEsquerdo.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Acesso para Empréstimos");
        painelEsquerdo.add(jLabel1);

        painelConteudo.add(painelEsquerdo);

        painelDireito.setBackground(new java.awt.Color(220, 220, 220, 150));
        painelDireito.setPreferredSize(new java.awt.Dimension(250, 378));
        painelDireito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelDireitoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                painelDireitoMouseExited(evt);
            }
        });
        painelDireito.setLayout(new java.awt.GridLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Acesso para Administrar");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelDireito.add(jLabel3);

        painelConteudo.add(painelDireito);

        painelBackground.add(painelConteudo, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelBackground);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        painelBackground.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
        painelBackground.revalidate();
    }//GEN-LAST:event_formComponentResized

    private void painelEsquerdoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelEsquerdoMouseEntered
        painelEsquerdo.setBackground(new java.awt.Color(220, 220, 220, 200));
        this.validate();
        this.repaint();
    }//GEN-LAST:event_painelEsquerdoMouseEntered

    private void painelEsquerdoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelEsquerdoMouseExited
        painelEsquerdo.setBackground(new java.awt.Color(220, 220, 220, 150));
        this.validate();
        this.repaint();
    }//GEN-LAST:event_painelEsquerdoMouseExited

    private void painelDireitoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDireitoMouseEntered
        painelDireito.setBackground(new java.awt.Color(220, 220, 220, 200));
        this.validate();
        this.repaint();
    }//GEN-LAST:event_painelDireitoMouseEntered

    private void painelDireitoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelDireitoMouseExited
        painelDireito.setBackground(new java.awt.Color(220, 220, 220, 150));
        this.validate();
        this.repaint();
    }//GEN-LAST:event_painelDireitoMouseExited

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
            java.util.logging.Logger.getLogger(EditorIndexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorIndexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorIndexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorIndexUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorIndexUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel painelBackground;
    private javax.swing.JPanel painelConteudo;
    private javax.swing.JPanel painelDireito;
    private javax.swing.JPanel painelEsquerdo;
    // End of variables declaration//GEN-END:variables
}