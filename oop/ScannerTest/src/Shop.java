import java.util.Scanner;

public class Shop {
    //WEAPONS
    Weapon dagger = new Weapon("Dagger", 7);
    Weapon shortSword = new Weapon("Short Sword", 14);
    Weapon greatSword = new Weapon("Great Sword", 28);
    //ARMORS
    Armor huntersTunic = new Armor("Hunters Tunic", 3);
    Armor chainMail = new Armor("Chain Mail", 6);
    Armor plateArmor = new Armor("Plate Armor", 12);

    public void call(Player player) {
        System.out.println("--------------");
        System.out.println("EQUIPMENT SHOP");
        System.out.println("--------------");
        System.out.println("[0] Exit");
        System.out.println("[1] Dagger - 50 Coins");
        System.out.println("[2] Short Sword - 200 Coins");
        System.out.println("[3] Great Sword - 800 Coins");
        System.out.println("[4] Hunters Tunic - 25 Coins");
        System.out.println("[5] Chain Mail - 125 Coins");
        System.out.println("[6] Plate Armor - 625 Coins");
        System.out.println("[7] Healthcare - 15 Coins");

        Scanner input = new Scanner(System.in);
        int shopOption =  input.nextInt();

        switch (shopOption){
            case 0:
                break;
            case 1:
                if (player.coins >= 50){
                    player.coins = player.coins - 50;
                    player.equipWeapon(dagger);
                    System.out.println("You purchased " + dagger.name +"!");
                }
                else{
                    System.out.println("Not enough coins");
                }
                break;
            case 2:
                if (player.coins >= 200){
                    player.coins = player.coins - 200;
                    player.equipWeapon(shortSword);
                    System.out.println("You purchased " + shortSword.name +"!");
                }
                else{
                    System.out.println("Not enough coins");
                }
                break;
            case 3:
                if (player.coins >= 800){
                    player.coins = player.coins - 800;
                    player.equipWeapon(greatSword);
                    System.out.println("You purchased " + greatSword.name +"!");
                }
                else{
                    System.out.println("Not enough coins");
                }
        }
    }
}

