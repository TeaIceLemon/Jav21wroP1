package sda.com.PoorCounterStrike;

public class Gun {
    private Weapon weapon;
    private int ammo;
    private int dmg;

    public Gun() {
        this.weapon = Weapon.Pistol;
        this.ammo = 7;
        this.dmg = 10;
    }

    public void setWeapon(Weapon weapon){
        if(weapon == Weapon.Pistol){
            this.weapon = Weapon.Pistol;
            this.ammo = 10;
            this.dmg = 10;
        }
        if(weapon == Weapon.Shotgun){
            this.weapon = Weapon.Shotgun;
            this.ammo = 2;
            this.dmg = 50;
        }
        if(weapon == Weapon.Rifle){
            this.weapon = Weapon.Rifle;
            this.ammo = 10;
            this.dmg = 20;
        }
    }

    public int getAmmo() {
        return ammo;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getDmg() {
        return dmg;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "weapon=" + weapon +
                ", ammo=" + ammo +
                ", dmg=" + dmg +
                '}';
    }
}
