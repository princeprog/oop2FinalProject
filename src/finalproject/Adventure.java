/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;
import javax.swing.*;
import static finalproject.Dashboard.PlayMusic;
import java.awt.Color;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JProgressBar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suenlie
 */
public class Adventure extends javax.swing.JFrame {

    /**
     * Creates new form Adventure
     */
    
    int countRound=1;
    int energy = 3;
    String filepath = "C:\\Users\\Suenlie\\Downloads\\Axie Infinity - Arena Theme Song.wav";
    String stopslice = "C:\\Users\\Suenlie\\Documents\\Bgmusics\\slicesound.wav";
    
    Reptile reptile = new Reptile(480);
    Beast beast = new Beast(480);
    Aqua aqua = new Aqua(480);
    Enemy enemy1 = new Enemy(580);
    Enemy enemy2 = new Enemy(780);
    Enemy enemy = new Enemy(980);
    
    int reptilehealth = reptile.getHealthPoints();
    int aquahealth = aqua.getHealthPoints();
    int beasthealth = beast.getHealthPoints();
    int enemyHealth1 = enemy1.getHealthPoints();
    int enemyHealth2 = enemy2.getHealthPoints();
    int enemyHealth3 = enemy.getHealthPoints();
    int stage = 1;
    
    private Clip musicClip;
    
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    int m = 0;
    int holder1;
    int holder2;
    int holder3;
    int holder4;
    int holder5;
    int holder6;
    int holder7;
    int holder8;
    int holder9;
    int holder10;
    int holder11;
    int holder12;
    
    String name;
    
    public Adventure(){
        initComponents();
        stageChecker();
        this.name = name;
        this.slp = slp;
        musicClip = PlayMusic(filepath);
        lbldead.setVisible(false);
        randomgeneratecards();
        aliveChecker();
        roundCounter.setText("Round "+countRound);
        energyCounter.setText(""+energy+"/10");
        lblbeasthp.setText("Beast: "+beasthealth);
        lblaquahp.setText("Aqua: "+aquahealth);
        lblreptilehp.setText("Reptile: "+reptilehealth);
        
        reptilebtn1.setBackground(new java.awt.Color(0,0,0,0));
        reptilebtn2.setBackground(new java.awt.Color(0,0,0,0));
        reptilebtn3.setBackground(new java.awt.Color(0,0,0,0));
        reptilebtn4.setBackground(new java.awt.Color(0,0,0,0));
        
        beastbtn1.setBackground(new java.awt.Color(0,0,0,0));
        beastbtn2.setBackground(new java.awt.Color(0,0,0,0));
        beastbtn3.setBackground(new java.awt.Color(0,0,0,0));
        beastbtn4.setBackground(new java.awt.Color(0,0,0,0));
        
        aquabtn1.setBackground(new java.awt.Color(0,0,0,0));
        aquabtn2.setBackground(new java.awt.Color(0,0,0,0));
        aquabtn3.setBackground(new java.awt.Color(0,0,0,0));
        aquabtn4.setBackground(new java.awt.Color(0,0,0,0));
        
        btnEndturn.setBackground(new java.awt.Color(0,0,0,0));
        
        lblreptilecard1.setVisible(false);
        lblreptilecard2.setVisible(false);
        lblreptilecard3.setVisible(false);
        lblreptilecard4.setVisible(false);
        
        lblaquacard1.setVisible(false);
        lblaquacard2.setVisible(false);
        lblaquacard3.setVisible(false);
        lblaquacard4.setVisible(false);
        
        lblbeastcard1.setVisible(false);
        lblbeastcard2.setVisible(false);
        lblbeastcard3.setVisible(false);
        lblbeastcard4.setVisible(false);
    }
    int slp =0;
    public Adventure(String name, int slp,int stage){
        initComponents();
        this.stage = stage;
        stageChecker();
        this.name = name;
        this.slp = slp;
        musicClip = PlayMusic(filepath);
        lbldead.setVisible(false);
        randomgeneratecards();
        aliveChecker();
        roundCounter.setText("Round "+countRound);
        energyCounter.setText(""+energy+"/10");
        lblbeasthp.setText("Beast: "+beasthealth);
        lblaquahp.setText("Aqua: "+aquahealth);
        lblreptilehp.setText("Reptile: "+reptilehealth);
        
        reptilebtn1.setBackground(new java.awt.Color(0,0,0,0));
        reptilebtn2.setBackground(new java.awt.Color(0,0,0,0));
        reptilebtn3.setBackground(new java.awt.Color(0,0,0,0));
        reptilebtn4.setBackground(new java.awt.Color(0,0,0,0));
        
        beastbtn1.setBackground(new java.awt.Color(0,0,0,0));
        beastbtn2.setBackground(new java.awt.Color(0,0,0,0));
        beastbtn3.setBackground(new java.awt.Color(0,0,0,0));
        beastbtn4.setBackground(new java.awt.Color(0,0,0,0));
        
        aquabtn1.setBackground(new java.awt.Color(0,0,0,0));
        aquabtn2.setBackground(new java.awt.Color(0,0,0,0));
        aquabtn3.setBackground(new java.awt.Color(0,0,0,0));
        aquabtn4.setBackground(new java.awt.Color(0,0,0,0));
        
        btnEndturn.setBackground(new java.awt.Color(0,0,0,0));
        
        lblreptilecard1.setVisible(false);
        lblreptilecard2.setVisible(false);
        lblreptilecard3.setVisible(false);
        lblreptilecard4.setVisible(false);
        
        lblaquacard1.setVisible(false);
        lblaquacard2.setVisible(false);
        lblaquacard3.setVisible(false);
        lblaquacard4.setVisible(false);
        
        lblbeastcard1.setVisible(false);
        lblbeastcard2.setVisible(false);
        lblbeastcard3.setVisible(false);
        lblbeastcard4.setVisible(false);
        
    }
    
