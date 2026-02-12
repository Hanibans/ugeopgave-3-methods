public class opgave1 {
    double balance;
    String accountName;

    void deposit100() {
        balance += 100;
    }

    void withdraw50() {
        balance -= 50;
    }

    void printBalance() {
        System.out.println("Account name: " + accountName);
        System.out.println("Balance: " + balance);
    }

    void main() {
        accountName = "Hannah";
        deposit100();
        deposit100();
        withdraw50();
        printBalance();
    }
}
