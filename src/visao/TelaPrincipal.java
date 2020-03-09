/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();

    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jLabelRelatorio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadAluno = new javax.swing.JButton();
        jButtonCadEvento = new javax.swing.JButton();
        jButtonCadPessoa1 = new javax.swing.JButton();
        jButtonCadTrabalho = new javax.swing.JButton();
        jButtonCadVinculacao = new javax.swing.JButton();
        jButtonRelat = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadEvento = new javax.swing.JMenuItem();
        jMenuItemCadAluno = new javax.swing.JMenuItem();
        jMenuItemCadPessoa = new javax.swing.JMenuItem();
        jMenuItemCadTrabalho = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuRealatorio = new javax.swing.JMenu();
        jMenuItemRelatLiderEmail = new javax.swing.JMenuItem();
        jMenuferramenta = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jLabelRelatorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRelatorio.setText("Relatórios");
        jPanelInternal.add(jLabelRelatorio);
        jLabelRelatorio.setBounds(0, 110, 60, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastros");
        jPanelInternal.add(jLabel2);
        jLabel2.setBounds(0, 0, 60, 14);

        jButtonCadAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/student.png"))); // NOI18N
        jButtonCadAluno.setToolTipText("Cadastro de Alunos");
        jButtonCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAlunoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadAluno);
        jButtonCadAluno.setBounds(80, 20, 70, 70);

        jButtonCadEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calendar.png"))); // NOI18N
        jButtonCadEvento.setToolTipText("Cadastro de Eventos");
        jButtonCadEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadEventoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadEvento);
        jButtonCadEvento.setBounds(0, 20, 70, 70);

        jButtonCadPessoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/network.png"))); // NOI18N
        jButtonCadPessoa1.setToolTipText("Cadastro de Pessoas");
        jButtonCadPessoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPessoa1ActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadPessoa1);
        jButtonCadPessoa1.setBounds(160, 20, 70, 70);

        jButtonCadTrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reunion.png"))); // NOI18N
        jButtonCadTrabalho.setToolTipText("Cadastro de Trabalho");
        jButtonCadTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadTrabalhoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadTrabalho);
        jButtonCadTrabalho.setBounds(240, 20, 70, 70);

        jButtonCadVinculacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/boss.png"))); // NOI18N
        jButtonCadVinculacao.setToolTipText("Cadastro de Vinculações");
        jButtonCadVinculacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadVinculacaoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadVinculacao);
        jButtonCadVinculacao.setBounds(320, 20, 70, 70);

        jButtonRelat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clipboard.png"))); // NOI18N
        jButtonRelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonRelat);
        jButtonRelat.setBounds(0, 130, 70, 70);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plano.jpg"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, 0, 620, 280);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 28, 630, 270);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de ");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 250, 22);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/error.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar tela");
        jButtonFecharBemVindo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFecharBemVindoMouseClicked(evt);
            }
        });
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(590, 0, 20, 20);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(140, 100, 630, 330);
        getContentPane().add(label);
        label.setBounds(0, 0, 870, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuário:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 470, 50, 14);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(60, 470, 310, 14);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planodeFundoPricipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 870, 540);

        jMenuBar1.setBackground(new java.awt.Color(204, 102, 255));

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadEvento.setText("Eventos");
        jMenuItemCadEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadEventoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadEvento);

        jMenuItemCadAluno.setText("Alunos");
        jMenuItemCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAlunoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadAluno);

        jMenuItemCadPessoa.setText("Pessoas");
        jMenuItemCadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPessoaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadPessoa);

        jMenuItemCadTrabalho.setText("Trabalhos");
        jMenuItemCadTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadTrabalhoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadTrabalho);

        jMenuItem1.setText("Vinculação");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem1);

        jMenuBar1.add(jMenuCadastro);

        jMenuRealatorio.setText("Relatórios");
        jMenuRealatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRealatorioActionPerformed(evt);
            }
        });

        jMenuItemRelatLiderEmail.setText("Aluno Lider");
        jMenuItemRelatLiderEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatLiderEmailActionPerformed(evt);
            }
        });
        jMenuRealatorio.add(jMenuItemRelatLiderEmail);

        jMenuBar1.add(jMenuRealatorio);

        jMenuferramenta.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuferramenta.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuferramenta);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(891, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAlunoActionPerformed
        // TODO add your handling code here:
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Administrador")) {
                FormAluno telaAluno = new FormAluno();
                telaAluno.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }

    }//GEN-LAST:event_jButtonCadAlunoActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jButtonFecharBemVindoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoMouseClicked
        // TODO add your handling code here:
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoMouseClicked

    private void jButtonCadPessoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPessoa1ActionPerformed
        // TODO add your handling code here:
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Administrador")) {
                FormPessoas telaPessoas = new FormPessoas();
                telaPessoas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }

    }//GEN-LAST:event_jButtonCadPessoa1ActionPerformed

    private void jButtonCadEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadEventoActionPerformed
        // TODO add your handling code here:
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Administrador")) {
                FormEvento telaEvento = new FormEvento();
                telaEvento.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }

    }//GEN-LAST:event_jButtonCadEventoActionPerformed

    private void jMenuItemCadEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadEventoActionPerformed
        // TODO add your handling code here:
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Administrador")) {
                FormEvento telaEvento = new FormEvento();
                telaEvento.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }
    }//GEN-LAST:event_jMenuItemCadEventoActionPerformed

    private void jMenuItemCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAlunoActionPerformed
        // TODO add your handling code here:
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Administrador")) {
                FormAluno telaAluno = new FormAluno();
                telaAluno.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }
    }//GEN-LAST:event_jMenuItemCadAlunoActionPerformed

    private void jMenuItemCadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPessoaActionPerformed
        // TODO add your handling code here:
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Administrador")) {
                FormPessoas telaPessoas = new FormPessoas();
                telaPessoas.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }
    }//GEN-LAST:event_jMenuItemCadPessoaActionPerformed

    private void jMenuItemCadTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadTrabalhoActionPerformed
        // TODO add your handling code here:
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Administrador")) {
                FormTrabalho telaTrabalhos = new FormTrabalho();
                telaTrabalhos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }
    }//GEN-LAST:event_jMenuItemCadTrabalhoActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        // TODO add your handling code here:
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jButtonCadTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadTrabalhoActionPerformed
        // TODO add your handling code here:
        try {
            conecta.executaSQL("select *from pessoa where login='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("tipo").equals("Administrador")) {
                FormTrabalho telaTrabalhos = new FormTrabalho();
                telaTrabalhos.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário sem permisão para essa funcionalidade \n Contate o administrador do sistema" + ex);
        }
    }//GEN-LAST:event_jButtonCadTrabalhoActionPerformed

    private void jMenuRealatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRealatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuRealatorioActionPerformed

    private void jMenuItemRelatLiderEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatLiderEmailActionPerformed
        // TODO add your handling code here:
         FormRelatorio telaRelat = new FormRelatorio();
        telaRelat.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelatLiderEmailActionPerformed

    private void jButtonRelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatActionPerformed
        // TODO add your handling code here:
        FormRelatorio telaRelat = new FormRelatorio();
        telaRelat.setVisible(true);
    }//GEN-LAST:event_jButtonRelatActionPerformed

    private void jButtonCadVinculacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadVinculacaoActionPerformed
        // TODO add your handling code here:
        FormAvaliadorTrabalho telaVinculacao = new FormAvaliadorTrabalho();
        telaVinculacao.setVisible(true);
    }//GEN-LAST:event_jButtonCadVinculacaoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         FormAvaliadorTrabalho telaVinculacao = new FormAvaliadorTrabalho();
        telaVinculacao.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadAluno;
    private javax.swing.JButton jButtonCadEvento;
    private javax.swing.JButton jButtonCadPessoa1;
    private javax.swing.JButton jButtonCadTrabalho;
    private javax.swing.JButton jButtonCadVinculacao;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JButton jButtonRelat;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelRelatorio;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadAluno;
    private javax.swing.JMenuItem jMenuItemCadEvento;
    private javax.swing.JMenuItem jMenuItemCadPessoa;
    private javax.swing.JMenuItem jMenuItemCadTrabalho;
    private javax.swing.JMenuItem jMenuItemRelatLiderEmail;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuRealatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuferramenta;
    private javax.swing.JPanel jPanelInternal;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
