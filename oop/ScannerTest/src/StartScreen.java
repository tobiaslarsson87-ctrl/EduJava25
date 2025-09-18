import java.util.Scanner;

public class StartScreen {
    //Metod för att skapa en spelare
    public static Player createPlayer(){
        boolean playerCreation = true;
        Scanner input = new Scanner(System.in);
        String playerName;
        while (playerCreation) {
            System.out.println("-----------------------");
            System.out.println("Skriv ditt namn: ");
            System.out.println("-----------------------");

            playerName = input.nextLine(); //Användaren skriver sitt namn

            System.out.println("Ditt namn är: " + playerName + " stämmer det?");
            System.out.println("[Y] [N]");

            String answer = input.nextLine(); //Användaren väljer att gå vidare med namn

            if (answer.equalsIgnoreCase("Y")) {
                System.out.print("Du har valt namnet: " + playerName);
                Player player = new Player(playerName); //Player Object Skapas
                return player; //Returnera Objektet, BÖR FUNGERA SOM BREAK
            }
        }
        return null; // Hate this!!!
    }
}
