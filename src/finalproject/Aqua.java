/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Suenlie
 */
class Aqua extends Character{
    public Aqua(int healthPoints){
        super(healthPoints);
    }
    
    public void riskyFish(Character target){
        int damage = 110;
        target.takeDamage(damage);
    }
    
    public void upstream(Character target){
        int damage = 110;
        target.takeDamage(damage);
    }
    
    public void spinalTrap(Character target){
        int damage = 100;
        target.takeDamage(damage);
    }
    
    public void swiftEscape(Character target){
        int damage = 110;
        target.takeDamage(damage);
    }
}