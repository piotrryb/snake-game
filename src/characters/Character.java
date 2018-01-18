package characters;

public class Character {

    private String name;
    private int hp;
    private int attackFactor;
    private int defence;

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, int hp, int attackFactor, int defence) {
        this.name = name;
        this.hp = hp;
        this.attackFactor = attackFactor;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackFactor() {
        return attackFactor;
    }

    public void setAttackFactor(int attackFactor) {
        this.attackFactor = attackFactor;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
