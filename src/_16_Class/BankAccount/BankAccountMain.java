package _16_Class.BankAccount;

/*
BankAccount 클래스에서 속성으로 balance 선언
balance는 private으로 제한
해당 객체를 생성할 때 balance에 값 주입
객체가 생성될 때 "계좌가 개설되었습니다. 현재 잔액 : **원" 출력이 되도록
balance의 값을 볼 수 있게 get만들기
method로 deposit, withdraw 만들기
deposit : 입금 금액이 0원 이상일 때 입금이 가능하도록
입금이 되었을 때 "계좌에 **원이 입금되었습니다. 현재 잔액 : **원" 출력
withdraw : 출금 금액이 0원 초과이면서 balance 보다 크지 않도록
출금액이 0원 초과되지 않으면 "출금액은 0원 초과이어야 합니다" 출력
츌금액이 잔액보다 많을 경우 "잔액이 부족합니다. 현재 잔액 : *원" 출력
메인에서 계좌 개설 후 한번씩 다 테스트 해보기
 */

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(20000);

        System.out.println(b1.getBalance());

        b1.deposit(-100);
        b1.deposit(10000);

        b1.withdraw(50000);
        b1.withdraw(20000);
    }
}
