import Armor.FullArmor;
import Armor.MagicArmor;
import Armor.PhysicalArmor;
import Damage.MagicDamage;
import Damage.PhysicalDamage;
import Damage.PowerDamage;
import Damage.TrueDamage;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("INÍCIO DA BATALHA");
        System.out.println("Todos os super-heróis iniciam a batalha com 500 pontos de vida!");
        System.out.println("-----------------------------------------------------------------");

        SuperHero thor = new SuperHero("Thor", Power.SPOKE, new MagicDamage(), new MagicArmor(), 500, 0);
        SuperHero iceman = new SuperHero("IceMan", Power.ICE, new PhysicalDamage(), new PhysicalArmor(), 500, 0);
        SuperHero superman = new SuperHero("SuperMan", Power.SPOKE, new TrueDamage(), new FullArmor(), 500, 0);

        ArrayList<SuperHero> heroes = new ArrayList<>(
                Arrays.asList(thor, iceman, superman)
        );

        for (SuperHero hero: heroes){
            if(hero.getName() == "Thor") {
                System.out.println(hero.getName() + " ataca SuperMan!!");
                System.out.println("--------------------------------------------");
                int attack = hero.attack(superman.getDamageReduction());
                superman.setTotalLife(superman.getTotalLife() - attack);
                superman.setDamageSuffered(superman.getDamageSuffered() + attack);

                System.out.println("--------------------------------------------");
                System.out.println(hero.getName() + " ataca IceMan!!");
                System.out.println("--------------------------------------------");
                attack = hero.attack(iceman.getDamageReduction());
                iceman.setTotalLife(iceman.getTotalLife() - attack);
                iceman.setDamageSuffered(iceman.getDamageSuffered() + attack);
                System.out.println("--------------------------------------------");
            } else if (hero.getName() == "IceMan"){
                System.out.println(hero.getName() + " ataca SuperMan!!");
                System.out.println("--------------------------------------------");
                int attack = hero.attack(superman.getDamageReduction());
                superman.setTotalLife(superman.getTotalLife() - attack);
                superman.setDamageSuffered(superman.getDamageSuffered() + attack);

                System.out.println("--------------------------------------------");
                System.out.println(hero.getName() + " ataca Thor!!");
                System.out.println("--------------------------------------------");
                attack = hero.attack(thor.getDamageReduction());
                thor.setTotalLife(thor.getTotalLife() - attack);
                thor.setDamageSuffered(thor.getDamageSuffered() + attack);
                System.out.println("--------------------------------------------");
            } else {
                System.out.println(hero.getName() + " ataca Thor!!");
                System.out.println("--------------------------------------------");
                int attack = hero.attack(thor.getDamageReduction());
                thor.setTotalLife(thor.getTotalLife() - attack);
                thor.setDamageSuffered(thor.getDamageSuffered() + attack);

                System.out.println("--------------------------------------------");
                System.out.println(hero.getName() + " ataca IceMan!!");
                System.out.println("--------------------------------------------");
                attack = hero.attack(iceman.getDamageReduction());
                iceman.setTotalLife(iceman.getTotalLife() - attack);
                iceman.setDamageSuffered(iceman.getDamageSuffered() + attack);
                System.out.println("--------------------------------------------");
            }

        }


        int damageSuperMan = superman.getDamageSuffered();
        int damageIceMan = iceman.getDamageSuffered();
        int damageThor = thor.getDamageSuffered();

        System.out.println("O SuperMan sofreu " + damageSuperMan + " de dano, o IceMan sofreu "+ damageIceMan +", já Thor sofreu "+damageThor+". " +
                "No final da batalha a vida do SuperMan ficou em "+ superman.getTotalLife() + " pontos, a vida do IceMan em " + iceman.getTotalLife() + " pontos e " +
                "a do Thor em " + thor.getTotalLife() + " pontos.");





    }

}