    public void stageChecker(){
        if(stage == 1){
            lblenemy1.setVisible(true);
            lblenemy2.setVisible(false);
            lblenemy3.setVisible(false);
            lblenemyhp.setText("Enemy: "+enemyHealth1);
        }else if(stage == 2){
            lblenemy1.setVisible(false);
            lblenemy2.setVisible(true);
            lblenemy3.setVisible(false);
            lblenemyhp.setText("Enemy: "+enemyHealth2);
        }else if(stage == 3){
            lblenemy1.setVisible(false);
            lblenemy2.setVisible(false);
            lblenemy3.setVisible(true);
            lblenemyhp.setText("Enemy: "+enemyHealth3);
        }
    }
    
    
    public void crossout(){
        if(a == 0){
            cross1.setVisible(true);
            reptilebtn1.setEnabled(false);
        }
        
        if(b == 0){
            cross2.setVisible(true);
            reptilebtn2.setEnabled(false);
        }
        
        if(c == 0){
            cross3.setVisible(true);
            reptilebtn3.setEnabled(false);
        }
        
        if(d == 0){
            cross4.setVisible(true);
            reptilebtn4.setEnabled(false);
        }
        
        if(e == 0){
            cross5.setVisible(true);
            aquabtn1.setEnabled(false);
        }
        
        if(f == 0){
            cross6.setVisible(true);
            aquabtn2.setEnabled(false);
        }
        
        if(g == 0){
            cross7.setVisible(true);
            aquabtn3.setEnabled(false);
        }
        
        if(h == 0){
            cross8.setVisible(true);
            aquabtn4.setEnabled(false);
        }
        
        if(j == 0){
            cross9.setVisible(true);
            beastbtn1.setEnabled(false);
        }
        
        if(k == 0){
            cross10.setVisible(true);
            beastbtn1.setEnabled(false);
        }
        
        if(l == 0){
            cross11.setVisible(true);
            beastbtn1.setEnabled(false);
        }
        
        if(m == 0){
            cross12.setVisible(true);
            beastbtn1.setEnabled(false);
        }
        
    }
    
    public void removecrossout(){
        if(a == 0){
            cross1.setVisible(false);
            reptilebtn1.setEnabled(true);
        }
        
        if(b == 0){
            cross2.setVisible(false);
            reptilebtn2.setEnabled(true);
        }
        
        if(c == 0){
            cross3.setVisible(false);
            reptilebtn3.setEnabled(true);
        }
        
        if(d == 0){
            cross4.setVisible(false);
            reptilebtn4.setEnabled(true);
        }
        
        if(e == 0){
            cross5.setVisible(false);
            aquabtn1.setEnabled(true);
        }
        
        if(f == 0){
            cross6.setVisible(false);
            aquabtn2.setEnabled(true);
        }
        
        if(g == 0){
            cross7.setVisible(false);
            aquabtn3.setEnabled(true);
        }
        
        if(h == 0){
            cross8.setVisible(false);
            aquabtn4.setEnabled(true);
        }
        
        if(j == 0){
            cross9.setVisible(false);
            beastbtn1.setEnabled(true);
        }
        
        if(k == 0){
            cross10.setVisible(false);
            beastbtn1.setEnabled(true);
        }
        
        if(l == 0){
            cross11.setVisible(false);
            beastbtn1.setEnabled(true);
        }
        
        if(m == 0){
            cross12.setVisible(false);
            beastbtn1.setEnabled(true);
        }
        
    }
    
