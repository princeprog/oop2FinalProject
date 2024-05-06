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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Suenlie
 */
public class YouWin extends javax.swing.JFrame {

    /**
     * Creates new form YouWin
     */
    private Clip musicClip;
    int slp;
    String name;
    String filepath = "C:\\Users\\Suenlie\\Downloads\\Queen - We are the champions (Chorus only) (1).wav";
    
    Connection con; //variable for databse connection
    Statement st; //variable for the sql
    ArrayList<Players> players = new ArrayList<>(); //arraylist for the table
    
    public YouWin(){
        initComponents();
    }
    int stage;
    public YouWin(String name,int slp,int stage) {
        initComponents();
        returnbtn.setBackground(new java.awt.Color(0,0,0,0));
        this.slp = slp;
        this.stage = stage;
        this.name = name;
        musicClip = PlayMusic(filepath);
        
        
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

        beast = new javax.swing.JLabel();
        reptile1 = new javax.swing.JLabel();
        aqua1 = new javax.swing.JLabel();
        returnbtn = new javax.swing.JButton();
        youwinbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        beast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/beastfinal (1).gif"))); // NOI18N
        getContentPane().add(beast, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 170, 110));

        reptile1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/reptile-ezgif.com-resize.gif"))); // NOI18N
        getContentPane().add(reptile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 130, 90));

        aqua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/aquafinels.gif"))); // NOI18N
        getContentPane().add(aqua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 170, 140));

        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        youwinbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/backgrounds/VICTORY (3).gif"))); // NOI18N
        getContentPane().add(youwinbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
        // TODO add your handling code here:
        slp += 50;
        
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
                musicClip.stop();
            }
        Dashboard obj = new Dashboard(name,slp,stage);
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnbtnActionPerformed

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
            java.util.logging.Logger.getLogger(YouWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YouWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YouWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YouWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YouWin().setVisible(true);
            }
        });
    }
    
    public static Clip PlayMusic(String location) {
        try {
            File musicPath = new File(location);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(5);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aqua1;
    private javax.swing.JLabel beast;
    private javax.swing.JLabel reptile1;
    private javax.swing.JButton returnbtn;
    private javax.swing.JLabel youwinbg;
    // End of variables declaration//GEN-END:variables
}
