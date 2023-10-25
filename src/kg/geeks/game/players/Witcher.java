package kg.geeks.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.EXPERIENCE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && !heroes[i].equals(this)) {
                int life = heroes[i].getHealth();
                heroes[i].setHealth(life + this.getHealth());
                System.out.println("witcher оживил героя");
                this.setHealth(0);
                break;
            }
        }
    }
}
