package sda.com.Games.PoorDarkSoulsGame;

public class Monster {
    private int lvl;

    public Monster() {
        this.lvl = 1;
    }
    public void lvlUp(){
        setLvl(lvl+1);
    }
    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
