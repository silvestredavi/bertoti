import Armor.ArmorDamageReduction;
import Damage.PowerDamage;

import java.io.Serializable;
import java.util.OptionalDouble;

public class SuperHero {
    private final String name;
    public int totalLife;
    public int damageSuffered;
    private Power power;
    private PowerDamage powerDamage;
    private ArmorDamageReduction damageReduction;
    public SuperHero(String name, Power power, PowerDamage powerDamage, ArmorDamageReduction damageReduction, int totalLife, int damageSuffered){
        this.name = name;
        this.power = power;
        this.powerDamage = powerDamage;
        this.damageReduction = damageReduction;
        this.totalLife = totalLife;
        this.damageSuffered = damageSuffered;
    }
    public Power getPower(){
        return power;
    }
    public String getName(){
        return name;
    }
    public double getDamageReduction(){
        return damageReduction.reductionDamage();
    }
    void setTotalLife(int totalLife){
        this.totalLife = totalLife;
    }
    void setDamageSuffered(int damageSuffered){
        this.damageSuffered = damageSuffered;
    }
    int getTotalLife(){
        return this.totalLife;
    }
    int getDamageSuffered(){
        return this.damageSuffered;
    }

    public int attack(double armorDamageReduction){
        int damageStrength = powerDamage.damage();
        double armorStrength = armorDamageReduction;
        int totalDamage = damageStrength;

        if(totalDamage == 100) {
            totalDamage = (int)(totalDamage - (totalDamage * armorStrength / 100));
            if(armorStrength > 20.0){
                System.out.println("O oponente sofreria uma redução de 100 em sua vida total, porém ele vestia uma armadura contra dano verdadeiro, " +
                        "por isso o dano foi reduzido em 20.5%, e o dano foi de " + totalDamage + " pontos de vida.");
            } else if(armorStrength > 16.0) {
                System.out.println("O oponente sofreria uma redução de 100 em sua vida total, porém ele vestia uma armadura contra dano físico, " +
                        "por isso o dano foi reduzido em 16.5%, e o dano foi de " + totalDamage + " pontos de vida.");
            } else {
                System.out.println("O oponente sofreria uma redução de 100 em sua vida, porém ele vestia uma armadura contra dano mágico, " +
                        "por isso o dano foi reduzido em 13.5%, e o dano foi de " + totalDamage + " pontos de vida.");
            }

        } else if (totalDamage == 80) {

            totalDamage = (int)(totalDamage - (totalDamage * armorStrength / 100));
            if(armorStrength > 20.0){
                System.out.println("O oponente sofreria uma redução de 80 em sua vida total, porém ele vestia uma armadura contra dano verdadeiro, " +
                        "por isso o dano foi reduzido em 20.5%, e o dano foi de " + totalDamage + " pontos de vida.");
            } else if(armorStrength > 16.0) {
                System.out.println("O oponente sofreria uma redução de 80 em sua vida total, porém ele vestia uma armadura contra dano físico, " +
                        "por isso o dano foi reduzido em 16.5%, e o dano foi de " + totalDamage + " pontos de vida.");
            } else {
                System.out.println("O oponente sofreria uma redução de 80 em sua vida, porém ele vestia uma armadura contra dano mágico, " +
                        "por isso o dano foi reduzido em 13.5%, e o dano foi de " + totalDamage + " pontos de vida.");
            }

        } else {
            totalDamage = (int)(totalDamage - (totalDamage * armorStrength / 100));
            if(armorStrength > 20.0){
                System.out.println("O oponente sofreria uma redução de 60 em sua vida total, porém ele vestia uma armadura contra dano verdadeiro, " +
                        "por isso o dano foi reduzido em 20.5%, e o dano foi de " + totalDamage + " pontos de vida.");
            } else if(armorStrength > 16.0) {
                System.out.println("O oponente sofreria uma redução de 60 em sua vida total, porém ele vestia uma armadura contra dano físico, " +
                        "por isso o dano foi reduzido em 16.5%, e o dano foi de " + totalDamage +  "pontos de vida.");
            } else {
                System.out.println("O oponente sofreria uma redução de 60 em sua vida, porém ele vestia uma armadura contra dano mágico, " +
                        "por isso o dano foi reduzido em 13.5%, e o dano foi de " + totalDamage + " pontos de vida.");
            }
        }
        return totalDamage;
    }

}