    public void randomgeneratecards(){
        Random rand = new Random();
        int i = 1;
        while(i <= 12){
            switch(i){
                case 1:
                    holder1 = rand.nextInt(2);
                    if(holder1 == 1){
                        cross1.setVisible(false);
                        
                    }else{
                        holder1 = rand.nextInt(2);
                        if(holder1 == 1){
                            cross1.setVisible(false);
                            
                        }else{
                            cross1.setVisible(true);
                            reptilebtn1.setEnabled(false);
                        }
                    }
                    break;
                case 2:
                    holder2 = rand.nextInt(2);
                    if(holder2 == 1){
                        cross2.setVisible(false);
                        
                    }else{
                        holder2 = rand.nextInt(2);
                        if(holder2 == 1){
                            cross2.setVisible(false);
                            
                        }else{
                            cross2.setVisible(true);
                            reptilebtn2.setEnabled(false);
                        }
                    }
                    break;
                case 3:
                    holder3 = rand.nextInt(2);
                    if(holder3 == 1){
                        cross3.setVisible(false);
                        
                    }else{
                        holder3 = rand.nextInt(2);
                        if(holder3 == 1){
                            cross3.setVisible(false);
                            
                        }else{
                            cross3.setVisible(true);
                            reptilebtn3.setEnabled(false);
                        }
                    }
                    break;
                case 4:
                    holder4 = rand.nextInt(2);
                    if(holder4 == 1){
                        cross4.setVisible(false);
                        
                    }else{
                        holder4 = rand.nextInt(2);
                        if(holder4 == 1){
                            cross4.setVisible(false);
                            
                        }else{
                            cross4.setVisible(true);
                            reptilebtn4.setEnabled(false);
                        }
                    }
                    break;
                case 5:
                    holder5 = rand.nextInt(2);
                    if(holder5 == 1){
                        cross5.setVisible(false);
                        
                    }else{
                        holder5 = rand.nextInt(2);
                        if(holder5 == 1){
                            cross5.setVisible(false);
                            
                        }else{
                            cross5.setVisible(true);
                            aquabtn1.setEnabled(false);
                        }
                    }
                    break;
                case 6:
                    holder6 = rand.nextInt(2);
                    if(holder6 == 1){
                        cross6.setVisible(false);
                        
                    }else{
                        holder6 = rand.nextInt(2);
                        if(holder6 == 1){
                            cross6.setVisible(false);
                            
                        }else{
                            cross6.setVisible(true);
                            aquabtn2.setEnabled(false);
                        }
                    }
                    break;
                case 7:
                    holder7 = rand.nextInt(2);
                    if(holder7 == 1){
                        cross7.setVisible(false);
                        
                    }else{
                        holder7 = rand.nextInt(2);
                        if(holder7 == 1){
                            cross7.setVisible(false);
                            
                        }else{
                            cross7.setVisible(true);
                            aquabtn3.setEnabled(false);
                        }
                    }
                    break;
                case 8:
                    holder8 = rand.nextInt(2);
                    if(holder8 == 1){
                        cross8.setVisible(false);
                        
                    }else{
                        holder8 = rand.nextInt(2);
                        if(holder8 == 1){
                            cross8.setVisible(false);
                            
                        }else{
                            cross8.setVisible(true);
                            aquabtn4.setEnabled(false);
                        }
                    }
                    break;
                case 9:
                    holder9 = rand.nextInt(2);
                    if(holder9 == 1){
                        cross9.setVisible(false);
                        
                    }else{
                        holder9 = rand.nextInt(2);
                        if(holder9 == 1){
                            cross9.setVisible(false);
                            
                        }else{
                            cross9.setVisible(true);
                            beastbtn1.setEnabled(false);
                        }
                    }
                    break;
                case 10:
                    holder10 = rand.nextInt(2);
                    if(holder10 == 1){
                        cross10.setVisible(false);
                        
                    }else{
                        holder10 = rand.nextInt(2);
                        if(holder10 == 1){
                            cross10.setVisible(false);
                            
                        }else{
                            cross10.setVisible(true);
                            beastbtn2.setEnabled(false);
                        }
                    }
                    break;
                case 11:
                    holder11 = rand.nextInt(2);
                    if(holder11 == 1){
                        cross11.setVisible(false);
                        
                    }else{
                        holder11 = rand.nextInt(2);
                        if(holder11 == 1){
                            cross11.setVisible(false);
                            
                        }else{
                            cross11.setVisible(true);
                            beastbtn3.setEnabled(false);
                        }
                    }
                    break;
                case 12:
                    holder12 = rand.nextInt(2);
                    if(holder12 == 1){
                        cross12.setVisible(false);
                        
                    }else{
                        holder12 = rand.nextInt(2);
                        if(holder12 == 1){
                            cross12.setVisible(false);
                            
                        }else{
                            cross12.setVisible(true);
                            beastbtn4.setEnabled(false);
                        }
                    }
                    break;
                default:
                    break;
            }
            
            i++;
        }
        
    }
    
    public void beastghost(){
           lblbeast.setVisible(false);
            beastdead.setVisible(true);
            beastbtn1.setEnabled(false);
            cross9.setVisible(true);
            beastbtn2.setEnabled(false);
            cross10.setVisible(true);
            beastbtn3.setEnabled(false);
            cross11.setVisible(true);
            beastbtn4.setEnabled(false);
            cross12.setVisible(true);
    }
    
    public void aquaghost(){
            lblaqua.setVisible(false);
            aquadead.setVisible(true);
            aquabtn1.setEnabled(false);
            cross5.setVisible(true);
            aquabtn2.setEnabled(false);
            cross6.setVisible(true);
            aquabtn3.setEnabled(false);
            cross7.setVisible(true);
            aquabtn4.setEnabled(false);
            cross8.setVisible(true);
    }
    
    public void reptileghost(){
            lblreptile.setVisible(false);
            reptiledead.setVisible(true);
            reptilebtn1.setEnabled(false);
            cross1.setVisible(true);
            reptilebtn2.setEnabled(false);
            cross2.setVisible(true);
            reptilebtn3.setEnabled(false);
            cross3.setVisible(true);
            reptilebtn4.setEnabled(false);
            cross4.setVisible(true);
    }
    
