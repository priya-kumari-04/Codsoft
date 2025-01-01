import java.util.Scanner;

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("\n===============================");
        System.out.println("    Welcome to Your ATM Machine!");
        System.out.println("===============================");
        System.out.println("1. Withdraw Cash");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Account Balance");
        System.out.println("4. Exit");
        System.out.println("===============================");
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much would you like to withdraw? $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Oops! Please enter a positive number to withdraw.");
        } else if (bankAccount.withdraw(amount)) {
            System.out.println("Success! You have withdrawn $" + amount + ". Your current balance is $" + bankAccount.checkBalance());
        } else {
            System.out.println("Sorry, you don't have enough funds for this transaction.");
        }
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much would you like to deposit? $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Oops! Please enter a positive number to deposit.");
        } else {
            bankAccount.deposit(amount);
            System.out.println("Awesome! You have deposited $" + amount + ". Your current balance is $" + bankAccount.checkBalance());
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + bankAccount.checkBalance());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Please select an option (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM! Come back soon. 😊");
                    return;
                default:
                    System.out.println("Hmm, that option doesn't exist. Please choose a valid number between 1 and 4.");
            }
        }
    }
}
