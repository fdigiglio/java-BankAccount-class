public class BankAccount {

    // Instance Variables
    private double balance;
    private double interest;

    // Constructors
    public BankAccount(){
        //Default Values
    }

    
    public BankAccount(double pBalance, double pInterest){
        this.balance = pBalance;
        this.interest = pInterest;
    }

    // Methods

    //Setter Method 
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    //Check Balance Getter Method
    public double getBalance(){
        return this.balance;
    }

    //Deposit Setter Method
    public void depositMoney(double amountOfDeposit){
        this.balance += amountOfDeposit;
    }

    //Withdraw Setter Method
    public void withdrawMoney(double amountOfWithdrawl){
        this.balance -= amountOfWithdrawl;
    }

    public double calcInterest(){
        return this.balance * this.interest;
    }
}