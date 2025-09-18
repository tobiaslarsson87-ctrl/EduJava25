import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //MAIN: Används för tillfället enbart för att testa saker.
        Player player = StartScreen.createPlayer();
        System.out.println("\n"); //Line Break
        //MAIN GAME LOOP START
        Arena arena = new Arena();
        arena.battleBandit(player);
        boolean mainLoop = true;
        Scanner input = new Scanner(System.in);
        while (mainLoop) {
            System.out.println("What do you want to do?");
            System.out.println("[0] Quit Game [1] Show Stats [2] Visit Shop [3] Visit Arena");
            int choise = input.nextInt();
            if (choise == 0) {
                mainLoop = false;
            }
        }
    }
}
