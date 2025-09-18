public class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }
    //Kolla pengar på account
    public void getBalance(){
        System.out.println("Your balance is: " + balance);
    }
    //Ta ut pengar
    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            this.balance -= amount;
            System.out.println("Your withdrawal: " + amount + " New Balance " + balance);
        }
        else{
            System.out.println("Prohibited value and/or Insufficient funds.");
        }
    }
    //Sätt in pengar
    public void deposit(int amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("Your deposit: " + amount + " New Balance " + balance);
        }
        else{
            System.out.println("You can not deposit negative amounts.");
        }
    }
    private boolean something(double nr){
        return false;
    }

    private boolean something2(double nr){
        return false;
    }
}
