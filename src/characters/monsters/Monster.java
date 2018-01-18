package characters.monsters;

import characters.Character;

public class Monster extends Character {

    private int experience;

    public Monster(String name) {
        super(name);
    }

    public Monster(String name, int hp, int experience, int attackFactor, int defence) {
        super(name, hp, attackFactor, defence);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}
