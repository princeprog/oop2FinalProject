/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Suenlie
 */
public class Players {
    String name;
    int stage,slp;
    public Players(String name, int stage, int slp){
        this.name = name;
        this.stage = stage;
        this.slp = slp;
    }
    
    public String getName(){
        return name;
    }
    
    public int getStage(){
        return stage;
    }
    
    public int getSlp(){
        return slp;
    }
    
    
}
