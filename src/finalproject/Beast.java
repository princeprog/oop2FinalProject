/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Suenlie
 */
public class Beast extends Character{
    public Beast(int healthPoints){
        super(healthPoints);
    }
    
    public void singleCombat(Character target){
        int damage = 79;
        target.takeDamage(damage);
    }
    
    public void nutCracker(Character target){
        int damage = 119;
        target.takeDamage(damage);
    }
    
    public void nutThrow(Character target){
        int damage = 119;
        target.takeDamage(damage);
    }
    
    public void ivory(Character target){
        int damage = 59;
        target.takeDamage(damage);
    }
}
