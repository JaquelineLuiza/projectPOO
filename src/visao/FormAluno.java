/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import modeloConection.ConexaoBD;
import modeloDao.DaoAluno;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.UnsupportedLookAndFeelException;
import modeloBeans.BeansAluno;
import modeloBeans.BeansTabela;

/**
 *
 * @author TI-MANUTENÇÃO
 */
public class FormAluno extends javax.swing.JFrame {

    BeansAluno mod = new BeansAluno();
    DaoAluno control = new DaoAluno();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;

    public FormAluno() {
        initComponents();
        preencherTable("select *from aluno ORDER BY NOME");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();
        jLabelNome = new javax.swing.JLabel();
        jLabelRA = new javax.swing.JLabel();
        jLabelCurso = new javax.swing.JLabel();
        jLabelTurma = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldRA = new javax.swing.JTextField();
        jTextFieldCurso = new javax.swing.JTextField();
        jComboBoxTurma = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonpesquisar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelCadAluno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(730, 620));

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAluno);

        jLabelNome.setText("Nome:");

        jLabelRA.setText("RA:");

        jLabelCurso.setText("Curso:");

        jLabelTurma.setText("Turma:");

        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldRA.setEnabled(false);

        jTextFieldCurso.setEnabled(false);

        jComboBoxTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1° ano", "2° ano", "3° ano", " " }));
        jComboBoxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmaActionPerformed(evt);
            }
        });

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

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jLabelEmail.setText("Email:");

        jTextFieldEmail.setEnabled(false);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelID.setText("ID:");

        jTextFieldID.setEnabled(false);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelID)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelRA)
                            .addComponent(jLabelTurma)
                            .addComponent(jLabelCurso))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(jTextFieldRA)
                            .addComponent(jTextFieldCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(jComboBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 218, Short.MAX_VALUE)
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisa)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonpesquisar))
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTurma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCurso)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonpesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 730, 610);

        jLabelCadAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCadAluno.setText("Cadastro de Alunos");
        getContentPane().add(jLabelCadAluno);
        jLabelCadAluno.setBounds(310, 0, 140, 20);

        setSize(new java.awt.Dimension(766, 685));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jComboBoxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTurmaActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        flag = 1;
        jTextFieldNome.setEnabled(true);
        jTextFieldRA.setEnabled(true);
        jComboBoxTurma.setEnabled(true);
        jTextFieldCurso.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldRA.setText("");
        jComboBoxTurma.setSelectedItem(null);
        jTextFieldCurso.setText("");
        jTextFieldEmail.setText("");

        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false);
        jButtonpesquisar.setEnabled(false);
        preencherTable("select *from aluno ORDER BY NOME");


    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome para prosseguir");
            jTextFieldNome.requestFocus();
        } else if (jTextFieldRA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o ra para prosseguir");
            jTextFieldRA.requestFocus();
        } else if (jTextFieldCurso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o curso para prosseguir");
            jTextFieldCurso.requestFocus();
        } else if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o email para prosseguir");
            jTextFieldEmail.requestFocus();
        } else if (flag == 1) {

            mod.setNome(jTextFieldNome.getText());
            mod.setRa(jTextFieldRA.getText());
            mod.setTurma((String) jComboBoxTurma.getSelectedItem());
            mod.setCurso(jTextFieldCurso.getText());
            mod.setEmail(jTextFieldEmail.getText());
            try {
                control.salvar(mod);
            } catch (Exception ex) {
                Logger.getLogger(FormAluno.class.getName()).log(Level.SEVERE, null, ex);
            }

            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jTextFieldRA.setText("");
            jComboBoxTurma.setSelectedItem(null);
            jTextFieldCurso.setText("");
            jTextFieldEmail.setText("");

            jTextFieldNome.setEnabled(false);
            jTextFieldRA.setEnabled(false);
            jComboBoxTurma.setEnabled(false);
            jTextFieldCurso.setEnabled(false);
            jTextFieldEmail.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            preencherTable("select *from aluno ORDER BY NOME");

        } else {
            mod.setIdaluno(Integer.parseInt(jTextFieldID.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setRa(jTextFieldRA.getText());
            mod.setTurma((String) jComboBoxTurma.getSelectedItem());
            mod.setCurso(jTextFieldCurso.getText());
            mod.setEmail(jTextFieldEmail.getText());
            control.EditarAluno(mod);

            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jTextFieldRA.setText("");
            jComboBoxTurma.setSelectedItem(null);
            jTextFieldCurso.setText("");
            jTextFieldEmail.setText("");

            jTextFieldNome.setEnabled(false);
            jTextFieldRA.setEnabled(false);
            jComboBoxTurma.setEnabled(false);
            jTextFieldCurso.setEnabled(false);
            jTextFieldEmail.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            preencherTable("select *from aluno ORDER BY NOME");

        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpesquisarActionPerformed
        // TODO add your handling code here:
        mod.setPesquisa(jTextFieldPesquisa.getText());
        BeansAluno model = control.buscaAluno(mod);

        jTextFieldID.setText(String.valueOf(model.getIdaluno()));
        jTextFieldNome.setText(model.getNome());
        jTextFieldRA.setText(model.getRa());
        jComboBoxTurma.setSelectedItem(model.getTurma());
        jTextFieldCurso.setText(model.getCurso());
        jTextFieldEmail.setText(model.getEmail());
        jTextFieldPesquisa.setText("");
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldRA.setText("");
        jComboBoxTurma.setSelectedItem(null);
        jTextFieldCurso.setText("");
        jTextFieldEmail.setText("");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        preencherTable("select * from aluno where nome like'%" + mod.getPesquisa() + "%' order by nome");

    }//GEN-LAST:event_jButtonpesquisarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setEnabled(!true);
        jTextFieldRA.setEnabled(!true);
        jComboBoxTurma.setEnabled(!true);
        jTextFieldCurso.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldID.setText("");
        jTextFieldNome.setText("");
        jTextFieldRA.setText("");
        jComboBoxTurma.setSelectedItem(null);
        jTextFieldCurso.setText("");
        jTextFieldEmail.setText("");

        jTextFieldPesquisa.setEnabled(true);
        jButtonpesquisar.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        flag = 2;
        jTextFieldNome.setEnabled(true);
        jTextFieldRA.setEnabled(true);
        jComboBoxTurma.setEnabled(true);
        jTextFieldCurso.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextFieldNome.setText("");
        jTextFieldRA.setText("");
        jComboBoxTurma.setSelectedItem(null);
        jTextFieldCurso.setText("");
        jTextFieldEmail.setText("");
        preencherTable("select *from aluno ORDER BY NOME");


    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setIdaluno(Integer.parseInt(jTextFieldID.getText()));
            control.ExcluirAluno(mod);
            jButtonExcluir.setEnabled(false);
            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jTextFieldRA.setText("");
            jComboBoxTurma.setSelectedItem(null);
            jTextFieldCurso.setText("");
            jTextFieldEmail.setText("");

            jTextFieldNome.setEnabled(false);
            jTextFieldRA.setEnabled(false);
            jComboBoxTurma.setEnabled(false);
            jTextFieldCurso.setEnabled(false);
            jTextFieldEmail.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            preencherTable("select *from aluno ORDER BY NOME");

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunoMouseClicked
        // TODO add your handling code here:
        String nome = "" + jTableAluno.getValueAt(jTableAluno.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSQL("select *from aluno where nome ='" + nome + "'");
        try {
            conex.rs.first();
            jTextFieldID.setText(String.valueOf(conex.rs.getInt("idaluno")));
            jTextFieldNome.setText(conex.rs.getString("nome"));
            jTextFieldRA.setText(conex.rs.getString("ra"));
            jComboBoxTurma.setSelectedItem(conex.rs.getString("turma"));
            jTextFieldCurso.setText(conex.rs.getString("curso"));
            jTextFieldEmail.setText(conex.rs.getString("email"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados");
        }
        conex.desconecta();
        jTextFieldNome.setEnabled(false);
        jTextFieldRA.setEnabled(false);
        jComboBoxTurma.setEnabled(false);
        jTextFieldCurso.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);

    }//GEN-LAST:event_jTableAlunoMouseClicked

    /**
     * @param args the command line arguments
     */
    public void preencherTable(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "NOME", "RA", "TURMA", "CURSO", "EMAIL"};
        conex.conexao();
        conex.executaSQL(sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("idaluno"), conex.rs.getString("nome"), conex.rs.getString("ra"),
                    conex.rs.getString("turma"), conex.rs.getString("curso"), conex.rs.getString("email")});
            } while (conex.rs.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o preenchimento");
        }
        BeansTabela modelo = new BeansTabela(dados, colunas);
        jTableAluno.setModel(modelo);
        jTableAluno.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTableAluno.getColumnModel().getColumn(0).setResizable(false);
        jTableAluno.getColumnModel().getColumn(1).setPreferredWidth(180);
        jTableAluno.getColumnModel().getColumn(1).setResizable(false);
        jTableAluno.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableAluno.getColumnModel().getColumn(2).setResizable(false);
        jTableAluno.getColumnModel().getColumn(3).setPreferredWidth(60);
        jTableAluno.getColumnModel().getColumn(3).setResizable(false);
        jTableAluno.getColumnModel().getColumn(4).setPreferredWidth(320);
        jTableAluno.getColumnModel().getColumn(4).setResizable(false);
        jTableAluno.getColumnModel().getColumn(5).setPreferredWidth(200);
        jTableAluno.getColumnModel().getColumn(5).setResizable(false);
        jTableAluno.getTableHeader().setReorderingAllowed(false);
        jTableAluno.setAutoResizeMode(jTableAluno.AUTO_RESIZE_OFF);
        jTableAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(FormAluno.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluno().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxTurma;
    private javax.swing.JLabel jLabelCadAluno;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRA;
    private javax.swing.JLabel jLabelTurma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldRA;
    // End of variables declaration//GEN-END:variables
}
