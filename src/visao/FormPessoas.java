/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloConection.ConexaoBD;
import modeloDao.DaoPessoa;
import modeloBeans.BeansPessoa;
import modeloBeans.BeansTabela;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class FormPessoas extends javax.swing.JFrame {

    BeansPessoa mod = new BeansPessoa();
    DaoPessoa control = new DaoPessoa();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;

    public FormPessoas() {
        initComponents();
        preencherTable("select *from pessoa ORDER BY NOME");

    }

    private BeansPessoa logar() {
        String login = jTextFieldLogin.getText();
        String senha = new String(jPasswordFieldSenha.getPassword());

        String senhaCriptografada = this.criptografa(senha);
        System.out.println("Senha normal: " + senha);
        System.out.println("Senha criptografada: " + senhaCriptografada);

        BeansPessoa usuario = new BeansPessoa();
        usuario.setLogin(login);
        usuario.setSenha(senhaCriptografada);
        return control.buscaPessoa(usuario);
    }

    private String criptografa(String original) {
        String senha = null;
        try {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(original.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            senha = hexString.toString();

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
        return senha;
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
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSIAPE = new javax.swing.JTextField();
        jLabelSiape = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoa = new javax.swing.JTable();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelTipo = new javax.swing.JLabel();
        jLabelCadPessoa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonNovo.setText("Novo");
        jButtonNovo.setMaximumSize(new java.awt.Dimension(75, 23));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(75, 23));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(60, 23));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(60, 23));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldSIAPE.setEnabled(false);

        jLabelSiape.setText("SIAPE:");

        jLabelLogin.setText("Login:");

        jTextFieldLogin.setEnabled(false);

        jLabelSenha.setText("Senha:");

        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });

        jButtonpesquisar.setText("Pesquisar");
        jButtonpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpesquisarActionPerformed(evt);
            }
        });

        jTablePessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePessoa);

        jTextFieldID.setEnabled(false);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabelID.setText("ID:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Avaliador", "Orientador", "Coorientador" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jLabelTipo.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelID)
                            .addComponent(jLabelSiape)
                            .addComponent(jLabelLogin)
                            .addComponent(jLabelSenha)
                            .addComponent(jLabelTipo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldSIAPE)
                            .addComponent(jTextFieldLogin)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonpesquisar)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jButtonEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldSIAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSiape))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelLogin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSenha))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTipo))
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonpesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 730, 620);

        jLabelCadPessoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCadPessoa.setText("Cadastro de Pessoas");
        getContentPane().add(jLabelCadPessoa);
        jLabelCadPessoa.setBounds(250, 0, 180, 17);

        setSize(new java.awt.Dimension(766, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jTextFieldSIAPE.setEnabled(true);
        jComboBoxTipo.setSelectedItem(true);
        jTextFieldLogin.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);

        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldSIAPE.setText("");
        jComboBoxTipo.setSelectedItem("");
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");

        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false);
        jButtonpesquisar.setEnabled(false);
        preencherTable("select *from pessoa ORDER BY NOME");

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome para prosseguir");
            jTextFieldNome.requestFocus();
        } else if (jTextFieldSIAPE.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o siape para prosseguir");
            jTextFieldSIAPE.requestFocus();
        } else if (jTextFieldLogin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o login para prosseguir");
            jTextFieldLogin.requestFocus();
        } else if (jPasswordFieldSenha.getPassword() == null) {
            JOptionPane.showMessageDialog(null, "Preencha a senha para prosseguir");
            jPasswordFieldSenha.requestFocus();

        } else if (flag == 1) {
            mod.setNome(jTextFieldNome.getText());
            mod.setSiape(jTextFieldSIAPE.getText());
            mod.setTipo((String) jComboBoxTipo.getSelectedItem());
            mod.setLogin(jTextFieldLogin.getText());
            String senha = new String(jPasswordFieldSenha.getPassword());
            String senhaCriptografada = this.criptografa(senha);
            mod.setSenha(senhaCriptografada);

            control.salvar(mod);
            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jTextFieldSIAPE.setText("");
            jComboBoxTipo.setSelectedItem("");
            jTextFieldLogin.setText("");
            jPasswordFieldSenha.setText("");

            jTextFieldNome.setEnabled(false);
            jTextFieldSIAPE.setEnabled(false);
            jComboBoxTipo.setSelectedItem(false);
            jTextFieldLogin.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            preencherTable("select *from pessoa ORDER BY NOME");

        } else {
            mod.setIdPessoa(Integer.parseInt(jTextFieldID.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setSiape(jTextFieldSIAPE.getText());
            mod.setTipo((String) jComboBoxTipo.getSelectedItem());
            mod.setLogin(jTextFieldLogin.getText());
            mod.setSenha(jPasswordFieldSenha.getText());
            control.EditarPessoa(mod);

            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jTextFieldSIAPE.setText("");
            jComboBoxTipo.setSelectedItem("");
            jTextFieldLogin.setText("");
            jPasswordFieldSenha.setText("");

            jTextFieldNome.setEnabled(false);
            jTextFieldSIAPE.setEnabled(false);
            jComboBoxTipo.setSelectedItem(false);
            jTextFieldLogin.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            preencherTable("select *from pessoa ORDER BY NOME");

        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpesquisarActionPerformed
        // TODO add your handling code here:
        mod.setPesquisa(jTextFieldPesquisa.getText());
        BeansPessoa model = control.buscaPessoa(mod);

        jTextFieldID.setText(String.valueOf(model.getIdPessoa()));
        jTextFieldNome.setText(model.getNome());
        jTextFieldSIAPE.setText(model.getSiape());
        jComboBoxTipo.setSelectedItem(model.getTipo());
        jTextFieldLogin.setText(model.getLogin());
        jPasswordFieldSenha.setText(model.getSenha());

        jTextFieldPesquisa.setText("");
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldSIAPE.setText("");
        jComboBoxTipo.setSelectedItem("");
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");

        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        preencherTable("select * from pessoa where nome like'%" + mod.getPesquisa() + "%' order by nome");
    }//GEN-LAST:event_jButtonpesquisarActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setEnabled(!true);
        jTextFieldSIAPE.setEnabled(!true);
        jComboBoxTipo.setSelectedItem(!true);
        jTextFieldLogin.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldSIAPE.setText("");
        jComboBoxTipo.setSelectedItem("");
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");

        jTextFieldPesquisa.setEnabled(true);
        jButtonpesquisar.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jTextFieldSIAPE.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jTextFieldLogin.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldNome.setText("");
        jTextFieldSIAPE.setText("");
        jComboBoxTipo.setSelectedItem("");
        jTextFieldLogin.setText("");
        jPasswordFieldSenha.setText("");
        preencherTable("select *from pessoa ORDER BY NOME");

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setIdPessoa(Integer.parseInt(jTextFieldID.getText()));
            control.ExcluirPessoa(mod);
            jButtonExcluir.setEnabled(false);
            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jTextFieldSIAPE.setText("");
            jComboBoxTipo.setSelectedItem("");
            jTextFieldLogin.setText("");
            jPasswordFieldSenha.setText("");

            jTextFieldNome.setEnabled(false);
            jTextFieldSIAPE.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            jTextFieldLogin.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);

            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            preencherTable("select *from pessoa ORDER BY NOME");

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTablePessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoaMouseClicked
        // TODO add your handling code here:
        String nome = "" + jTablePessoa.getValueAt(jTablePessoa.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSQL("select *from pessoa where nome ='" + nome + "'");
        try {
            conex.rs.first();
            jTextFieldID.setText(String.valueOf(conex.rs.getInt("idpessoa")));
            jTextFieldNome.setText(conex.rs.getString("nome"));
            jComboBoxTipo.setSelectedItem(conex.rs.getString("tipo"));
            jTextFieldSIAPE.setText(conex.rs.getString("siape"));
            jTextFieldLogin.setText(conex.rs.getString("login"));
            jPasswordFieldSenha.setText(conex.rs.getString("senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados");
        }
        conex.desconecta();
        jTextFieldNome.setEnabled(false);
        jTextFieldSIAPE.setEnabled(false);
        jComboBoxTipo.setSelectedItem(false);
        jTextFieldLogin.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTablePessoaMouseClicked

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public void preencherTable(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "NOME", "SIAPE", "TIPO", "LOGIN", "SENHA"};
        conex.conexao();
        conex.executaSQL(sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("idpessoa"), conex.rs.getString("nome"), conex.rs.getString("siape"),
                    conex.rs.getString("tipo"), conex.rs.getString("login"), conex.rs.getString("senha")});
            } while (conex.rs.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o preenchimento");
        }
        BeansTabela modelo = new BeansTabela(dados, colunas);
        jTablePessoa.setModel(modelo);
        jTablePessoa.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTablePessoa.getColumnModel().getColumn(0).setResizable(false);
        jTablePessoa.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTablePessoa.getColumnModel().getColumn(1).setResizable(false);
        jTablePessoa.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTablePessoa.getColumnModel().getColumn(2).setResizable(false);
        jTablePessoa.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTablePessoa.getColumnModel().getColumn(3).setResizable(false);
        jTablePessoa.getColumnModel().getColumn(4).setPreferredWidth(200);
        jTablePessoa.getColumnModel().getColumn(4).setResizable(false);
        jTablePessoa.getColumnModel().getColumn(5).setPreferredWidth(123);
        jTablePessoa.getColumnModel().getColumn(5).setResizable(false);
        jTablePessoa.getTableHeader().setReorderingAllowed(false);
        jTablePessoa.setAutoResizeMode(jTablePessoa.AUTO_RESIZE_OFF);
        jTablePessoa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        conex.desconecta();
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
            java.util.logging.Logger.getLogger(FormPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPessoas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonpesquisar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelCadPessoa;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSiape;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePessoa;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldSIAPE;
    // End of variables declaration//GEN-END:variables
}
