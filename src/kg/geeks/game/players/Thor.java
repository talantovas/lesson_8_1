package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, name,SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean isBlink = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && isBlink == true) {
                boss.setDamage(0);
                System.out.println("Босс оглушен");
            } else {
                boss.setDamage(50);
            }
            break;
        }
    }
}
