// =============================================================
//  Multithreaded Banking Transaction System — Single File
// =============================================================

// ── Class 1: Shared Bank Account ─────────────────────────────
class BankAccount {

    private double balance;
    private final String accountId;

    public BankAccount(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance   = initialBalance;
    }

    public synchronized void deposit(double amount, String threadName) {
        if (amount <= 0) return;
        System.out.printf("[%-15s] DEPOSIT  Rs.%-7.0f | Before: Rs.%.2f%n", threadName, amount, balance);
        balance += amount;
        System.out.printf("[%-15s] DEPOSIT  Rs.%-7.0f | After : Rs.%.2f%n", threadName, amount, balance);
    }

    public synchronized boolean withdraw(double amount, String threadName) {
        if (amount <= 0) return false;
        System.out.printf("[%-15s] WITHDRAW Rs.%-7.0f | Before: Rs.%.2f%n", threadName, amount, balance);
        if (amount > balance) {
            System.out.printf("[%-15s] X FAILED  Rs.%-7.0f | Insufficient funds%n", threadName, amount);
            return false;
        }
        balance -= amount;
        System.out.printf("[%-15s] WITHDRAW Rs.%-7.0f | After : Rs.%.2f%n", threadName, amount, balance);
        return true;
    }

    public synchronized double getBalance() { return balance; }
    public String getAccountId()            { return accountId; }
}


// ── Class 2: Deposit Thread ───────────────────────────────────
class DepositThread extends Thread {

    private final BankAccount account;
    private final double[]    amounts;
    private final int         delayMs;

    public DepositThread(String name, BankAccount account, double[] amounts, int delayMs) {
        super(name);
        this.account = account;
        this.amounts = amounts;
        this.delayMs = delayMs;
    }

    @Override
    public void run() {
        for (double amount : amounts) {
            account.deposit(amount, getName());
            try { Thread.sleep(delayMs); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); break; }
        }
    }
}


// ── Class 3: Withdrawal Thread ────────────────────────────────
class WithdrawalThread extends Thread {

    private final BankAccount account;
    private final double[]    amounts;
    private final int         delayMs;
    private int successCount = 0, failureCount = 0;

    public WithdrawalThread(String name, BankAccount account, double[] amounts, int delayMs) {
        super(name);
        this.account = account;
        this.amounts = amounts;
        this.delayMs = delayMs;
    }

    @Override
    public void run() {
        for (double amount : amounts) {
            if (account.withdraw(amount, getName())) successCount++;
            else                                     failureCount++;
            try { Thread.sleep(delayMs); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); break; }
        }
    }

    public int getSuccessCount() { return successCount; }
    public int getFailureCount() { return failureCount; }
}


// ── Class 4: Main Driver (public class must match filename) ───
public class BankingSimulation {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount("ACC-001", 10_000.00);

        System.out.println("=".repeat(60));
        System.out.println("   Multithreaded Banking Transaction System");
        System.out.printf ("   Account: %s  |  Opening Balance: Rs.%.2f%n",
                account.getAccountId(), account.getBalance());
        System.out.println("=".repeat(60));

        DepositThread    d1 = new DepositThread   ("Deposit-D1",  account, new double[]{2000, 1500, 1500}, 100);
        DepositThread    d2 = new DepositThread   ("Deposit-D2",  account, new double[]{1000, 2000},       150);
        WithdrawalThread w1 = new WithdrawalThread("Withdraw-W1", account, new double[]{3000, 2000, 1000}, 120);
        WithdrawalThread w2 = new WithdrawalThread("Withdraw-W2", account, new double[]{2000, 1500, 500},  80);

        System.out.println("\n--- Transactions starting ---\n");
        d1.start(); w1.start(); d2.start(); w2.start();

        // join() ensures main() waits for all threads before printing final balance
        d1.join(); d2.join(); w1.join(); w2.join();

        System.out.println("\n" + "=".repeat(60));
        System.out.println("   FINAL SUMMARY");
        System.out.println("=".repeat(60));
        System.out.printf("W1 -> Succeeded: %d | Failed: %d%n", w1.getSuccessCount(), w1.getFailureCount());
        System.out.printf("W2 -> Succeeded: %d | Failed: %d%n", w2.getSuccessCount(), w2.getFailureCount());
        System.out.println("-".repeat(60));
        System.out.printf("FINAL BALANCE : Rs.%.2f%n", account.getBalance());
        System.out.println("=".repeat(60));
    }
}
