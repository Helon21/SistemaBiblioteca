package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.controle.StatusArmariosControle;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StatusArmariosUI extends javax.swing.JFrame {

    List<Armario> listarTodosArmarios;

    public StatusArmariosUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarTodosArmarios = StatusArmariosControle.buscarTodos();
        populaTabelaArmarios(listarTodosArmarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroArmario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArmarios = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar Armário por Número");

        btnBuscar.setText("Buscar");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnInserir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addGap(74, 74, 74)
                        .addComponent(btnDeletar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumeroArmario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumeroArmario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnDeletar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tblArmarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Numero", "Status", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblArmarios);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        FormStatusArmariosUI formStatus = new FormStatusArmariosUI();
        this.setVisible(false);
        formStatus.setLocationRelativeTo(this);
        formStatus.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (tblArmarios.getSelectedRow() >= 0) {
            int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do armario?",
                    "Excluir Armario", JOptionPane.YES_NO_OPTION);
            if (resposta == 0) {
                int dadosLinha = tblArmarios.getSelectedRow();
                int codigo = (int) tblArmarios.getModel().getValueAt(dadosLinha, 0);

                for (Armario armario : this.listarTodosArmarios) {
                    if (armario.getArmarioId() == codigo) {
                        StatusArmariosControle.excluir(armario);
                    }
                }
                this.listarTodosArmarios = StatusArmariosControle.buscarTodos();
                populaTabelaArmarios(this.listarTodosArmarios);

                JOptionPane.showMessageDialog(null, "Armário removido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Armário!");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblArmarios.getSelectedRow() >= 0) {
            int dadosLinha = tblArmarios.getSelectedRow();
            int codigo = (int) tblArmarios.getModel().getValueAt(dadosLinha, 0);
            FormStatusArmariosUI formStatus = new FormStatusArmariosUI(codigo);
            this.setVisible(false);
            formStatus.setLocationRelativeTo(this);
            formStatus.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um armário!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    public void populaTabelaArmarios(List<Armario> listar) {
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel) tblArmarios.getModel();
        //Limpar a tabela
        while (modeloDeColunasDaTabela.getRowCount() != 0) {
            modeloDeColunasDaTabela.removeRow(0);
        }
        for (int i = 0; i < listar.size(); i++) {
            Armario mostrarArmarios = listar.get(i);
            Object[] dadosLinha = new Object[2];
            dadosLinha[0] = mostrarArmarios.getArmarioId();
            dadosLinha[1] = mostrarArmarios.getNumero();
            dadosLinha[2] = mostrarArmarios.isAtivo();
            dadosLinha[3] = mostrarArmarios.getObservacoes();
            modeloDeColunasDaTabela.addRow(dadosLinha);
        }
    }

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
            java.util.logging.Logger.getLogger(StatusArmariosUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusArmariosUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusArmariosUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusArmariosUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatusArmariosUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblArmarios;
    private javax.swing.JTextField txtNumeroArmario;
    // End of variables declaration//GEN-END:variables
}
