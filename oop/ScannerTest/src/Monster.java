public class Monster {
    String name;
    int hp;
    int atk;
    int def;
    int coinReward;
    int xpReward;

    Monster (String name, int hp, int atk, int def, int coinReward, int xpReward) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.coinReward = coinReward;
        this.xpReward = xpReward;
    }
    public void damage(int damage){
        this.hp = this.hp - (damage - this.def);
        System.out.println(this.name + " took " + damage + " damage!");
    }
}
