/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Lucas
 */
public class TelaDesenvolvedores extends javax.swing.JFrame {

    /**
     * Creates new form TelaDesenvolvedores
     */
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
    public TelaDesenvolvedores() {
        redimensionarTela();
        initComponents();
        super.setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_sair = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("DESENVOLVEDORES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(620, 120, 570, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Rafael Pellizzaro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1200, 460, 340, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Gustavo Lohmann");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 210, 340, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Lucas Simon");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1210, 210, 340, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/face.PNG"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 510, 70, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/face.PNG"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 260, 70, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Insta.PNG"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1190, 590, 70, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Insta.PNG"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 340, 70, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/face.PNG"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1180, 260, 70, 60);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("lucas.h.simon");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1260, 330, 160, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Rafael Pellizzaro");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1270, 520, 170, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("Gustavo Lohmann");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(240, 260, 170, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("gustavo_lohmann");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(240, 340, 180, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("Lucas Simon");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(1260, 260, 150, 30);

        btn_sair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair);
        btn_sair.setBounds(730, 740, 470, 60);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jLabel15.setText("Jonathan Hartmann");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(210, 460, 250, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/face.PNG"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1190, 520, 70, 60);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Insta.PNG"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(1180, 330, 70, 70);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 0));
        jLabel19.setText("rafaelpellizzaro");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(1270, 590, 150, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("Jonathan Hartmann");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(240, 510, 210, 30);

        btn_voltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltar);
        btn_voltar.setBounds(530, 740, 200, 60);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/agroherd logo (1).png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(630, -10, 480, 180);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/vaca.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1740, 1000);

        setSize(new java.awt.Dimension(1626, 945));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDesenvolvedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDesenvolvedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDesenvolvedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDesenvolvedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDesenvolvedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
