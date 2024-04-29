/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author Suenlie
 */
class Enemy extends Character{
    public Enemy(int healthPoints){
        super(healthPoints);
    }
    
    public void enemyAttack1(Character target){
        int damage = 89;
        target.takeDamage(damage);
    }
    
    public void enemyAttack2(Character target){
        int damage = 76;
        target.takeDamage(damage);
    }
    
    public void enemyAttack3(Character target){
        int damage = 81;
        target.takeDamage(damage);
    }
    
    public void enemyAttack4(Character target){
        int damage = 120;
        target.takeDamage(damage);
    }
}
