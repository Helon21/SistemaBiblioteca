package br.edu.ifpr.paranavai.armarios.visao;

import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.controle.EstudanteControle;
import javax.swing.JOptionPane;

public class FormAlunosCadastroUI extends javax.swing.JFrame {

    private Estudante estudante;

    public FormAlunosCadastroUI() {
        initComponents(); 
        this.estudante = new Estudante();
    }

    public FormAlunosCadastroUI(int codigo) {
        initComponents();
        this.estudante = EstudanteControle.buscarPorId(codigo);
        panelFormularioAlunos.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Estudante " + this.estudante.getPessoaId()));
        lblAluno.setText(this.estudante.getNome());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelFormularioAlunos = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        lblAluno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRA = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setText("Nome:");

        lblEmail.setText("E-mail:");

        lblTelefone.setText("Telefone:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        lblSenha.setText("Senha:");

        lblAluno.setText("Aluno");

        jLabel1.setText("RA:");

        txtRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormularioAlunosLayout = new javax.swing.GroupLayout(panelFormularioAlunos);
        panelFormularioAlunos.setLayout(panelFormularioAlunosLayout);
        panelFormularioAlunosLayout.setHorizontalGroup(
            panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAluno)
                    .addGroup(panelFormularioAlunosLayout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefone)
                            .addGroup(panelFormularioAlunosLayout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(btnCancelar))))
                    .addGroup(panelFormularioAlunosLayout.createSequentialGroup()
                        .addComponent(lblSenha)
                        .addGap(18, 18, 18)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelFormularioAlunosLayout.createSequentialGroup()
                            .addComponent(lblEmail)
                            .addGap(18, 18, 18)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormularioAlunosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRA, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormularioAlunosLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        panelFormularioAlunosLayout.setVerticalGroup(
            panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioAlunosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addGap(26, 26, 26)
                .addGroup(panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelFormularioAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(25, 25, 25))
        );

        getContentPane().add(panelFormularioAlunos, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (this.estudante.getPessoaId() == null) {
            try {
                this.estudante.setRa(txtRA.getText());
                this.estudante.setNome(txtNome.getText());
                this.estudante.setEmail(txtEmail.getText());
                String senha = String.copyValueOf(txtSenha.getPassword());
                this.estudante.setSenha(senha);
                this.estudante.setTelefone(txtTelefone.getText());

                this.estudante = EstudanteControle.inserir(this.estudante);

                JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Algo de Errado Aconteceu!!!");
                e.printStackTrace();
            }

        } else {
            try {
                this.estudante.setRa(txtRA.getText());
                this.estudante.setNome(txtNome.getText());
                this.estudante.setEmail(txtEmail.getText());
                String senha = String.copyValueOf(txtSenha.getPassword());
                this.estudante.setSenha(senha);
                this.estudante.setTelefone(txtTelefone.getText());
                
                this.estudante = EstudanteControle.atualizar(this.estudante);
                JOptionPane.showMessageDialog(this, "Alterações salvas com Sucesso!!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Algo de Errado Aconteceu!!!");
                e.printStackTrace();
            }
        }
        CadastrosAlunosUI cadastros = new CadastrosAlunosUI();
        this.setVisible(false);
        cadastros.setLocationRelativeTo(null);
        cadastros.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        CadastrosAlunosUI cadastros = new CadastrosAlunosUI();
        this.setVisible(false);
        cadastros.setLocationRelativeTo(null);
        cadastros.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRAActionPerformed

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
            java.util.logging.Logger.getLogger(FormAlunosCadastroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlunosCadastroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlunosCadastroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlunosCadastroUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlunosCadastroUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAluno;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel panelFormularioAlunos;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRA;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
