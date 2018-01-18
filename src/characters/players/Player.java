package characters.players;

import characters.Character;

public class Player extends Character{

    private int level;
    private String profession;

    public Player(String name, int level) {
        super(name);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