    public void aliveChecker(){
        beastdead.setVisible(false);
        aquadead.setVisible(false);
        reptiledead.setVisible(false);
        if(!beast.isAlive() && aqua.isAlive() && reptile.isAlive()){
            beastghost();
        }
        else if(!aqua.isAlive() && !beast.isAlive() && reptile.isAlive()){
            aquaghost();
            beastghost();
        }
        else if(!reptile.isAlive() && !aqua.isAlive() && !beast.isAlive()){
            if (musicClip != null && musicClip.isRunning()) {
                musicClip.stop();
            }
            slp-=25;
            reptileghost();
            aquaghost();
            beastghost();
            new DEFEATED(name,slp,stage).setVisible(true);
            this.setVisible(false);
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

        reptiledead = new javax.swing.JLabel();
        aquadead = new javax.swing.JLabel();
        beastdead = new javax.swing.JLabel();
        lbldead = new javax.swing.JLabel();
        roundCounter = new javax.swing.JLabel();
        energyCounter = new javax.swing.JLabel();
        lblenemy3 = new javax.swing.JLabel();
        lblenemy2 = new javax.swing.JLabel();
        lblreptile = new javax.swing.JLabel();
        lblaqua = new javax.swing.JLabel();
        lblbeast = new javax.swing.JLabel();
        lblenemy1 = new javax.swing.JLabel();
        cross1 = new javax.swing.JLabel();
        cross2 = new javax.swing.JLabel();
        cross3 = new javax.swing.JLabel();
        cross4 = new javax.swing.JLabel();
        cross5 = new javax.swing.JLabel();
        cross6 = new javax.swing.JLabel();
        cross7 = new javax.swing.JLabel();
        cross8 = new javax.swing.JLabel();
        cross9 = new javax.swing.JLabel();
        cross10 = new javax.swing.JLabel();
        cross11 = new javax.swing.JLabel();
        cross12 = new javax.swing.JLabel();
        beastbtn4 = new javax.swing.JButton();
        beastbtn3 = new javax.swing.JButton();
        beastbtn2 = new javax.swing.JButton();
        beastbtn1 = new javax.swing.JButton();
        aquabtn4 = new javax.swing.JButton();
        aquabtn3 = new javax.swing.JButton();
        aquabtn2 = new javax.swing.JButton();
        aquabtn1 = new javax.swing.JButton();
        reptilebtn4 = new javax.swing.JButton();
        reptilebtn3 = new javax.swing.JButton();
        reptilebtn2 = new javax.swing.JButton();
        reptilebtn1 = new javax.swing.JButton();
        lblbeastcard4 = new javax.swing.JLabel();
        lblbeastcard3 = new javax.swing.JLabel();
        lblbeastcard2 = new javax.swing.JLabel();
        lblbeastcard1 = new javax.swing.JLabel();
        lblaquacard4 = new javax.swing.JLabel();
        lblaquacard3 = new javax.swing.JLabel();
        lblaquacard2 = new javax.swing.JLabel();
        lblaquacard1 = new javax.swing.JLabel();
        lblreptilecard4 = new javax.swing.JLabel();
        lblreptilecard3 = new javax.swing.JLabel();
        lblreptilecard2 = new javax.swing.JLabel();
        lblreptilecard1 = new javax.swing.JLabel();
        btnEndturn = new javax.swing.JButton();
        reptileHealthBar = new javax.swing.JProgressBar();
        aquaHealthBar = new javax.swing.JProgressBar();
        beastHealthBar = new javax.swing.JProgressBar();
        enemyHealthBar = new javax.swing.JProgressBar();
        lblenemyhp = new javax.swing.JLabel();
        lblbeasthp = new javax.swing.JLabel();
        lblaquahp = new javax.swing.JLabel();
        lblreptilehp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reptiledead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/kimi-yip-ghost-sx-ezgif.com-reverse (1).gif"))); // NOI18N
        getContentPane().add(reptiledead, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 180, 180));

        aquadead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/kimi-yip-ghost-sx-ezgif.com-reverse (1).gif"))); // NOI18N
        getContentPane().add(aquadead, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 180, 180));

