package Question3;

public class SavingAccount extends BankAccount {

    @Override
    public void withdraw(){
    int amount=110;
    if(amount<100){
        System.out.println("minimum balance");
    }else {
        System.out.println("insufficient balance");
    }
    }

    public static void main(String[] args) {
      SavingAccount with = new SavingAccount();
      with.withdraw();
    }
}
