/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Suenlie
 */
public class DEFEATED extends javax.swing.JFrame {

    /**
     * Creates new form DEFEATED
     */
    int slpe;
    String name;
    
    private Clip musicClip;
    
    Connection con; //variable for databse connection
    Statement st; //variable for the sql
    ArrayList<Players> players = new ArrayList<>(); //arraylist for the table
    
    public DEFEATED(){
        initComponents();
    }
    int stage;
    int slp = 0;
    String lose = "C:\\Users\\Suenlie\\Downloads\\Axie Infinity- Defeat Sound Effect.wav";
    public DEFEATED(String name, int slp,int stage) {
        initComponents();
        musicClip = PlayMusic(lose);
        this.stage = stage;
        this.name = name;
        this.slp = slp;
        returnbtn.setBackground(new java.awt.Color(0,0,0,0));
    }
    
    public void update(String name, int stage, int slp){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wakbalo", "root", "");
            String sql = "UPDATE `userprof` SET slp ='" + slp + "',stage='"+stage+"' WHERE name ='" + name + "'";
            st = con.createStatement();
            st.execute(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(YouWin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(YouWin.class.getName()).log(Level.SEVERE, null, ex);
        }
        fetch();
    }
    
    public void fetch(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wakbalo", "root", "");
            String sql = "select * from userprof";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Players user = new Players(rs.getString("name"), rs.getInt("stage"), rs.getInt("slp")); //Calling the Students class
                players.add(user);
            }
            for ( Players user : players) { //
                Object[] row = new Object[3];
                row[0] = user.getName();
                row[1] = user.getStage();
                row[2] = user.getSlp();
            }
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
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

        returnbtn = new javax.swing.JButton();
        LBLBEAST2 = new javax.swing.JLabel();
        LBLBEAST1 = new javax.swing.JLabel();
        LBLBEAST = new javax.swing.JLabel();
        DEFEATEDBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        LBLBEAST2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/reptile-ezgif.com-resize.gif"))); // NOI18N
        getContentPane().add(LBLBEAST2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, 110));

        LBLBEAST1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/aquafinels.gif"))); // NOI18N
        getContentPane().add(LBLBEAST1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 170, 130));

        LBLBEAST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/beastfinal (1).gif"))); // NOI18N
        getContentPane().add(LBLBEAST, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 170, 110));

        DEFEATEDBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/backgrounds/DEFEATED.png"))); // NOI18N
        getContentPane().add(DEFEATEDBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
        // TODO add your handling code here:
        slp -= 25;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wakbalo", "root", "");
            String sql = "select * from userprof where name='" + name + "'";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()==true){
                update(name,stage,slp);
                fetch();
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(YouWin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(YouWin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (musicClip != null && musicClip.isRunning()) {
            musicClip.stop(); // Pause the music
        }
        new Dashboard(name,slp,stage).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnbtnActionPerformed
    
    
    public static Clip PlayMusic(String location) {
        try {
            File musicPath = new File(location);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                return clip; // Return the Clip object
            } else {
                System.out.println("Can't find file");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
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
            java.util.logging.Logger.getLogger(DEFEATED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEFEATED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEFEATED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEFEATED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEFEATED().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DEFEATEDBG;
    private javax.swing.JLabel LBLBEAST;
    private javax.swing.JLabel LBLBEAST1;
    private javax.swing.JLabel LBLBEAST2;
    private javax.swing.JButton returnbtn;
    // End of variables declaration//GEN-END:variables
}
