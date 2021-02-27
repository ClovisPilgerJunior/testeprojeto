/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Júnior
 */
import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.DTDConstants;
import jdk.nashorn.internal.runtime.JSType;

public class PesquisaCurso extends javax.swing.JFrame {

    public ResultSet rs;
    Connection conn;
    
    
    /**
     * Creates new form PesquisaCurso
     */
    public PesquisaCurso() {
        initComponents();
    }

    public void PesquisaCurso(String paramBusca){
        
        String SQLPesquisa = "SELECT * FROM curso" + paramBusca;
        Statement stmt;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db = "jdbc:mysql://localhost/minhadb";
            String user = "root";
            String password = "root";
            conn = DriverManager.getConnection(db, user, password);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(SQLPesquisa);
            DefaultTableModel model = (DefaultTableModel) tblPesquisa.getModel();
            model.setNumRows(0);
            
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("Sigla"),
                    rs.getString("Nome"),
                    rs.getString("Descricao")
                });
                
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNmCurso = new javax.swing.JTextField();
        lblNmCurso = new javax.swing.JLabel();
        bntPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisa = new javax.swing.JTable();
        txtSigla = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);

        lblNmCurso.setText("Nome do Curso");

        bntPesquisar.setText("Pesquisar");
        bntPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarActionPerformed(evt);
            }
        });

        tblPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sigla", "Nome", "Descricao"
            }
        ));
        tblPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPesquisa);

        txtSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiglaActionPerformed(evt);
            }
        });

        jLabel1.setText("Sigla");

        jLabel2.setText("Nome");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jLabel3.setText("Descrição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(lblNmCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtNmCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(bntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)
                        .addComponent(txtSigla, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblNmCurso)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNmCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(524, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        // TODO add your handling code here:
        String SQLText = "";
         if(txtNmCurso.getText() != null) {
            SQLText = " WHERE upper(nome) like '"
                    + txtNmCurso.getText() + "%'";
        } else if (txtNmCurso.getText() == null){
          
              JOptionPane.showMessageDialog(null, "teste");
          
        
        }
        PesquisaCurso(SQLText);
    }//GEN-LAST:event_bntPesquisarActionPerformed

    private void txtSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiglaActionPerformed

    private void tblPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesquisaMouseClicked
        // TODO add your handling code here:
        int row = tblPesquisa.getSelectedRow();
        txtSigla.setText(tblPesquisa.getValueAt(row, 0).toString());
        txtNome.setText(tblPesquisa.getValueAt(row, 1).toString());
        txtDescricao.setText(tblPesquisa.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblPesquisaMouseClicked

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
            java.util.logging.Logger.getLogger(PesquisaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNmCurso;
    private javax.swing.JTable tblPesquisa;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNmCurso;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
