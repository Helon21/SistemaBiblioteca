package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.controle.StatusArmariosControle;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import javax.swing.JOptionPane;

public class FormStatusArmariosUI extends javax.swing.JFrame {

    private Armario armario;

    public FormStatusArmariosUI() {
        initComponents();
        this.armario = new Armario();
    }

    public FormStatusArmariosUI(int codigo) {
        this.armario = StatusArmariosControle.buscarPorId(codigo);
        panelFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Status dos Armario" + this.armario.getArmarioId()));
        int valor = Integer.parseInt(txtNumeroArmario.getText());
        txtNumeroArmario.set(this.armario.getNumero(0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroArmario = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero do Armário");

        txtNumeroArmario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroArmarioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnSalvar))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumeroArmario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroArmario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(panelFormulario, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        StatusArmariosUI armariosUI = new StatusArmariosUI();
        armariosUI.setLocationRelativeTo(null);
        armariosUI.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (this.armario.getNumero() == null) {
            try {
                this.armario.setNumero(0);
                this.armario = StatusArmariosControle.inserir(this.armario);
                JOptionPane.showMessageDialog(this, "Armario Salva com Sucesso!!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Algo de Errado Aconteceu!!!");
                e.printStackTrace();
            }

        } else {
            try {
                this.armario.setNumero(0);
                this.armario = StatusArmariosControle.atualizar(this.armario);
                JOptionPane.showMessageDialog(this, "Alterações salvas com Sucesso!!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Algo de Errado Aconteceu!!!");
                e.printStackTrace();
            }
        }
        this.setVisible(false);
        StatusArmariosUI statusArmariosUI = new StatusArmariosUI();
        statusArmariosUI.setLocationRelativeTo(null);
        statusArmariosUI.setVisible(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNumeroArmarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroArmarioActionPerformed
        String valorTextField;
        Integer valorIntegerTextField;
        try {
            valorTextField = txtNumeroArmario.getText();
            //Capturo o valor do campoTextField e coloco em valorTextField.
            valorIntegerTextField = Integer.parseInt(valorTextField); //Transformo o valor de valorTextField em Integer e insiro em valorIntegerTextField.
            //Aqui pode ocorrer a exceção NumberFormatException, onde o campo de TextField conter algum valor que não seja inteiro.
        } 
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtNumeroArmarioActionPerformed

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
            java.util.logging.Logger.getLogger(FormStatusArmariosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormStatusArmariosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormStatusArmariosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormStatusArmariosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormStatusArmariosUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField txtNumeroArmario;
    // End of variables declaration//GEN-END:variables
}