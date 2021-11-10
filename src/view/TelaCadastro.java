/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.AnimalDAO;
import java.awt.Dimension;
import static java.awt.SystemColor.desktop;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Animal;

public class TelaCadastro extends javax.swing.JFrame {
public TelaCadastro() {
        redimensionarTela();
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(true);
        
    }
private void redimensionarTela() {

    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension tamTela = kit.getScreenSize();
    //Pegando a largura total da tela
    int larg = tamTela.width;
    //Pegando a altura total da tela
    int alt = tamTela.height;
    /*Se você quiser que o seu JFrame ocupe 70% da tela por exemplo 
    multiplique a largura e altura totais por 0,7*/

    //Mandando o JFrame utilizar suas dimensões
    this.setSize(alt, larg);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sair = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_proddiaria = new javax.swing.JTextField();
        btn_voltar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        txt_peso = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_analisecad = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        getContentPane().setLayout(null);

        btn_sair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair);
        btn_sair.setBounds(630, 760, 470, 50);

        jLabel12.setText("*");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1090, 310, 34, 14);

        txt_proddiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_proddiariaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_proddiaria);
        txt_proddiaria.setBounds(450, 310, 650, 40);

        btn_voltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltar);
        btn_voltar.setBounds(450, 760, 180, 50);

        btn_cadastrar.setBackground(new java.awt.Color(0, 153, 153));
        btn_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_cadastrar.setText("CADASTRAR");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastrar);
        btn_cadastrar.setBounds(450, 650, 650, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Produção diária");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 280, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("  Número do animal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(660, 40, 210, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Data de nascimento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(670, 120, 240, 30);

        jLabel4.setText("*");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1090, 70, 34, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Peso");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(750, 200, 50, 30);

        jLabel5.setText("*");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1090, 310, 34, 14);

        jLabel11.setText("*");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1090, 230, 34, 14);

        jLabel6.setText("*");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1030, 150, 34, 14);

        txt_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numeroActionPerformed(evt);
            }
        });
        getContentPane().add(txt_numero);
        txt_numero.setBounds(450, 70, 650, 40);
        getContentPane().add(txt_peso);
        txt_peso.setBounds(450, 230, 650, 40);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(450, 150, 650, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Observações ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(710, 360, 140, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 390, 650, 96);

        btn_analisecad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_analisecad.setText("Analisar Dados");
        btn_analisecad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_analisecadActionPerformed(evt);
            }
        });
        getContentPane().add(btn_analisecad);
        btn_analisecad.setBounds(450, 720, 650, 30);

        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("*CAMPOS OBRIGATÓRIOS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1030, 10, 180, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/agroherd logo (1).png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, -10, 560, 170);

        lbl_fundo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_fundo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/vaca.jpg"))); // NOI18N
        lbl_fundo.setMaximumSize(new java.awt.Dimension(1024, 768));
        lbl_fundo.setMinimumSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(lbl_fundo);
        lbl_fundo.setBounds(-10, 0, 1680, 930);

        setSize(new java.awt.Dimension(1372, 929));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numeroActionPerformed

    private void txt_proddiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_proddiariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_proddiariaActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        Animal a = new Animal();
        AnimalDAO adao = new AnimalDAO();

        a.setCod_animal(Integer.parseInt(txt_numero.getText().trim()));
        a.setDatanascimento_animal(jDateChooser1.getDate());
        a.setPeso_animal(Float.parseFloat(txt_peso.getText()));
        a.setProddia_animal(Float.parseFloat(txt_proddiaria.getText()));
        a.setStatus_animal("Vivo");
        float mensal, prodd;
        prodd = Float.parseFloat(txt_proddiaria.getText());
        mensal = (prodd*30);
        a.setProdmes_animal(mensal);
        float prod;
        prod = Float.parseFloat(txt_proddiaria.getText());
        if (prod >= 30) {
            a.setClasse_animal("A");
        } else if ((prod < 30) && (prod >= 25)) {
            a.setClasse_animal("B");
        } else if (prod < 25) {
            a.setClasse_animal("C");
        } else if (txt_proddiaria.getText() == "") {
            JOptionPane.showMessageDialog(null, "Manter sem produção diária?");
        }
        a.setObservacoes_animal(jTextArea1.getText());
        adao.save(a);
LimparCampos();

    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_analisecadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_analisecadActionPerformed
        TelaAnalise tela = new TelaAnalise();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_analisecadActionPerformed
public void LimparCampos(){

        txt_peso.setText("  ");
        txt_numero.setText("  ");
        txt_proddiaria.setText("  ");
        jDateChooser1.cleanup();

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_analisecad;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_voltar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_proddiaria;
    // End of variables declaration//GEN-END:variables
}
