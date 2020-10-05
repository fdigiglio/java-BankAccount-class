// Import Scanner Class
import java.util.Scanner;
public class BankDemo {

    public static void main(String[] args) {
        
        // Initialize BankAccount Object
        BankAccount chase = new BankAccount(0, 1.5);

        //Asks to input starting balance
        System.out.println("Please enter starting balance: ");
        
        //Scanner Class Declaration
        Scanner input = new Scanner(System.in);
        int startingBalanceInput = input.nextInt();
        chase.setBalance(startingBalanceInput);

        //Prints out your option
        System.out.println("Would you like to 1) Deposit, 2) Withdraw, 3) Calculate Interest or 4) Quit?");
        int optionInput = input.nextInt();

        //Conditional Statements checking which option inorder to continue
        if (optionInput == 1){
            System.out.println("How much would you like to deposit?");
        }

        if (optionInput == 2){
            System.out.println("How much would you like to withdraw?");
        }
        
        if (optionInput == 3){
            System.out.println("Your interest total is: " + chase.calcInterest());
        }

        if (optionInput == 4) {
            System.out.println("Good bye!");
            System.exit(0);
        }

        //Input to continue with the deposit and withdraw option
        int amountInput = input.nextInt();
        if (optionInput == 1){
            chase.depositMoney(amountInput);
        }

        if (optionInput == 2){
            chase.withdrawMoney(amountInput);
        }

        //Prints total balance
        System.out.println("Your total balance is " + chase.getBalance());
       

    }
}