        beastdead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/kimi-yip-ghost-sx-ezgif.com-reverse (1).gif"))); // NOI18N
        getContentPane().add(beastdead, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 180, 180));

        lbldead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/kimi-yip-ghost-sx-ezgif.com-reverse.gif"))); // NOI18N
        getContentPane().add(lbldead, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 190, 170));

        roundCounter.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        roundCounter.setForeground(new java.awt.Color(255, 255, 255));
        roundCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(roundCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 460, 40));

        energyCounter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        energyCounter.setForeground(new java.awt.Color(255, 255, 255));
        energyCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        energyCounter.setText("3/10");
        getContentPane().add(energyCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 30));

        lblenemy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/enemy3.png"))); // NOI18N
        getContentPane().add(lblenemy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 250, 190));

        lblenemy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/enemy2 (1).png"))); // NOI18N
        getContentPane().add(lblenemy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 250, 190));

        lblreptile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/reptile-ezgif.com-resize.gif"))); // NOI18N
        getContentPane().add(lblreptile, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, 110));

        lblaqua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/aquafinels.gif"))); // NOI18N
        getContentPane().add(lblaqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 180, 130));

        lblbeast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/beastfinal (1).gif"))); // NOI18N
        getContentPane().add(lblbeast, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 190, 140));

        lblenemy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/enemyfinal.png"))); // NOI18N
        getContentPane().add(lblenemy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 190, 170));

        cross1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 60, 60));

        cross2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 60, 60));

        cross3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 60, 60));

        cross4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 60, 60));

        cross5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 60, 60));

        cross6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 60, 60));

        cross7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 60, 60));

        cross8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 60, 60));

        cross9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 60, 60));

        cross10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 60, 60));

        cross11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 60, 60));

        cross12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/crossed-removebg-preview (2).png"))); // NOI18N
        getContentPane().add(cross12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 60, 60));

        beastbtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        beastbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beastbtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(beastbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 60, 80));

        beastbtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        beastbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beastbtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(beastbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 60, 80));

        beastbtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        beastbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beastbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(beastbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 60, 80));

        beastbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        beastbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beastbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(beastbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 60, 80));

        aquabtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aquabtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquabtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(aquabtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 60, 80));

        aquabtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aquabtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquabtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(aquabtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 60, 80));

        aquabtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aquabtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquabtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(aquabtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 60, 80));

        aquabtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aquabtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquabtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(aquabtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 60, 80));

        reptilebtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reptilebtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reptilebtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(reptilebtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 60, 80));

        reptilebtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reptilebtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reptilebtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(reptilebtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 60, 80));

        reptilebtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reptilebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reptilebtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(reptilebtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 60, 80));

        reptilebtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reptilebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reptilebtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(reptilebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 60, 80));

        lblbeastcard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/singlecombat-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblbeastcard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 70, -1));

        lblbeastcard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/nutcrack-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblbeastcard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 70, -1));

        lblbeastcard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/nutthrow-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblbeastcard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 70, -1));

        lblbeastcard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/ivory-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblbeastcard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 70, -1));

        lblaquacard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/spinal-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblaquacard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 70, -1));

        lblaquacard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/upstream-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblaquacard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 70, -1));

        lblaquacard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/swift-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblaquacard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 70, -1));

        lblaquacard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/risky-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblaquacard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 70, -1));

        lblreptilecard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/disarm-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblreptilecard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 70, -1));

        lblreptilecard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/kotaro-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblreptilecard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 70, -1));

        lblreptilecard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/bulkwark-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblreptilecard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 70, -1));

        lblreptilecard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/cards/invasion-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblreptilecard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 70, -1));

        btnEndturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnEndturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 110, 40));

        reptileHealthBar.setMaximum(480);
        reptileHealthBar.setValue(480);
        getContentPane().add(reptileHealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 140, 10));

        aquaHealthBar.setMaximum(480);
        aquaHealthBar.setValue(480);
        getContentPane().add(aquaHealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 140, 10));

        beastHealthBar.setMaximum(480);
        beastHealthBar.setValue(480);
        getContentPane().add(beastHealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 140, 10));

        enemyHealthBar.setMaximum(580);
        enemyHealthBar.setValue(580);
        getContentPane().add(enemyHealthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 110, 10));

        lblenemyhp.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        lblenemyhp.setForeground(new java.awt.Color(119, 20, 20));
        lblenemyhp.setText("Enemy");
        getContentPane().add(lblenemyhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, -1));

        lblbeasthp.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        lblbeasthp.setForeground(new java.awt.Color(255, 102, 0));
        lblbeasthp.setText("Beast");
        getContentPane().add(lblbeasthp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        lblaquahp.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        lblaquahp.setForeground(new java.awt.Color(0, 0, 51));
        lblaquahp.setText("Aqua");
        getContentPane().add(lblaquahp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        lblreptilehp.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        lblreptilehp.setForeground(new java.awt.Color(153, 0, 153));
        lblreptilehp.setText("Reptile");
        getContentPane().add(lblreptilehp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/images/backgrounds/adventurebgfinal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reptilebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reptilebtn1ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy == 0){
            crossout();
        }else{
            a = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblreptilecard1.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_reptilebtn1ActionPerformed

    private void reptilebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reptilebtn2ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy == 0){
            crossout();
        }else{
            b = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblreptilecard2.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_reptilebtn2ActionPerformed

    private void reptilebtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reptilebtn3ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            c = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblreptilecard3.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_reptilebtn3ActionPerformed

    private void reptilebtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reptilebtn4ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            d = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblreptilecard4.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_reptilebtn4ActionPerformed

    private void aquabtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquabtn1ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            e = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblaquacard1.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_aquabtn1ActionPerformed

    private void aquabtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquabtn2ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            f = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblaquacard2.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_aquabtn2ActionPerformed

    private void aquabtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquabtn3ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            g = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblaquacard3.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_aquabtn3ActionPerformed

    private void aquabtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquabtn4ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            h = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblaquacard4.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_aquabtn4ActionPerformed

    private void beastbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beastbtn1ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            j = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblbeastcard1.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
       
    }//GEN-LAST:event_beastbtn1ActionPerformed

    private void beastbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beastbtn2ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            k = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblbeastcard2.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_beastbtn2ActionPerformed

    private void beastbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beastbtn3ActionPerformed
        // TODO add your handling code here:
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            l = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblbeastcard3.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
        
    }//GEN-LAST:event_beastbtn3ActionPerformed

    private void beastbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beastbtn4ActionPerformed
        // TODO add your handling code her
        drawcardsound();
        if(energy <= 0){
            crossout();
        }else{
            m = 1;
            energy--;
            energyCounter.setText(energy+"/10");
            lblbeastcard4.setVisible(true);
            if(energy <= 0){
                crossout();
            }
        }
    }//GEN-LAST:event_beastbtn4ActionPerformed
    public void drawcardsound(){
        String drawcard = "C:\\Users\\Suenlie\\Downloads\\Deepwoken Talent Card Flip Sound Effect.wav";
        PlayMusicOnce(drawcard);
    }
    
    public void enemyAttack(){
        Random rand = new Random();
        int attack1 = rand.nextInt(2);
        int attack2 = rand.nextInt(2);
        int attack3 = rand.nextInt(2);
        int attack4 = rand.nextInt(2);
        if(stage == 1){
            if(beast.isAlive()){
                if(attack1 == 1){
                    enemy1.enemyAttack1(beast);
                    beasthealth = beast.getHealthPoints();
                    beastHealthBar.setValue(beasthealth);
                    lblbeasthp.setText("Beast: "+beasthealth);
                }

                if(attack2 == 1){
                    enemy1.enemyAttack2(beast);
                    beasthealth = beast.getHealthPoints();
                    beastHealthBar.setValue(beasthealth);
                    lblbeasthp.setText("Beast: "+beasthealth);
                }

                if(attack3 == 1){
                    enemy1.enemyAttack3(beast);
                    beasthealth = beast.getHealthPoints();
                    beastHealthBar.setValue(beasthealth);
                    lblbeasthp.setText("Beast: "+beasthealth);
                }

                if(attack4 == 1){
                    enemy1.enemyAttack4(beast);
                    beasthealth = beast.getHealthPoints();
                    beastHealthBar.setValue(beasthealth);
                    lblbeasthp.setText("Beast: "+beasthealth);
                }
            }
            else if(aqua.isAlive() && !beast.isAlive()){
                if(attack1 == 1){
                    enemy1.enemyAttack1(aqua);
                    aquahealth = aqua.getHealthPoints();
                    aquaHealthBar.setValue(aquahealth);
                    lblaquahp.setText("Aqua: "+aquahealth);
                }

                if(attack2 == 1){
                    enemy1.enemyAttack2(aqua);
                    aquahealth = aqua.getHealthPoints();
                    aquaHealthBar.setValue(aquahealth);
                    lblaquahp.setText("Aqua: "+aquahealth);
                }

                if(attack3 == 1){
                    enemy1.enemyAttack3(aqua);
                    aquahealth = aqua.getHealthPoints();
                    aquaHealthBar.setValue(aquahealth);
                    lblaquahp.setText("Aqua: "+aquahealth);
                }

                if(attack4 == 1){
                    enemy1.enemyAttack4(aqua);
                    aquahealth = aqua.getHealthPoints();
                    aquaHealthBar.setValue(aquahealth);
                    lblaquahp.setText("Aqua: "+aquahealth);
                }
            }
            else if(reptile.isAlive() && !beast.isAlive() && !aqua.isAlive()){
                if(attack1 == 1){
                    enemy1.enemyAttack1(reptile);
                    reptilehealth = reptile.getHealthPoints();
                    reptileHealthBar.setValue(reptilehealth);
                    lblreptilehp.setText("Reptile: "+reptilehealth);
                }

                if(attack2 == 1){
                    enemy1.enemyAttack2(reptile);
                    reptilehealth = reptile.getHealthPoints();
                    reptileHealthBar.setValue(reptilehealth);
                    lblreptilehp.setText("Reptile: "+reptilehealth);
                }

                if(attack3 == 1){
                    enemy1.enemyAttack3(reptile);
                    reptilehealth = reptile.getHealthPoints();
                    reptileHealthBar.setValue(reptilehealth);
                    lblreptilehp.setText("Reptile: "+reptilehealth);
                }

                if(attack4 == 1){
                    enemy1.enemyAttack4(reptile);
                    reptilehealth = reptile.getHealthPoints();
                    reptileHealthBar.setValue(reptilehealth);
                    lblreptilehp.setText("Reptile: "+reptilehealth);
                }
            }
        }else if(stage == 2){
            if(beast.isAlive()){
                if(attack1 == 1){
                    enemy2.enemyAttack1(beast);
                    beasthealth = beast.getHealthPoints();
                    beastHealthBar.setValue(beasthealth);
                    lblbeasthp.setText("Beast: "+beasthealth);
                }

                if(attack2 == 1){
                    enemy2.enemyAttack2(beast);
                    beasthealth = beast.getHealthPoints();
                    beastHealthBar.setValue(beasthealth);
                    lblbeasthp.setText("Beast: "+beasthealth);
                }

                if(attack3 == 1){
                    enemy2.enemyAttack3(beast);
                    beasthealth = beast.getHealthPoints();
                    beastHealthBar.setValue(beasthealth);
                    lblbeasthp.setText("Beast: "+beasthealth);
                }

                if(attack4 == 1){
                    enemy2.enemyAttack4(beast);
                    beasthealth = beast.getHealthPoints();
                    beastHealthBar.setValue(beasthealth);
                    lblbeasthp.setText("Beast: "+beasthealth);
                }
            }
            else if(aqua.isAlive() && !beast.isAlive()){
                if(attack1 == 1){
                    enemy2.enemyAttack1(aqua);
                    aquahealth = aqua.getHealthPoints();
                    aquaHealthBar.setValue(aquahealth);
                    lblaquahp.setText("Aqua: "+aquahealth);
                }

                if(attack2 == 1){
                    enemy2.enemyAttack2(aqua);
                    aquahealth = aqua.getHealthPoints();
                    aquaHealthBar.setValue(aquahealth);
                    lblaquahp.setText("Aqua: "+aquahealth);
                }

                if(attack3 == 1){
                    enemy2.enemyAttack3(aqua);
                    aquahealth = aqua.getHealthPoints();
                    aquaHealthBar.setValue(aquahealth);
                    lblaquahp.setText("Aqua: "+aquahealth);
                }

                if(attack4 == 1){
                    enemy2.enemyAttack4(aqua);
                    aquahealth = aqua.getHealthPoints();
                    aquaHealthBar.setValue(aquahealth);
                    lblaquahp.setText("Aqua: "+aquahealth);
                }
            }
            else if(reptile.isAlive() && !beast.isAlive() && !aqua.isAlive()){
                if(attack1 == 1){
                    enemy2.enemyAttack1(reptile);
                    reptilehealth = reptile.getHealthPoints();
                    reptileHealthBar.setValue(reptilehealth);
                    lblreptilehp.setText("Reptile: "+reptilehealth);
                }

                if(attack2 == 1){
                    enemy2.enemyAttack2(reptile);
                    reptilehealth = reptile.getHealthPoints();
                    reptileHealthBar.setValue(reptilehealth);
                    lblreptilehp.setText("Reptile: "+reptilehealth);
                }

                if(attack3 == 1){
                    enemy2.enemyAttack3(reptile);
                    reptilehealth = reptile.getHealthPoints();
                    reptileHealthBar.setValue(reptilehealth);
                    lblreptilehp.setText("Reptile: "+reptilehealth);
                }

                if(attack4 == 1){
                    enemy2.enemyAttack4(reptile);
                    reptilehealth = reptile.getHealthPoints();
                    reptileHealthBar.setValue(reptilehealth);
                    lblreptilehp.setText("Reptile: "+reptilehealth);
                }
            }
        }
    }
    
    

    
    
    public void attack(int a, int b,int c,int d,int e,int f,int g,int h,int j,int k,int l,int m){
        if(a == 1){
            if(stage == 1){
                reptile.surpriseInvasion(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                reptile.surpriseInvasion(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                reptile.surpriseInvasion(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.a=0;
        }
        
        if(b == 1){
            if(stage == 1){
                reptile.disarm(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                reptile.disarm(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                reptile.disarm(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.b=0;
        }
        
        if(c == 1){
            if(stage == 1){
                reptile.kotaroBite(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                reptile.kotaroBite(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                reptile.kotaroBite(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.c=0;
        }
        
        if(d == 1){
            if(stage == 1){
                reptile.bulkwark(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                reptile.bulkwark(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                reptile.bulkwark(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.d=0;
        }
        
        if(e == 1){
            if(stage == 1){
                aqua.riskyFish(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                aqua.riskyFish(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                aqua.riskyFish(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.e=0;
        }
        
        if(f == 1){
            if(stage == 1){
                aqua.upstream(enemy1);
                enemyHealth3 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                aqua.upstream(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                aqua.upstream(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.f=0;
        }
        
        if(g == 1){
            if(stage == 1){
                aqua.spinalTrap(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                aqua.spinalTrap(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                aqua.spinalTrap(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.g=0;
        }
        
        if(h == 1){
            if(stage == 1){
                aqua.swiftEscape(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                aqua.swiftEscape(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                aqua.swiftEscape(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.h=0;
        }
        
        if(j == 1){
            if(stage == 1){
                beast.singleCombat(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                beast.singleCombat(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                beast.singleCombat(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.j=0;
        }
        
        if(k == 1){
            if(stage == 1){
                beast.nutCracker(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                beast.nutCracker(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                beast.nutCracker(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.k=0;
        }
        
        if(l == 1){
            if(stage == 1){
                beast.nutThrow(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                beast.nutThrow(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                beast.nutThrow(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.l=0;
        }
        
        if(m == 1){
            if(stage == 1){
                beast.ivory(enemy1);
                enemyHealth1 = enemy1.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth1);
                lblenemyhp.setText("Enemy: "+enemyHealth1);
            }else if(stage == 2){
                beast.ivory(enemy2);
                enemyHealth2 = enemy2.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth2);
                lblenemyhp.setText("Enemy: "+enemyHealth2);
            }else if(stage == 3){
                beast.ivory(enemy);
                enemyHealth3 = enemy.getHealthPoints();
                enemyHealthBar.setValue(enemyHealth3);
                lblenemyhp.setText("Enemy: "+enemyHealth3);
            }
            this.m=0;
        }
    }
    
    private void btnEndturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndturnActionPerformed
        // TODO add your handling code here:
        
        
        
        lblreptilecard1.setVisible(false);
        lblreptilecard2.setVisible(false);
        lblreptilecard3.setVisible(false);
        lblreptilecard4.setVisible(false);
        
        lblaquacard1.setVisible(false);
        lblaquacard2.setVisible(false);
        lblaquacard3.setVisible(false);
        lblaquacard4.setVisible(false);
        
        lblbeastcard1.setVisible(false);
        lblbeastcard2.setVisible(false);
        lblbeastcard3.setVisible(false);
        lblbeastcard4.setVisible(false);
        
        
        enemyAttack();
        attack(a,b,c,d,e,f,g,h,j,k,l,m);
        
        
        removecrossout();
        randomgeneratecards();
        if(energy <10){
            if(energy  == 9){
                energy++;
            }else{
                energy+=2;
            }
            
        }else{
            energy = 10;
        }
        
        energyCounter.setText(energy+"/10");
        if(stage == 1){
            if(!enemy1.isAlive()){
                slp+=50;
                stage++;
                lblenemy1.setVisible(false);
                lbldead.setVisible(true);

                new YouWin(name,slp,stage).setVisible(true);
                if (musicClip != null && musicClip.isRunning()) {
                    musicClip.stop(); // Pause the music
                }
                this.setVisible(false);
            }
        }else if(stage == 2){
            if(!enemy2.isAlive()){
                slp+=50;
                stage++;
                lblenemy2.setVisible(false);
                lbldead.setVisible(true);

                new YouWin(name,slp,stage).setVisible(true);

                if (musicClip != null && musicClip.isRunning()) {
                    musicClip.stop(); // Pause the music
                }
                this.setVisible(false);
            }
        }else if(stage == 3){
            stage++;
            if(!enemy.isAlive()){
                lblenemy3.setVisible(false);
                lbldead.setVisible(true);

                new YouWin(name,slp,stage).setVisible(true);

                if (musicClip != null && musicClip.isRunning()) {
                    musicClip.stop(); // Pause the music
                }
                this.setVisible(false);
            }
        }
        
        aliveChecker();
        
        PlayMusicOnce(stopslice);
        countRound++;
        roundCounter.setText("Round "+countRound);
 
       
    }//GEN-LAST:event_btnEndturnActionPerformed

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
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adventure().setVisible(true);
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
    
    public static Clip PlayMusicOnce(String location) {
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
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar aquaHealthBar;
    private javax.swing.JButton aquabtn1;
    private javax.swing.JButton aquabtn2;
    private javax.swing.JButton aquabtn3;
    private javax.swing.JButton aquabtn4;
    private javax.swing.JLabel aquadead;
    private javax.swing.JProgressBar beastHealthBar;
    private javax.swing.JButton beastbtn1;
    private javax.swing.JButton beastbtn2;
    private javax.swing.JButton beastbtn3;
    private javax.swing.JButton beastbtn4;
    private javax.swing.JLabel beastdead;
    private javax.swing.JButton btnEndturn;
    private javax.swing.JLabel cross1;
    private javax.swing.JLabel cross10;
    private javax.swing.JLabel cross11;
    private javax.swing.JLabel cross12;
    private javax.swing.JLabel cross2;
    private javax.swing.JLabel cross3;
    private javax.swing.JLabel cross4;
    private javax.swing.JLabel cross5;
    private javax.swing.JLabel cross6;
    private javax.swing.JLabel cross7;
    private javax.swing.JLabel cross8;
    private javax.swing.JLabel cross9;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel energyCounter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblaqua;
    private javax.swing.JLabel lblaquacard1;
    private javax.swing.JLabel lblaquacard2;
    private javax.swing.JLabel lblaquacard3;
    private javax.swing.JLabel lblaquacard4;
    private javax.swing.JLabel lblaquahp;
    private javax.swing.JLabel lblbeast;
    private javax.swing.JLabel lblbeastcard1;
    private javax.swing.JLabel lblbeastcard2;
    private javax.swing.JLabel lblbeastcard3;
    private javax.swing.JLabel lblbeastcard4;
    private javax.swing.JLabel lblbeasthp;
    private javax.swing.JLabel lbldead;
    private javax.swing.JLabel lblenemy1;
    private javax.swing.JLabel lblenemy2;
    private javax.swing.JLabel lblenemy3;
    private javax.swing.JLabel lblenemyhp;
    private javax.swing.JLabel lblreptile;
    private javax.swing.JLabel lblreptilecard1;
    private javax.swing.JLabel lblreptilecard2;
    private javax.swing.JLabel lblreptilecard3;
    private javax.swing.JLabel lblreptilecard4;
    private javax.swing.JLabel lblreptilehp;
    private javax.swing.JProgressBar reptileHealthBar;
    private javax.swing.JButton reptilebtn1;
    private javax.swing.JButton reptilebtn2;
    private javax.swing.JButton reptilebtn3;
    private javax.swing.JButton reptilebtn4;
    private javax.swing.JLabel reptiledead;
    private javax.swing.JLabel roundCounter;
    // End of variables declaration//GEN-END:variables
}
