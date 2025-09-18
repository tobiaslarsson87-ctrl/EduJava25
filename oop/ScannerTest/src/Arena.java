public class Arena {
    Monster bandit = new Monster("Bandit",65, 12 ,1,25,25);
    Monster goblin = new Monster("Goblin",45, 7 ,1,15,15);
    Monster direWolf = new Monster("Dire Wolf",75, 12 ,3,35,30);
    Monster gladiator = new Monster("Gladiator",125, 15 ,5,50,50);
    Monster champion = new Monster("Champion",250, 25 ,10,100,100);
    Monster dragon = new Monster("Dragon",1000, 35 ,15,500,500);

    //Metoder för att kalla player + monster
    public void battleBandit(Player player){
        BattleScene.battle(player, bandit);
    }
}
