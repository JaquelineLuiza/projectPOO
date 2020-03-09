/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;
import modeloDao.DaoPessoa;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class TelaLogin extends javax.swing.JFrame {

    DaoPessoa control = new DaoPessoa();

    ConexaoBD con = new ConexaoBD();

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        con.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(469, 100, 180, 30);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(410, 160, 50, 14);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuário:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(410, 110, 60, 14);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        jButtonAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAcessarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(470, 200, 80, 23);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jButtonSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonSairKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(580, 200, 51, 23);
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(471, 150, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 360, 160);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planodeFundoCentro.jpg"))); // NOI18N
        jLabelFundoLogin.setPreferredSize(new java.awt.Dimension(670, 330));
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 2, 670, 410);

        setSize(new java.awt.Dimension(686, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        // TODO add your handling code here:
        con.executaSQL("select * from pessoa where login='" + jTextFieldUsuario.getText() + "' and senha ='" + jPasswordFieldSenha.getText() + "'");
        try {
            con.rs.first();
            if (con.rs.getString("tipo").equals("Administrador")) {
                TelaPrincipal tela = new TelaPrincipal(jTextFieldUsuario.getText());
                tela.setVisible(true);
                dispose();
            } else if(con.rs.getString("tipo").equals("Avaliador")){
                FormPrincipalAvaliador telaAvalicao = new FormPrincipalAvaliador(jTextFieldUsuario.getText());
                telaAvalicao.setVisible(true);
                dispose();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos");
        }


    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonAcessarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAcessarKeyPressed
        // TODO add your handling code here:
        con.executaSQL("select * from pessoa where login='" + jTextFieldUsuario.getText() + "'and senha ='" + jPasswordFieldSenha.getText() + "'");
        try {
            con.rs.first();
            if (con.rs.getString("tipo").equals("Administrador")) {
                TelaPrincipal tela = new TelaPrincipal(jTextFieldUsuario.getText());
                tela.setVisible(true);
                dispose();
            } else if(con.rs.getString("tipo").equals("Avaliador")){
                FormPrincipalAvaliador telaAvalicao = new FormPrincipalAvaliador(jTextFieldUsuario.getText());
                telaAvalicao.setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos");
        }
    }//GEN-LAST:event_jButtonAcessarKeyPressed

    private void jButtonSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSairKeyPressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSairKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

}
