package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.controle.EstudanteControle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrosAlunosUI extends javax.swing.JFrame {

    List<Estudante> listarTodosEstudantes;

    public CadastrosAlunosUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarTodosEstudantes = EstudanteControle.listarTodasEstudantes();
        populaTabelaEstudante(listarTodosEstudantes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(67, Short.MAX_VALUE)
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addComponent(btnBuscar))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnDeletar)
                    .addComponent(btnVoltar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "RA", "Nome", "E-mail", "Senha", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        FormAlunosCadastroUI form = new FormAlunosCadastroUI();
        this.setVisible(false);
        form.setLocationRelativeTo(this);
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblAlunos.getSelectedRow() >= 0) {
            int dadosLinha = tblAlunos.getSelectedRow();
            int codigo = (int) tblAlunos.getModel().getValueAt(dadosLinha, 0);
            FormAlunosCadastroUI form = new FormAlunosCadastroUI(codigo);
            this.setVisible(false);
            form.setLocationRelativeTo(this);
            form.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um bibliotecario!");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (tblAlunos.getSelectedRow() >= 0) {
            int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do Estudante?",
                    "Excluir Estudante", JOptionPane.YES_NO_OPTION);
            if (resposta == 0) {
                int dadosLinha = tblAlunos.getSelectedRow();
                int codigo = (int) tblAlunos.getModel().getValueAt(dadosLinha, 0);

                for (Estudante estudante : this.listarTodosEstudantes) {
                    if (estudante.getPessoaId() == codigo) {
                        EstudanteControle.excluir(estudante);
                    }
                }
                this.listarTodosEstudantes = EstudanteControle.listarTodasEstudantes();
                populaTabelaEstudante(this.listarTodosEstudantes);

                JOptionPane.showMessageDialog(null, "Estudante Removido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Estudante!");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ArrayList<Estudante> filtrado = new ArrayList<Estudante>();
        
        for(Estudante estudante : listarTodosEstudantes){
            if(estudante.getNome().toUpperCase().contains(txtNome.getText().toUpperCase())){
                filtrado.add(estudante);
            }
        }

        populaTabelaEstudante(filtrado);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaBibliotecarioUI telaBibliotecario = new TelaBibliotecarioUI();
        this.setVisible(false);
        telaBibliotecario.setLocationRelativeTo(this);
        telaBibliotecario.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void populaTabelaEstudante(List<Estudante> listar) {
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel) tblAlunos.getModel();
        //Limpar a tabela
        while (modeloDeColunasDaTabela.getRowCount() != 0) {
            modeloDeColunasDaTabela.removeRow(0);
        }
        for (int i = 0; i < listar.size(); i++) {
            Estudante mostrarEstudantes = listar.get(i);
            Object[] dadosLinha = new Object[6];
            dadosLinha[0] = mostrarEstudantes.getPessoaId();
            dadosLinha[1] = mostrarEstudantes.getRa();
            dadosLinha[2] = mostrarEstudantes.getNome();
            dadosLinha[3] = mostrarEstudantes.getEmail();
            dadosLinha[4] = mostrarEstudantes.getSenha();
            dadosLinha[5] = mostrarEstudantes.getTelefone();
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
            java.util.logging.Logger.getLogger(CadastrosAlunosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrosAlunosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrosAlunosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrosAlunosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrosAlunosUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}
