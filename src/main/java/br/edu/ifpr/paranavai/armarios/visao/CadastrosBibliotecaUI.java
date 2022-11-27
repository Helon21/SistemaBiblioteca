package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.controle.BibliotecarioControle;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrosBibliotecaUI extends javax.swing.JFrame {

    List<Bibliotecario> listarTodosBibliotecarios;

    public CadastrosBibliotecaUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarTodosBibliotecarios = BibliotecarioControle.listarTodosBibliotecarios();
        populaTabelaBibliotecario(listarTodosBibliotecarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelSuperior = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        painelInferior = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBibliotecario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnNovo.setText("Novo Cadastro");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo);

        btnAlterar.setText("Alterar Cadastro");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Nome:");
        jPanel2.add(jLabel1);
        jPanel2.add(txtNome);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);

        javax.swing.GroupLayout painelSuperiorLayout = new javax.swing.GroupLayout(painelSuperior);
        painelSuperior.setLayout(painelSuperiorLayout);
        painelSuperiorLayout.setHorizontalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelSuperiorLayout.setVerticalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(painelSuperior, java.awt.BorderLayout.PAGE_START);

        painelInferior.setLayout(new java.awt.BorderLayout());

        tblBibliotecario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBibliotecario);

        painelInferior.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        FormCadastroBibliotecaUI form = new FormCadastroBibliotecaUI();
        this.setVisible(false);
        form.setLocationRelativeTo(this);
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblBibliotecario.getSelectedRow() >= 0) {
            int dadosLinha = tblBibliotecario.getSelectedRow();
            int codigo = (int) tblBibliotecario.getModel().getValueAt(dadosLinha, 0);
            FormCadastroBibliotecaUI form = new FormCadastroBibliotecaUI(codigo);
            this.setVisible(false);
            form.setLocationRelativeTo(this);
            form.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um bibliotecario!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblBibliotecario.getSelectedRow() >= 0) {
            int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão da Localização?",
                    "Excluir Localização!", JOptionPane.YES_NO_OPTION);
            if (resposta == 0) {
                int dadosLinha = tblBibliotecario.getSelectedRow();
                int codigo = (int) tblBibliotecario.getModel().getValueAt(dadosLinha, 0);

                for (Bibliotecario bibliotecario : this.listarTodosBibliotecarios) {
                    if (bibliotecario.getPessoaId() == codigo) {
                        BibliotecarioControle.excluir(bibliotecario);
                    }
                }
                this.listarTodosBibliotecarios = BibliotecarioControle.listarTodosBibliotecarios();
                populaTabelaBibliotecario(this.listarTodosBibliotecarios);

                JOptionPane.showMessageDialog(null, "Bibliotecario Removido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um bibliotecario");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ArrayList<Bibliotecario> filtrado = new ArrayList<Bibliotecario>();

        for (Bibliotecario bibliotecario : listarTodosBibliotecarios) {
            if (bibliotecario.getNome().toUpperCase().contains(txtNome.getText().toUpperCase())) {
                filtrado.add(bibliotecario);
            }
        }

        populaTabelaBibliotecario(filtrado);
    }//GEN-LAST:event_btnBuscarActionPerformed

public void populaTabelaBibliotecario(List<Bibliotecario> listar) {
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel) tblBibliotecario.getModel();
        //Limpar a tabela
        while(modeloDeColunasDaTabela.getRowCount() != 0) {
            modeloDeColunasDaTabela.removeRow(0);
        }
        for (int i = 0; i < listar.size(); i++) {
            Bibliotecario mostrarBibliotecarios = listar.get(i);
            Object[] dadosLinha = new Object[2];
            dadosLinha[0] = mostrarBibliotecarios.getPessoaId();
            dadosLinha[1] = mostrarBibliotecarios.getNome();
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
            java.util.logging.Logger.getLogger(CadastrosBibliotecaUI.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrosBibliotecaUI.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrosBibliotecaUI.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrosBibliotecaUI.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrosBibliotecaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelInferior;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JTable tblBibliotecario;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}
