/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

/**
 *
 * @author Suenlie
 */
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Dashboard extends javax.swing.JFrame {


    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
    }
    
    public Dashboard(String name){
        initComponents();
        txtDisplayName.setText(name);
        btnAdventure.setBackground(new java.awt.Color(0,0,0,0));
        btnArena.setBackground(new java.awt.Color(0,0,0,0));
        btnTournament.setBackground(new java.awt.Color(0,0,0,0));
        btnLeaderboard.setBackground(new java.awt.Color(0,0,0,0));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplayName = new javax.swing.JLabel();
        btnAdventure = new javax.swing.JButton();
        btnArena = new javax.swing.JButton();
        btnTournament = new javax.swing.JButton();
        btnLeaderboard = new javax.swing.JButton();
        lblPlant = new javax.swing.JLabel();
        lblBeast = new javax.swing.JLabel();
        lblBird = new javax.swing.JLabel();
        dashboardBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDisplayName.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        txtDisplayName.setForeground(new java.awt.Color(255, 255, 255));
        txtDisplayName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtDisplayName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 120));

        btnAdventure.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnAdventure, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 200, 90));

        btnArena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArenaActionPerformed(evt);
            }
        });
        getContentPane().add(btnArena, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 200, 90));

        btnTournament.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTournament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTournamentActionPerformed(evt);
            }
        });
        getContentPane().add(btnTournament, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 200, 90));

        btnLeaderboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLeaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaderboardActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeaderboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 200, 90));

        lblPlant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/plant (1).png"))); // NOI18N
        getContentPane().add(lblPlant, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 190, 110));

        lblBeast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/beast (1).png"))); // NOI18N
        getContentPane().add(lblBeast, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 190, 110));

        lblBird.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/bird (1).png"))); // NOI18N
        getContentPane().add(lblBird, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 190, 110));

        dashboardBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/dashboardbg.png"))); // NOI18N
        getContentPane().add(dashboardBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArenaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Available Soon!", "Soon!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnArenaActionPerformed

    private void btnTournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTournamentActionPerformed
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(null, "Available Soon!", "Soon!", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnTournamentActionPerformed

    private void btnLeaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaderboardActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Available Soon!", "Soon!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnLeaderboardActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        String filepath = "C:\\Users\\Suenlie\\Downloads\\axiemusic.wav";
        PlayMusic(filepath);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    
    public static void PlayMusic(String location) {
        try {
            File musicPath = new File(location);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                System.out.println("Can't find file");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdventure;
    private javax.swing.JButton btnArena;
    private javax.swing.JButton btnLeaderboard;
    private javax.swing.JButton btnTournament;
    private javax.swing.JLabel dashboardBackground;
    private javax.swing.JLabel lblBeast;
    private javax.swing.JLabel lblBird;
    private javax.swing.JLabel lblPlant;
    public javax.swing.JLabel txtDisplayName;
    // End of variables declaration//GEN-END:variables
}