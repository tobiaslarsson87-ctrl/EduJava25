public class Player {
    String name;
    int lv = 1;
    int mhp = 100;
    int hp = 100;
    int atk = 10;
    int def = 10;
    int xp = 0;
    int coins = 0;
    Weapon weapon = new Weapon("Unarmed",0);
    Armor armor = new Armor("Naked",0);

    Player(String name) {
        this.name = name;
    }
    public void logStats(){
        System.out.println("--------------------------");
        System.out.println("CHARACTER INFORMATION");
        System.out.println("--------------------------");
        System.out.println("Name: " + name);
        System.out.println("Level: " + lv);
        System.out.println("HP: " + hp + "/" + mhp);
        System.out.println("Atk: " + atk);
        System.out.println("Def: " + def);
        System.out.println("XP: " + xp);
        System.out.println("--------------------------");
        System.out.println("INVENTORY LIST");
        System.out.println("--------------------------");
        System.out.println("COINS: " + this.coins);
        System.out.println("WEAPON SLOT: " + this.weapon.name);
        System.out.println("ARMOR SLOT: " + this.armor.name);
        System.out.println("--------------------------");
    }
    public void giveCoins(int coins){
        this.coins += coins;
    }
    public void giveXp(int xp){
        this.xp += xp;
        this.xpCheck();
    }
    public void xpCheck(){
        //DEBUG
        System.out.println("xpCheck INITIALIZED");
        //DEBUG
        //lv2
        if(this.xp >= 100 && this.lv < 2){
            this.levelUp();
        }
        //lv3
        if(this.xp >= 250 && this.lv < 3){
            this.levelUp();
        }
        //lv4
        if(this.xp >= 450 && this.lv < 4){
            this.levelUp();
        }
        //lv5
        if(this.xp >= 700 && this.lv < 5){
            this.levelUp();
        }
        //lv6
        if(this.xp >= 1000 && this.lv < 6){
            this.levelUp();
        }
    }
    public void recover(){
        this.hp = this.mhp;
        System.out.println("HP recovered");
    }
    public void damage(int damage){
        this.hp = this.hp - (damage - this.def);
        System.out.println(this.name + " took " + damage + " damage!");
    }
    public void levelUp(){
        this.lv = this.lv + 1;
        this.mhp = this.mhp + this.mhp /10;
        this.hp = this.mhp;
        this.atk = this.atk + 2;
        this.def = this.def + 2;
        System.out.println(this.name + " levels up!");
    }
    public void removeWeapon(){
        this.atk = this.atk - this.weapon.bonus;
        this.weapon = new Weapon("Unarmed",0);
    }
    public void removeArmor() {
        this.def = this.def - this.armor.bonus;
        this.armor = new Armor("Naked",0);
    }
    public void equipWeapon(Weapon addWpn){
        this.atk = this.atk + addWpn.bonus;
        this.weapon = addWpn;
    }
    public void equipArmor(Armor addArm){
        this.def = this.def + addArm.bonus;
        this.armor = addArm;
    }
}
