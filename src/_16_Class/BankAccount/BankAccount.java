package _16_Class.BankAccount;

public class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
        System.out.printf("계좌가 개설되었습니다. 현재 잔액 : %d원\n", this.balance);
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        if (money > 0) {
            balance += money;
            System.out.printf("계좌에 %d원이 입급되었습니다. 현재 잔액 : %d원\n",money,balance);
        } else {
            System.out.println("입금 금액이 0원보다 커야합니다.");
        }
    }

    public  void withdraw(int money) {
        if (money <= 0) {
            System.out.println("출금 금액이 0원보다 커야합니다.");
        } else if (money > balance) {
            System.out.printf("잔액이 부족합니다. 현재 잔액 : %d원\n",balance);
        } else {
            balance -= money;
            System.out.printf("%d원이 출금되었습니다. 현재 잔액 : %d원\n", money, balance);
        }
    }
}
