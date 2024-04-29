/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Suenlie
 */
abstract class Character{
    int healthPoints;
    
    public Character(int healthPoints){
        this.healthPoints = healthPoints;
    }
    
    public int getHealthPoints(){
        return healthPoints;
    }
    
    public boolean isAlive(){
        if(healthPoints <= 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void takeDamage(int damage){
        healthPoints-=damage;
        if(healthPoints < 0){
            healthPoints = 0;
        }
    }
}
