/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Suenlie
 */
public class Reptile extends Character{
    public Reptile(int healthPoints){
        super(healthPoints);
    }
    
    public void surpriseInvasion(Character target){
        int damage = 98;
        target.takeDamage(damage);
    }
    
    public void disarm(Character target){
        int damage = 109;
        target.takeDamage(damage);
    }
    
    public void kotaroBite(Character target){
        int damage = 79;
        target.takeDamage(damage);
    }
    
    public void bulkwark(Character target){
        int damage = 20;
        target.takeDamage(damage);
    }
}
